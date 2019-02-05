package bbro.mkquiz.section;

import bbro.mkquiz.subject.SubjectSample;


public class SectionSample {

    private String sectionName;

    private SubjectSample subject;

    public SectionSample() {
        this.subject = new SubjectSample(); sectionName = "sectionName";
    }

    public SectionSample(String sectionName, SubjectSample subject) {
        this.sectionName = sectionName;
        this.subject = subject;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public SubjectSample getSubject() {
        return subject;
    }

    public void setSubject(SubjectSample subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                ", sectionName='" + sectionName + '\'' +
                ", subject=" + subject.toString() +
                '}';
    }
}
