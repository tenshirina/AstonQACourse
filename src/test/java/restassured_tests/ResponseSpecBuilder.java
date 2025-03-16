package restassured_tests;

import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.expect;

import static org.hamcrest.Matchers.*;

public class ResponseSpecBuilder {

    public static ResponseSpecification createResponseSpec() {
        return expect()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args", anEmptyMap())
                .body("files", anEmptyMap())
                .body("form", anEmptyMap())
                .body("json", nullValue());
    }
}
