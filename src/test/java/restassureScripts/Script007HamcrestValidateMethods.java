package restassureScripts;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class Script007HamcrestValidateMethods {
	@Test(priority='1')
	public void ValidateRepsonseBody()
	{
		String PMapikey = "PMAK-65447dba80b1ef003f2eb38a-116a1418bbf2bf0639f4e1df59322d5e20";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces[1].id", equalTo("7dfcaaec-6d36-4ee4-a529-a831a0d44c2b"),
			  "workspaces[1].name",equalTo("Phase3-lesson2-APITesting"),
			   "workspaces[1].type",equalTo("personal"));
		
		
	}
	
	@Test(priority='2')
	public void ValidateRepsonseBody_equlaTo()
	{
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("username", equalTo("Uname001"),
			  "email", equalTo("Positive@Attitude.com"),
			  "userStatus", equalTo(1));
		
		
	}
	
	
	@Test(priority='3')
	public void ValidateRepsonseBody_hasitems()
	{
		String PMapikey = "PMAK-65447dba80b1ef003f2eb38a-116a1418bbf2bf0639f4e1df59322d5e20";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces.name", hasItems("Phase3-lesson2-APITesting","My Workspace","My Workspace-New api 03nov11"),
				"workspaces.type", hasItems("personal"));
		
		
	}

}
