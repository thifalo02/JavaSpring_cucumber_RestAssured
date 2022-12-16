package br.thiago.support.api;

/**
 * This class is responsible to provide the API requests to the test
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import br.thiago.configuration.properties.ApiTest;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Log4j2
@Component
public class GoRestApi {
    private final String USERS_PATH = "/public/v2/users";

    @Autowired
    ApiTest properties;

    public Response getAllUsers() {
        log.warn("URL Base " + properties.getUrlBase());
        RequestSpecification request = given().filter(new AllureRestAssured())
                .contentType(ContentType.JSON)
                .baseUri(properties.getUrlBase());

        Response response = request.get(USERS_PATH);
        response.then().statusCode(HttpStatus.SC_OK);
        log.warn("Request has been finished.");
        return response;
    }
}
