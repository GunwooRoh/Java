package com.day4.Example;

import java.util.Scanner;

public class ExampleOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요 : " );
		int num1 = sc.nextInt();
		String a = (num1 > 0) ? "양수" : "음수";
		System.out.println(a);
		
		String b = ((num1 % 2) == 1) ? "홀수" : "짝수";
		System.out.println(b);
		
	}

}
