package bbro.mkquiz.subject;

import bbro.mkquiz.category.CategorySample;

public class SubjectSample {
    private String subjectName;
    private CategorySample category;

    public SubjectSample() {
        category = new CategorySample();
        subjectName = "subjectName";
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public CategorySample getCategory() {
        return category;
    }

    public void setCategory(CategorySample category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SubjectSample{" +
                "subjectName='" + subjectName + '\'' +
                ", category=" + category +
                '}';
    }
}
