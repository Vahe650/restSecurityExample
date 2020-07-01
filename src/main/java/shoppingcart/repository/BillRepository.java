package shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.model.Bill;
import shoppingcart.model.User;

import java.util.Optional;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
