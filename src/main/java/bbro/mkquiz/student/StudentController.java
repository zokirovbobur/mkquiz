package bbro.mkquiz.student;

import bbro.mkquiz.section.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private SectionService sectionService;

    @GetMapping
    public StudentSample sample(){return new StudentSample();}

    @GetMapping("all")
    public List<Student> getAll(){return studentService.findAll();}

    @PostMapping
    public void postStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @PostMapping("nested")
    public void postNestedStudent(@RequestBody Student student){
        sectionService.nestedSave(student.getSection());
        student.setSection(sectionService.findByName(student.getSection().getSectionName()));
        studentService.saveNestedStudent(student);}



}
