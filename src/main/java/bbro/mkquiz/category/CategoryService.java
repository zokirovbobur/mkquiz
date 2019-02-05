package bbro.mkquiz.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo repo;

    public String saveCategory(Category category){
        repo.save(category);
        return category.toString() + " has been added successfully!";
    }
    public List<Category> getAll(){
        return repo.findAll();
    }
    public String addAll(List<Category> categories){
        repo.saveAll(categories);
        return categories.toString()+" have been uploaded successfully!";
    }
    public String deleteCategory(Category category){
        repo.delete(category);
        return category.toString()+ " has been deleted successfully!";
    }
    public Category findById(int id){return repo.findById(id);}
    public Category findByName(String categoryName){return repo.findByCategoryName(categoryName);}
}
