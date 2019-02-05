package bbro.mkquiz.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping
    public CategorySample sample(){return new CategorySample();}

    @PostMapping
    public String addCategory(@RequestBody Category category){return service.saveCategory(category);}

    @DeleteMapping
    public String deleteCategory(@RequestBody Category category){return service.deleteCategory(category);}

    @GetMapping("all")
    public List<Category> getAll(){return service.getAll();}

    @PostMapping("all")
    public String postAll(@RequestBody List<Category> categories){
        return service.addAll(categories);
    }
    @GetMapping("byId/{id}")
    public Category getById(@PathVariable int id){return service.findById(id);}
    @GetMapping("byName/{name}")
    public Category getByName(@PathVariable String name){return service.findByName(name);}

    //post data using params
    @PostMapping("string")
    public String postCategoryByParams(@RequestParam String string){
        System.out.println(string);
        service.saveCategory(new Category(string));
        return "test completed";
    }
}
