package bbro.mkquiz.test;

import bbro.mkquiz.section.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepo extends JpaRepository<Test, Integer> {
    Test findById(int id);
    Test findByTestNumber(int testNumber);
    List<Test> findAllBySection(Section section);

}
