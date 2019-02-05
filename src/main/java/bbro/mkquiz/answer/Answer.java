package bbro.mkquiz.answer;

import bbro.mkquiz.test.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Test test;

    int givenAnswer;

    public Answer(Test test, int givenAnswer) {
        this.test = test;
        this.givenAnswer = givenAnswer;
    }

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getGivenAnswer() {
        return givenAnswer;
    }

    public void setGivenAnswer(int givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", test=" + test +
                ", givenAnswer=" + givenAnswer +
                '}';
    }
}
