package bbro.mkquiz.subject;

import bbro.mkquiz.category.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
    @Id
    @GeneratedValue
    private int id;

    private String subjectName;

    @ManyToOne
    private Category category;

    public Subject() {
        this.category = new Category();
    }

    public Subject(String subjectName, Category category) {
        this.subjectName = subjectName;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", category=" + category.toString() +
                '}';
    }
}
