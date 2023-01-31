package com.mcf.createapi;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mcf.pojoclasses.Addresses;
import com.mcf.pojoclasses.GetResponse;
import com.mcf.pojoclasses.Loan;
import com.mcf.pojoclasses.SerializeData;
import com.mcf.pojoclasses.User;

import io.restassured.RestAssured;

public class CreateApi11 {
	@Test()
	public void CreateApis() throws IOException {
	
	SerializeData d = new SerializeData();
	d.setAggregator("FREEDOM_FN");
	d.setLoanProductID("L-0015");
	Loan l=new Loan();
	l.setAmount("2000");
	l.setCurrency("GBP");
	l.setTermInMonths("12");
	l.setRentOrMortgage("500.00");
	l.setIncome("50000");
	l.setEmployer("eco labs");
	l.setPurpose("Other");
	l.setPurpose("Education");
	l.setOutgoings("110");
	l.setEmploymentStatus("em");
	d.setLoan(l);
	Addresses a=new Addresses();
	a.setAbodeNumber("");
	a.setBuildingNumber(57);
	a.setBuildingName("");
	a.setStreet("ASHDALE ROAD");
	a.setCity("LIVERPOOL");
	a.setPost_code("L9 2AA");
	a.setFrom("2017-01");
	a.setTo("2018-01");
	a.setResidential_status("OWNER_WITH_MORTGAGE");
List<Addresses> li=new ArrayList<Addresses>();
//li.contains(a);
User u=new User();
	u.setTitle("Mr");
	u.setFirst_name("CHRISTIAN");
	u.setMiddle_name("DO");
    u.setLast_name("MCMASTER");
    u.setEmail("yibek20050@gmai223.com");
    u.setPhone("7770065929");
    u.setDob("1983-07-06");
    u.setAccount_number("55779911");
    u.setSort_code("200000");
    u.setEmployment_sector("Engineering");
    u.setEmployment_position("Director");
    u.setAssociation("GMB");
   li.add(a);
    u.setAddresses(li);
    d.setUser(u);
	RestAssured.baseURI="https://api-test.mycommunityfinance.co.uk";
		GetResponse gr=given().log().all().header("Content-Type","application/json").header("x-api-key", "8ab7c59b5843653401584365625a0000")
		.body(d).when().post("/cuplatform/loanapplications/create").then().log().all().assertThat().statusCode(200).body("status",equalTo("APPROVED"))
		.header("Server", "nginx").extract().as(GetResponse.class);
		System.out.println(gr.getTermInMonths());
		System.out.println(gr.getStatus());
		String responseStatusCode=gr.getStatus();
		System.out.println("Respone code"+gr.getStatus());
		String ExpectedStatusCode="DECLINED";
	
		Assert.assertTrue(ExpectedStatusCode.equals(responseStatusCode));
			}
	}

