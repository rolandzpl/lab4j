package configuration;

import com.lithium.demo.services.CatService;
import com.lithium.demo.services.DefaultCatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import useCases.EnlistCats;

@Configuration
public class DefaultConfiguration {

    public DefaultConfiguration() {
        super();
    }

    @Autowired
    private CatService catService;

    @Bean
    public CatService cats() {
        return new DefaultCatService();
    }

    @Bean
    public EnlistCats createEnlistCats(){
        return new EnlistCats(catService);
    }
}
