package bbro.mkquiz.category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    Category findById(int id);
    Category findByCategoryName(String categoryName);

}
