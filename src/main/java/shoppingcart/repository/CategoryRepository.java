package shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.model.Bill;
import shoppingcart.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


    List<Category> findAll();
    List<Category> findByName(String name);
}
