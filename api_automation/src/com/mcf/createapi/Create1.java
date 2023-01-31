package com.mcf.createapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mcf.payload.Addsource;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Create1 {
	
	@Test(dataProvider="Data")
	public void CreateApis(String email, String dob) {
		RestAssured.baseURI="https://api-test.mycommunityfinance.co.uk";
		String response=given().header("Content-Type","application/json").header("x-api-key", "8ab7c59b5843653401584365625a0000")
		.body(Addsource.bodys(email, dob)).when().post("/cuplatform/loanapplications/create").then().assertThat().statusCode(200).body("status", equalTo("DECLINED"))
		.header("Server", "nginx").extract().asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String url= js.getString("URL");
		System.out.println(url);		
	}
	
	@DataProvider(name="Data")
	public Object[][] getData()
	{
		return new Object[][] {{"aldoif@gmail.com","1988-01-01"},{"aldo@gmail.com","1988-04-11"},{"sdlkjf@gmail.com","1990-01-02"} };
	}

}
