package restassureScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class Script004PostusingJson {
	@Test
	public void postusingJSON()
	{
		
		JSONObject body = new JSONObject();
		body.put("name", "teja");
		body.put("salary", "4567");
		body.put("age", "30");
		
		int responseid =	RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.body("data.name", equalto("teja")) // validate the name created is megha or not
		.extract().path("data.id");
	
	System.out.println(responseid);
		
		
		
		
	}

	private ResponseAwareMatcher<Response> equalto(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
