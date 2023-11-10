package steps;
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;

public class BBD {
Response res;
	
	@Given("User Enters github base URL and Authorization")
	public void user_enters_github_base_url_and_authorization() {
		
		given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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");
		
	   
	}

	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
	 
	res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
	.when().get();
		
		
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {
		
		
		res.prettyPrint();
		
		Assert.assertEquals(res.statusCode(),200);
		
		
		
		
			
	 
	}


}
