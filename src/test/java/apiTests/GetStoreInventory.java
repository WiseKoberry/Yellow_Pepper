package apiTests;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetStoreInventory {



    @Test
    public void getInventory()
    {
        RestAssured.baseURI ="https://petstore3.swagger.io/";

        RestAssured.basePath ="api/v3/store/inventory";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.getHeader("content-type"),"application/json");

        String responseBodyString = response.getBody().asString();
        Assert.assertTrue(responseBodyString.contains("placed"));
        int availableValue = JsonPath.from(responseBodyString).get("placed");
        System.out.println("Placed is: "+availableValue);

    }
}
