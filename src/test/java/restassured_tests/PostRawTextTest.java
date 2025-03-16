package restassured_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostRawTextTest {

    @Test
    public void testRawTextPost() {
        RestAssured.baseURI = "https://postman-echo.com";

        ResponseSpecification responseSpec = ResponseSpecBuilder.createResponseSpec();

        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
        .when()
                .post("/post")
        .then()
                .spec(responseSpec)
                .body("data", equalTo(requestBody))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
