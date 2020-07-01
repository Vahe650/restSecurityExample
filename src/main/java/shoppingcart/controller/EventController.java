package shoppingcart.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import shoppingcart.model.Event;
import shoppingcart.model.User;
import shoppingcart.model.UserType;
import shoppingcart.repository.CategoryRepository;
import shoppingcart.repository.EventRepository;
import shoppingcart.repository.UserRepository;

@RestController
@AllArgsConstructor
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/save")
    public void saveUser(@RequestBody Event event) {
        eventRepository.save(event);
    }


}
