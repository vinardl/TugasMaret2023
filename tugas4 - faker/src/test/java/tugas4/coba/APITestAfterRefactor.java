package tugas4.coba;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class APITestAfterRefactor extends BaseAPITest{
	String token;
	String baseUrl = "https://api-staging-builder.engineer.ai";
	
	@Test 
	public void signUpAPI() {
		RestAssured.baseURI = baseUrl;
		Faker faker = new Faker();
		String name = faker.name().fullName() ;
		//System.out.println(faker.internet().emailAddress());
		String email = faker.internet().emailAddress() ;
		String phone = faker.phoneNumber().cellPhone() ;
		String pass = faker.internet().password() ;
		String payload = "{\"user\":{\"first_name\":\""+name+"\",\"last_name\":\"\",\"email\":\""+email+"\",\"password\":\""+pass+"\",\"phone_number\":\"+62-12312312312\",\"user_type\":\"User\",\"currency_id\":2}}";
		Response responseUser = given().spec(commonJsonSpec).body(payload).when().post("/users");
		assertEquals(responseUser.getStatusCode(),200);
	}
}
