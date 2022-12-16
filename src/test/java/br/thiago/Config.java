package br.thiago;

/**
 * This class is responsible to scan the spring context package
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.thiago")
public class Config {
}
