package Practice.Rest;

import org.junit.Test;

import junit.framework.Assert;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rest_Test {
	
	App app = new App();

	@SuppressWarnings("deprecation")
	@Test
	public void verifyUrlContainsData() {
		
		given().when().get("https://reqres.in/api/users/2").then().statusCode(200).assertThat().body(containsString("janet.weaver@reqres.in"));
		
		Assert.assertTrue(app.getUserData("2").contains("janet.weaver@reqres.in"));
		Assert.assertTrue(app.getUserData("3").contains("emma.wong@reqres.in"));
		Assert.assertTrue(app.getUserData("4").contains("eve.holt@reqres.in"));
	}

}
