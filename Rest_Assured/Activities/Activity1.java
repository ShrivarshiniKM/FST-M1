package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity1 {
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test(priority=1)
    public void addNewPet() {
        String reqBody = "{"
            + "\"id\": 1806,"
            + "\"name\": \"Riley\","
            + " \"status\": \"alive\""
        + "}";

        Response response = 
            given().contentType(ContentType.JSON)
            .body(reqBody)
            .when().post(ROOT_URI); 

        // Assertion
        response.then().body("id", equalTo(1806));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority=2)
    public void getPetInfo() {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().pathParam("petId", "1806") 
            .get(ROOT_URI + "/{petId}"); 

        // Assertion
        response.then().body("id", equalTo(1806));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }
    
    @Test(priority=3)
    public void deletePet() {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().pathParam("petId", "1806")
            .delete(ROOT_URI + "/{petId}"); 
        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("1806"));
    }
}
