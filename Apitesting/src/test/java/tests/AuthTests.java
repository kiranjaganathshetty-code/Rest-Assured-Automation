package tests;

import Base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthTests extends BaseTest {

    @Test
    public void testBasicAuth() {

        given()
            .log().all()
            .auth().preemptive().basic("postman", "password")
        .when()
            .get("/basic-auth")
        .then()
            .log().all()
            .statusCode(200)
            .body("authenticated", equalTo(true));
    }
}