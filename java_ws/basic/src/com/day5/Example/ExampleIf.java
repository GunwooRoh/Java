package com.day5.Example;

import java.util.Scanner;

public class ExampleIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜(일)를 입력하세요(1~31)");
		int day = sc.nextInt();
		String a = "";
		if ((day >= 1) && (day <= 10)) {
			a = (a + " 일: 초순");
		}else if ((day >= 11) && (day <= 20)) {
			a = (" 일 : 중순");
		}else if ((day >= 21) && (day <= 31)) {
			a= (a + " 일 : 하순");
		}else {
			a = (a + " 일 : 잘못 입력하셨습니다.");
		}
		System.out.println(day + a);
	
		
	}

}
