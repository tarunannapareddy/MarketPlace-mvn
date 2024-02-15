package marketplace;


import marketplace.dbConnector.DBConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.sql.Connection;


@Configuration
public class BeanConfig {
    @Bean
    public Connection conn() {
        return DBConnector.getCustomerConnection();
    }
}
