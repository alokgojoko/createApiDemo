package com.mcf.createapi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.mcf.payload.Addsource;

public class Test {

	public static void main(String[] args) {
	RestAssured.baseURI="https://api-test.mycommunityfinance.co.uk";
		String response=given().header("Content-Type","application/json").header("x-api-key", "8ab7c59b5843653401584365625a0000")
		.body(Addsource.bodys("asdf@gmail.com","1988-02-02")).when().post("/cuplatform/loanapplications/create").then().assertThat().statusCode(200).body("status", equalTo("DECLINED"))
		.header("Server", "nginx").extract().response().asString();
		
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String URL1=js.getString("URL");
		System.out.println(URL1);
		
			
	}

}
