package shoppingcart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import shoppingcart.model.Bill;
import shoppingcart.model.Category;
import shoppingcart.model.Event;
import shoppingcart.model.User;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(User.class);
        config.exposeIdsFor(Bill.class);
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(Event.class);
    }
}
