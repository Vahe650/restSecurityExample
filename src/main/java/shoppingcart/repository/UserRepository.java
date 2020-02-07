package shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByEmail(String email);

}