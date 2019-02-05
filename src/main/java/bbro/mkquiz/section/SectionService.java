package bbro.mkquiz.section;

import bbro.mkquiz.subject.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {

    @Autowired
    private SectionRepo repo;

    @Autowired
    private SubjectService subjectService;

    public String saveSection(Section section){
        repo.save(section);
        return section.toString() + " has been added successfully!";
    }
    public List<Section> getAll(){
        return repo.findAll();
    }

    public String addAll(List<Section> sections){
        repo.saveAll(sections);
        return sections.toString()+" have been uploaded successfully!";
    }
    public String deleteSection(Section section){
        repo.delete(section);
        return section.toString()+ " has been deleted successfully!";
    }
    public Section findById(int id){return repo.findById(id);}

    public String nestedSave(Section section){
        subjectService.nestedSave(section.getSubject());
        section.setSubject(subjectService.findByName(section.getSubject().getSubjectName()));
        repo.save(section);

        return section.toString() + " has been added successfully!";
    }

    public Section findByName(String name){return repo.findBySectionName(name);}


}
