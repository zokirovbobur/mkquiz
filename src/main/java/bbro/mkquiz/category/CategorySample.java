package bbro.mkquiz.category;

public class CategorySample {
    private String categoryName;

    public CategorySample() {
        this.categoryName = "category";
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategorySample{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
