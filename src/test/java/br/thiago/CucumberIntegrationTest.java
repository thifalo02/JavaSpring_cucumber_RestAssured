package br.thiago;

/**
 * This class is responsible to provide the cucumber context cucumber run and report configuration
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        })
public class CucumberIntegrationTest {
}
