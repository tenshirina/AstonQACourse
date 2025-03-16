package restassured_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest {

    @Test
    public void getRequestWithArgs() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
                .queryParams("foo1", "bar1")
                .queryParams("foo2", "bar2")
        .when()
                .get("/get")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1",equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"));
    }
}
