package com.day5;

import java.io.IOException;

public class SwitchTest3 {

	public static void main(String[] args) throws IOException {
		/*
		 public abstract int read() throws IOException
		 문자 하나 (char)를 입력 받을 때 사용
		 입력한 값의 아스키코드 값을 반환해줌
		 앞의 1바이트만 읽음
		 ex) ABC를 입력해도 A에 해당하는 코드 65를 리턴
		 */
		System.out.println("성별을 입력하세요 M/F");
		int code = System.in.read();
		char gender = (char)code;
		//System.out.println("code = " + code + ", 문자 : " + (char)code);
		char upperCase = Character.toUpperCase(gender);
		
		String result = "";
		
		switch(Character.toUpperCase(gender)) {
			case 'M' :
				result = "남자";
				break;
			case 'F' :
				result = "여자";
				break;
			default :
				result = "잘못 입력!";
		}
		System.out.println(result);
		
		//public static char toUpperCase(char ch)
		
	}

}
