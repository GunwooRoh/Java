package com.day4.Example;

import java.util.Scanner;

public class ExampleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로를 입력하십시오 : ");
		int num1 = sc.nextInt();
		
		System.out.println("세로를 입력하십시오 : ");
		int num2 = sc.nextInt();
		
		int result = (num1 * num2) / 2 ;
		System.out.println("삼각형의 넓이는 : " + result + " 입니다.");

	}

}
