package bbro.mkquiz.student;

import bbro.mkquiz.section.SectionService;
import bbro.mkquiz.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    @Autowired
    private SectionService sectionService;
    @Autowired
    private TestService testService;

    public List<Student> findAll(){return repo.findAll();}

    public void saveStudent(@RequestBody Student student){
        int testId,givenAnswer,correctAnswer;
        int correctAnswers[]= new int[student.getAnswers().size()];
        int cAindex=0;
        for (int i =0; i<student.getAnswers().size();i++){
            testId = student.getAnswers().get(i).getTest().getId();
            givenAnswer = student.getAnswers().get(i).getGivenAnswer();
            correctAnswer = testService.findById(testId).getCorrectAnswer();
            if(givenAnswer == correctAnswer){
                correctAnswers[cAindex] = givenAnswer;
            }
        }
        repo.save(student);
    }

    public void saveNestedStudent(@RequestBody Student student){
        sectionService.nestedSave(student.getSection());
        student.setSection(sectionService.findByName(student.getSection().getSectionName()));
        repo.save(student);
    }

}
