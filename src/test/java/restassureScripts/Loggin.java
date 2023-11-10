package restassureScripts;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class Loggin {
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447dba80b1ef003f2eb38a-116a1418bbf2bf0639f4e1df59322d5e20";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}
