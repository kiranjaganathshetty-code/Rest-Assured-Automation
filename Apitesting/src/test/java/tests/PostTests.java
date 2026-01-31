package tests;

import Base.BaseTest;
import utils.payload;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostTests extends BaseTest {

    @Test
    public void createUserTest() {

        given()
            .log().all()
            .header("Content-Type", "application/json")
            .body(payload.createUser())
        .when()
            .post("/post")
        .then()
            .log().all()
            .statusCode(200)
            .body("data.name", equalTo("Kiran"));
    }
}