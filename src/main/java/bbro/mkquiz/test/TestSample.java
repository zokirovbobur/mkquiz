package bbro.mkquiz.test;

import bbro.mkquiz.section.SectionSample;

import java.util.Arrays;

public class TestSample {


    private int testNumber;
    private String question;
    private String answers[];
    private int correctAnswer;


    private SectionSample section;

    public TestSample() {
        testNumber = 1;
        question = "question?";
        answers = new String[4];
        this.section = new SectionSample();
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public SectionSample getSection() {
        return section;
    }

    public void setSection(SectionSample section) {
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
                ", testNumber='" + testNumber + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", correctAnswer=" + correctAnswer +
                ", section=" + section +
                '}';
    }
}
