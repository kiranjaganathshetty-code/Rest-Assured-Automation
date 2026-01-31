package Base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }
}