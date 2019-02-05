package bbro.mkquiz.section;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepo extends JpaRepository<Section, Integer> {
    Section findById(int id);
    Section findBySectionName(String sectionName);
}
