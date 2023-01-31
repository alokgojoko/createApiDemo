package com.mcf.payload;

public class Addsource {

	public static String bodys(String email, String dob) {
		
		return("{\r\n"
				+ "   \"user\":{\r\n"
				+ "      \"title\":\"Miss\",\r\n"
				+ "      \"first_name\":\"JOANNA\",\r\n"
				+ "      \"middle_name\":\"ROSI\",\r\n"
				+ "      \"last_name\":\"CURRIN\",\r\n"
				+ "      \"email\":\""+email+"\",\r\n"
				+ "      \"phone\":\"07770065929\",\r\n"
				+ "      \"dob\":\""+dob+"\",\r\n"
				+ "      \"account_number\":\"55779911\",\r\n"
				+ "      \"sort_code\":\"200000\",\r\n"
				+ "      \"employment_sector\":\"Engineering\",\r\n"
				+ "      \"employment_position\":\"Assembly Worker\",\r\n"
				+ "      \"association\":\"GMB\",\r\n"
				+ "      \"addresses\":[\r\n"
				+ "         {\r\n"
				+ "            \"abodeNumber\":\"\",\r\n"
				+ "            \"buildingNumber\":\"\",\r\n"
				+ "            \"buildingName\":\"ST LAWRENCE JEWRY\",\r\n"
				+ "            \"street\":\"GRESHAM STREET\",\r\n"
				+ "            \"city\":\"LONDON\",\r\n"
				+ "            \"post_code\":\"EC2V 5AA\",\r\n"
				+ "            \"from\":\"2017-01\",\r\n"
				+ "            \"to\":\"2018-01\",\r\n"
				+ "            \"residential_status\":\"OWNER_WITH_MORTGAGE\"\r\n"
				+ "         }\r\n"
				+ "      ]\r\n"
				+ "   },\r\n"
				+ "   \"loan\":{\r\n"
				+ "      \"amount\":\"2000\",\r\n"
				+ "      \"currency\":\"GBP\",\r\n"
				+ "      \"termInMonths\":\"12\",\r\n"
				+ "      \"rentOrMortgage\":\"500.00\",\r\n"
				+ "      \"income\":\"50000\",\r\n"
				+ "      \"employer\":\"eco labs\",\r\n"
				+ "      \"purpose\":\"Other\",\r\n"
				+ "      \"purpose_if_other\":\"Education\",\r\n"
				+ "      \"outgoings\":\"110\",\r\n"
				+ "      \"employmentStatus\":\"em\"\r\n"
				+ "   },\r\n"
				+ "   \"aggregator\":\"FREEDOM_FN\",\r\n"
				+ "   \"loanProductID\":\"L-0015\"\r\n"
				+ "}");

	}

}
