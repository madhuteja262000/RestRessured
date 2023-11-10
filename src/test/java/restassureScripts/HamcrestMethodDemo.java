package restassureScripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;

public class HamcrestMethodDemo {
public void containsMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-65447dba80b1ef003f2eb38a-116a1418bbf2bf0639f4e1df59322d5e20")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches all the items in the response and in strict order
			// chnage order or remove one item.. method fails
			.body("workspaces.name", contains("Phase3-lesson2-APITesting","My Workspace","My Workspace-New api 03nov11"));
	}
}
