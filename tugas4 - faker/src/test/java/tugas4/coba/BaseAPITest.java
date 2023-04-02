package tugas4.coba;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseAPITest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON)
			.build().log().all();
	
	RequestSpecification signUpJsonSpec;
	String token;
	
	@BeforeMethod
	public void loginAPI() {
		Faker faker = new Faker();
		String name = faker.name().fullName() ;
		System.out.println(faker.internet().emailAddress());
		String email = faker.internet().emailAddress() ;
		String phone = faker.phoneNumber().cellPhone() ;
		String pass = faker.internet().password() ;
		
		//String payload = "{\"user\":{\"first_name\":\"Aletes\",\"last_name\":\"\",\"email\":\"aletest1@capcx.com\",\"password\":\"123456789\",\"phone_number\":\"+62-12312312312\",\"user_type\":\"User\",\"currency_id\":2}}";
		String payload = "{\"user\":{\"first_name\":\""+name+"\",\"last_name\":\"\",\"email\":\""+email+"\",\"password\":\""+pass+"\",\"phone_number\":\"+62-12312312312\",\"user_type\":\"User\",\"currency_id\":2}}";
		//String payload = DataUtility.getDataFromExcel("requestbody", "signinBody");
		
//		Response responseLogin = RestAssured.given()
//				.contentType("application/json")
//				.body(payload).when().post("/users");
		Response responseLogin = given().spec(commonJsonSpec).body(payload).when().post("/users/");
		assertEquals(responseLogin.getStatusCode(), 200);
		token = responseLogin.jsonPath().get("user.authtoken");
		System.out.println(token);
		
		signUpJsonSpec = new RequestSpecBuilder()
				.setBaseUri("https://api-staging-builder.engineer.ai/")
				.setContentType(ContentType.JSON)
				.addHeader("authtoken", token)
				.build().log().all();
	}
}
