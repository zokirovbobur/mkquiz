package bbro.mkquiz.student;

import bbro.mkquiz.answer.Answer;
import bbro.mkquiz.section.Section;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    private String fullName;
    @ManyToOne
    private Section section;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List <Answer> answers;


    private int[] correctAnswers;

    public Student(String fullName, Section section, List<Answer> answers, int[] correctAnswers) {
        this.fullName = fullName;
        this.section = section;
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int[] getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", section=" + section +
                ", answers=" + answers.toString() +
                '}';
    }
}
