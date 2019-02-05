package bbro.mkquiz.subject;

import bbro.mkquiz.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo repo;

    @Autowired
    private CategoryService categoryService;

    public String saveSubject(Subject subject){
        repo.save(subject);
        return subject.toString() + " has been added successfully!";
    }
    public List<Subject> getAll(){
        return repo.findAll();
    }

    public String addAll(List<Subject> subjects){
        repo.saveAll(subjects);
        return subjects.toString()+" have been uploaded successfully!";
    }
    public String deleteCategory(Subject subject){
        repo.delete(subject);
        return subject.toString()+ " has been deleted successfully!";
    }
    public Subject findById(int id){return repo.findById(id);}

    public String nestedSave(Subject subject){
        categoryService.saveCategory(subject.getCategory());
        subject.setCategory(categoryService.findByName(subject.getCategory().getCategoryName()));
        repo.save(subject);


        return subject.toString() + " has been added successfully!";
    }
    public Subject findByName(String name){return repo.findBySubjectName(name);}

}
