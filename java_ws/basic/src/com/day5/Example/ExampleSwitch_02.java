package com.day5.Example;

import java.util.Scanner;

public class ExampleSwitch_02 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		String str = "";
		switch(month) {
			case 1 :
			case 2 :
			case 3 :
				str = month + "월은 1분기 입니다.";
				break;
			case 4 : case 5 : case 6 :
				str = month + "월은 2분기 입니다.";
				break;
			case 7 : case 8 : case 9 :
				str = month + "월은 3분기 입니다.";
				break;
			case 10 : case 11 : case 12 :
				str = month + "월은 4분기 입니다.";
				break;
			default :
				str = "잘못 선택했어요";
		}
		System.out.println(str);
	}

}
