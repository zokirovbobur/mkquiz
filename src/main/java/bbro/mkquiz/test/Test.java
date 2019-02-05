package bbro.mkquiz.test;

import bbro.mkquiz.section.Section;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Arrays;

@Entity
public class Test {
    @Id
    @GeneratedValue
    private int id;

    private int testNumber;
    private String question;
    private String answers[];
    private int correctAnswer;


    @ManyToOne
    private Section section;

    public Test() {
        this.section = new Section();
    }

    public Test(int testNumber, Section section) {
        this.testNumber = testNumber;
        this.section = section;
    }

    public Test(int testNumber, String question, String[] answers, int correctAnswer, Section section) {
        this.testNumber = testNumber;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", testNumber='" + testNumber + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", correctAnswer=" + correctAnswer +
                ", section=" + section +
                '}';
    }
}
