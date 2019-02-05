package bbro.mkquiz.subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
    Subject findById(int id);
    Subject findBySubjectName(String subjectName);
}
