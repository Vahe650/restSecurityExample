package shoppingcart.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import shoppingcart.model.User;
import shoppingcart.repository.UserRepository;

import javax.persistence.EntityNotFoundException;


@Service
public class CurrentUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
     return   userRepository.findByEmail(s).map(CurrentUser::new).orElseThrow(EntityNotFoundException::new);

    }
}
