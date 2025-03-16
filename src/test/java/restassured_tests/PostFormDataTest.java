package restassured_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostFormDataTest {

    @Test
    public void testFormDataPost() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .accept("*/*")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args", anEmptyMap())
                .body("files", anEmptyMap())
                .body("data", equalTo(""))
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
