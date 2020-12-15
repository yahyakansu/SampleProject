package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class apiCommands {

    @BeforeAll
    public static void init() {
        RestAssured.baseURI = "http://100.26.130.128:8000";
        RestAssured.basePath = "/api";
    }

    @DisplayName("Testing /api/hello endpoint")
    @Test
    public void test1() {
        given().accept(ContentType.TEXT)
                .when().get("/hello")
                .then().statusCode(200)
                .body(is("Hello from Sparta"))
                .header("content-type", "text/plain;charset=UTF-8");
    }

    @DisplayName("Testing /api/spartans Endpoint return json result")
    @Test
    public void testAllSpartansGetJsonResult(){
        given().accept(ContentType.JSON)
                .when().get("/spartans")
                .then().statusCode(200)
                .contentType(ContentType.JSON);
    }

    @DisplayName("Testing /api/spartans Endpoint return xml result")
    @Test
    public void testAllSpartansGetXMLResult(){
        given().accept(ContentType.XML)
                .when().get("/spartans")
                .then().statusCode(200)
                .contentType(ContentType.XML);
    }

    @DisplayName("Testing GET /api/spartans/search Endpoint")
    @Test
    public void testSearch(){
        given().log().all()
                .queryParam("nameContain","re")
                .queryParam("gender","Male")
                .when().get("/spartans/search")
                .then().log().all()
                .statusCode(200)
                .contentType(ContentType.JSON)
//                .body("content.name",everyItem(containsString("re")));
                .body("content.gender" , everyItem(is("Male")));
    }


}
