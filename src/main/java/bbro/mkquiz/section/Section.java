package bbro.mkquiz.section;

import bbro.mkquiz.subject.Subject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section {
    @Id
    @GeneratedValue
    private int id;

    private String sectionName;

    @ManyToOne
    private Subject subject;

    public Section() {
        this.subject = new Subject();
    }

    public Section(String sectionName, Subject subject) {
        this.sectionName = sectionName;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", sectionName='" + sectionName + '\'' +
                ", subject=" + subject.toString() +
                '}';
    }
}
