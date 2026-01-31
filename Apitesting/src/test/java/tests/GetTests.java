package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetTests extends BaseTest {

    @Test
    public void validateGetRequest() {
        given()
            .log().all()
        .when()
            .get("/get?foo=bar")
        .then()
            .log().all()
            .statusCode(200)
            .body("args.foo", equalTo("bar"));
    }
}