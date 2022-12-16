package br.thiago.stepDefinitions;

/**
 * This class is responsible to provide the relation between cucumber and test steps
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import br.thiago.support.api.GoRestApi;
import br.thiago.support.domain.User;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    List<User> users = new ArrayList<>();

    @Autowired
    GoRestApi goRestApi;

    @Dado("que o usuário realiza uma requisição")
    public void getAllUsers() {
        Response response = goRestApi.getAllUsers();
        users = Arrays.asList(response.getBody().as(User[].class));
    }

    @Então("o resultado esperado deverá estar correto")
    public void validateRequestResult() {
        Assert.assertTrue(users.size() > 0);
    }
}
