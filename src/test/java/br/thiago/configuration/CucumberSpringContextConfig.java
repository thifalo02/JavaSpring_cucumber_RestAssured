package br.thiago.configuration;

/**
 * This class is responsible to provide the context configuration to the project
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import br.thiago.Config;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@EnableConfigurationProperties
@SpringBootTest(classes = Config.class)
public class CucumberSpringContextConfig {
}
