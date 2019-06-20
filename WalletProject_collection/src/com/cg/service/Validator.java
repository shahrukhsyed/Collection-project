package com.cg.service;

public interface Validator {
	String aidpattern="[1-9][0-9][0-9]";
	String mobilepattern="[1-9]{1}[0-9]{9}";
	String balancepattern="[1-9][0-9][0-9][0-9]*+[.]*+[0-9]*";
	String namepattern="[a-zA-Z\\s][a-zA-Z\\s]";
	
	public static boolean validatedata(String data,String pattern) {
		return data.matches(pattern);
	}
	
}
