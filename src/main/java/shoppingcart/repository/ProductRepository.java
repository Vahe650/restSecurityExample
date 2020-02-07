package shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
