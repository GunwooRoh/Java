package com.day5.Example;

import java.util.Scanner;

public class ExampleIf_02 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력해주세요");
		int a = sc.nextInt();
		String gender = "";
		
		if ((a == 1) || (a == 3)) {
			gender = "남자입니다";
		}else if ((a == 2) || (a == 4)) {
			gender = "여자입니다";
		}else {
			gender = "잘못 입력하셨습니다";
		}
		System.out.println(gender);

	}

}
