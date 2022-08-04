package apiTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostStoreOrder {

    @Test
    public void getInventory()
    {
        RestAssured.baseURI ="https://petstore3.swagger.io/";
        RestAssured.basePath ="api/v3/store/order";
        RequestSpecification request = RestAssured.given();




        JSONObject requestParams = new JSONObject();
        requestParams.put("id", "10");
        requestParams.put("petId", "198772");
        requestParams.put("quantity", "7");
        requestParams.put("shipDate", "2022-08-02T23:55:49.868Z");
        requestParams.put("status", "approved");
        requestParams.put("complete", "true");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());

        Response response = request.post(RestAssured.baseURI+RestAssured.basePath);
        Assert.assertEquals(response.getStatusCode(),200);

        System.out.println("The status received: " + response.statusLine());






    }
}
