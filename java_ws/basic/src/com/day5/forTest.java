package com.day5;

import java.util.Scanner;

public class forTest {

	public static void main(String[] args) {
		
		/*
		 for(초기식; 조건식; 증감식){
		 반복명령;
		 }
		 */
		for(int i = 0; i < 3; i++) {
			System.out.println("Hello java!");
		}
		System.out.println("-----------------------");
		for(int i = 0; i < 4; i++){
		System.out.println(i);
		} //for
		System.out.println("\n-------------------1씩 감소-------------------");
		for(int i = 3; i > 0; i--) {
			System.out.println("i = " + i);
		}
		System.out.println("-----------------------");
		for(int i1 = 0; i1 < 3; i1++) {
		    System.out.println((i1+1)+ ".Hello java");
		}
		System.out.println("-----------------------");
		for(int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for(int i = 0; i < 10; i++) {
			if((i % 2) == 1) {
			System.out.println(i);
			}
		}
		System.out.println("-----------------------");
		for(int i = 10; i > -8; i-=2) {
		     if(i > 0) {
		     System.out.println(i + " java");
		     }else if(i == 0) {
		     System.out.println(i + " oreacle");
		     }else {
		     System.out.println(i + " spring");
		     }
		}
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요");
		int count = sc.nextInt();
		for(int i = 0; i < 4; i++)
			System.out.println(((i+1)*10) + ". Hello java");
		System.out.println("-----------------------");
			
	}

}


