package shoppingcart.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import shoppingcart.jwt.JwtTokenUtil;
import shoppingcart.model.JwtAuthenticationRequest;
import shoppingcart.model.User;
import shoppingcart.model.UserType;
import shoppingcart.repository.UserRepository;

import javax.persistence.EntityNotFoundException;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {


    private PasswordEncoder passwordEncoder;


    private UserRepository userRepository;


    @PostMapping("/save")
    public  void saveUser(@RequestBody User user){
        user.setUserType(UserType.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    @GetMapping("/byEmail")
    public  ResponseEntity<User> getUserByEmail(@RequestParam String email){
        return userRepository.findByEmail(email).map(user -> ResponseEntity.ok().body(user)).orElse(ResponseEntity.ok().body(null));

    }


}
