// 1- Pacote
package mobileapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AutenticarTokenMobile {

    String uri = "https://apimddev.edtech.com.br/api/alf/v1/oauth2/token";

    // Autenticar Token na API
    @Test
    public void AutenticarTokenMobile(){

        given()
                .formParam("client_id", "previ")
                .formParam("client_secret","adf2c533a2f7d6892efece3c4c99f39a")
                .formParam("grant_type", "password")
                .formParam("username", "administrador")
                .formParam("password", "123456")
                .contentType("application/x-www-form-urlencoded")
                .log().all()
        .when()
                .post(uri)
        .then()
                .log().all()
                .assertThat()
                    .statusCode(200);




    }



}
