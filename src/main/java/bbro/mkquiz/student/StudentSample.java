package bbro.mkquiz.student;

import bbro.mkquiz.answer.Answer;
import bbro.mkquiz.section.SectionSample;

import java.util.ArrayList;
import java.util.List;


public class StudentSample {


    private String fullName;

    private SectionSample section;

    private List <Answer> answers;

    public StudentSample(String fullName, SectionSample section, List <Answer> answers) {
        this.fullName = fullName;
        this.section = section;
        this.answers = answers;
    }

    public StudentSample() {
        section = new SectionSample();
        answers = new ArrayList<Answer>();
        fullName = "fullName";
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public SectionSample getSection() {
        return section;
    }

    public void setSection(SectionSample section) {
        this.section = section;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Student{" +

                ", fullName='" + fullName + '\'' +
                ", section=" + section +
                ", answers=" + answers.toString() +
                '}';
    }
}
