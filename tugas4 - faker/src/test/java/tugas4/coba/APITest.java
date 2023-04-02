package tugas4.coba;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	String token;
	String baseUrl = "https://api-staging-builder.engineer.ai";
	
	@Test (priority = 1)
	public void signUpAPI() {
		RestAssured.baseURI = baseUrl;
		Faker faker = new Faker();
		String name = faker.name().fullName() ;
		//System.out.println(faker.internet().emailAddress());
		String email = faker.internet().emailAddress() ;
		String phone = faker.phoneNumber().cellPhone() ;
		String pass = faker.internet().password() ;
		String payload = "{\"user\":{\"first_name\":\""+name+"\",\"last_name\":\"\",\"email\":\""+email+"\",\"password\":\""+pass+"\",\"phone_number\":\"+62-12312312312\",\"user_type\":\"User\",\"currency_id\":2}}";
		
		Response responseSignup = RestAssured.given().contentType("application/json").body(payload).when().post("/users/");
		assertEquals(responseSignup.getStatusCode(), 200);
		token = responseSignup.jsonPath().get("user.authtoken");
		System.out.println(token);
	}
}
