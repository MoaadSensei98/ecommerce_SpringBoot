package es.babel.ecommercespring;

import oracle.jdbc.datasource.impl.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DBconfiguration {
    @Value ("${spring.datasource.username}")
    String username;

    @Value ("${spring.datasource.password}")
    String password;

    @Value ("${spring.datasource.url}")
    String url;

    @Bean
    DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
         return dataSource;
    }
}
