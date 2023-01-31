package com.mcf.createapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mcf.pojoclasses.GetResponse;

import io.restassured.RestAssured;


public class Create2{

	String directory = System.getProperty("user.dir");
	Properties prop;
	{
		try
		{
			FileInputStream fl = new FileInputStream(directory + "/Resource/data.properties");
			prop = new Properties();
			prop.load(fl);

		}catch (Exception e)
		{
			e.getMessage();
			e.getStackTrace();
		}
	}

	@Test()
	public void CreateApis() throws IOException {
		RestAssured.baseURI="https://api-test.mycommunityfinance.co.uk";
		GetResponse gr=given().header("Content-Type","application/json").header("x-api-key", "8ab7c59b5843653401584365625a0000")
				.body(new String(Files.readAllBytes(Paths.get(directory + "/Resource/3JOANNA.json")))).when().post("/cuplatform/loanapplications/create").then().assertThat().statusCode(200).body("status", equalTo("DECLINED"))
				.header("Server",prop.getProperty("server")).extract().as(GetResponse.class);
		System.out.println(gr.getTermInMonths());
		System.out.println(gr.getStatus());
		String responseStatusCode=gr.getStatus();
		String ExpectedStatusCode="DECLINED";
		Assert.assertEquals(responseStatusCode, ExpectedStatusCode);
		Assert.assertTrue(ExpectedStatusCode.equals(responseStatusCode));
	}

}
