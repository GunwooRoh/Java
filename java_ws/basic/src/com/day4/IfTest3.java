package com.day4;

import java.util.*;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요. M / F");
		String gender = sc.nextLine();
		//public boolean equals(Object anObject)
		boolean bool = gender.equals("M");
		String result = "";
		//public String toUpperCase();
		String upperGender = gender.toUpperCase();
		if (gender.equalsIgnoreCase("M")) {
			result = "남자입니다.";
		}else if (gender.toUpperCase().equals("F")) {
			result = "여자입니다.";
		}else {
			result = "잘못 입력하셨습니다.";
		}
		System.out.println(result);
		
		//public boolean equalsIgnoreCase(String anotherString)
	}

}
