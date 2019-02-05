package bbro.mkquiz.section;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("section")
public class SectionController {

    @Autowired
    private SectionService service;

    @GetMapping
    public SectionSample sample(){return new SectionSample();}
    @PostMapping
    public String post(@RequestBody Section section){
       return service.saveSection(section);
    }
    @GetMapping("all")
    public List<Section> getAll(){return service.getAll();}

    @DeleteMapping
    public String deleteCategory(@RequestBody Section section){return service.deleteSection(section);}


    @PostMapping("all")
    public String postAll(@RequestBody List<Section> sections){
        return service.addAll(sections);
    }
    @GetMapping("byId/{id}")
    public Section getById(@PathVariable int id){return service.findById(id);}
    @PostMapping("nested")
    public String nestedPost(@RequestBody Section section){return service.nestedSave(section);}
    @GetMapping("byName/{name}")
    public Section byName(@PathVariable String name){return service.findByName(name);}
}
