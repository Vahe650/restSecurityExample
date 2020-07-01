package shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.model.Bill;
import shoppingcart.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
