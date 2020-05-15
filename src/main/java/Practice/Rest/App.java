package Practice.Rest;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class App {
	public String url="https://reqres.in/";
	
	
	public String getUserData(String id) {
		String response = given().when().get(url+"api/users/"+id).asString();
		System.out.println(response);
		return response;		
	}
}
