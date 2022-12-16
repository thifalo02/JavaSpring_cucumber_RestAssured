package br.thiago.configuration.properties;

/**
 * This class is responsible to provide the application configuration
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "application")
public class ApiTest {
    private String urlBase;
}
