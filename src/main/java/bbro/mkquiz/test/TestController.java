package bbro.mkquiz.test;

import bbro.mkquiz.section.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping
    public TestSample sample(){return new TestSample();}
    @PostMapping
    public String post(@RequestBody Test test){
       return service.saveQuiz(test);
    }
    @GetMapping("all")
    public List<Test> getAll(){return service.getAll();}

    @DeleteMapping
    public String deleteCategory(@RequestBody Test test){return service.deleteQuiz(test);}

    @PostMapping("all")
    public String postAll(@RequestBody List<Test> tests){
        return service.addAll(tests);
    }
    @GetMapping("byId/{id}")
    public Test getById(@PathVariable int id){return service.findById(id);}

    @PostMapping("nested")
    public String nestedPost(@RequestBody Test test){return service.nestedSave(test);}
    @GetMapping("byNumber/{num}")
    public Test byName(@PathVariable int num){return service.findByTestNumber(num);}
    @GetMapping("bySection")
    public List<Test> getAllBySection(@RequestBody Section section){return service.findAllBySection(section);}

}
