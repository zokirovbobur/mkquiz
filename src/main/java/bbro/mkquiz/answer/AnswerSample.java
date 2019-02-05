package bbro.mkquiz.answer;

import bbro.mkquiz.test.TestSample;

public class AnswerSample {


    private TestSample test;

    int givenAnswer;



    public AnswerSample() {
        test = new TestSample();
        givenAnswer = 0;
    }


    public TestSample getTest() {
        return test;
    }

    public void setTest(TestSample test) {
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
                ", test=" + test +
                ", givenAnswer=" + givenAnswer +
                '}';
    }
}
