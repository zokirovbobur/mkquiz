package bbro.mkquiz.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping
    public SubjectSample sample(){return new SubjectSample();}
    @PostMapping
    public String post(@RequestBody Subject subject){
       return service.saveSubject(subject);
    }
    @GetMapping("all")
    public List<Subject> getAll(){return service.getAll();}

    @DeleteMapping
    public String deleteCategory(@RequestBody Subject subject){return service.deleteCategory(subject);}


    @PostMapping("all")
    public String postAll(@RequestBody List<Subject> subjects){
        return service.addAll(subjects);
    }
    @GetMapping("byId/{id}")
    public Subject getById(@PathVariable int id){return service.findById(id);}

    @PostMapping("nested")
    public String nestedPost(@RequestBody Subject subject){
        return service.nestedSave(subject);
    }

    @GetMapping("byName/{name}")
    public Subject byName(@PathVariable String name){return service.findByName(name);}
}
