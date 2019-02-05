package bbro.mkquiz.test;

import bbro.mkquiz.section.Section;
import bbro.mkquiz.section.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo repo;

    @Autowired
    private SectionService sectionService;

    public String saveQuiz(Test test){
        repo.save(test);
        return test.toString() + " has been added successfully!";
    }
    public List<Test> getAll(){
        return repo.findAll();
    }

    public String addAll(List<Test> tests){
        repo.saveAll(tests);
        return tests.toString()+" have been uploaded successfully!";
    }
    public String deleteQuiz(Test test){
        repo.delete(test);
        return test.toString()+ " has been deleted successfully!";
    }
    public Test findById(int id){return repo.findById(id);}

    public Test findByTestNumber(int testNumber){return repo.findByTestNumber(testNumber);}

    public String nestedSave(Test test){
        sectionService.nestedSave(test.getSection());
        test.setSection(sectionService.findByName(test.getSection().getSectionName()));
        repo.save(test);
        return test.toString() + " has been added successfully!";
    }
    public List<Test> findAllBySection(Section section){
        return repo.findAllBySection(section);
    }

}
