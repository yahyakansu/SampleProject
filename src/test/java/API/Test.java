package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test {
    public static void main(String[] args) {
        Response response = RestAssured.get("http://100.26.130.128:8000/api/spartans");
        System.out.println(response.getStatusCode());
        System.out.println(response.asString());

        response = RestAssured.get("http://100.26.130.128:8000/api/spartans/search");
        System.out.println(response.asString());
    }
}
