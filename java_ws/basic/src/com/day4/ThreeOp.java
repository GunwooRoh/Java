package com.day4;

public class ThreeOp {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = (a > b) ? a : b;
		System.out.println("a = " + a +", b = "+ b + ", 더 큰수 : " + c);
		
		int d = 30;
		System.out.println(d == 30 ? "같다" : "다르다");
		//d==30? System.out.println("같다") : System.out.println("다르다"); //에러
		
		int i = 1;
		String str = (i != 1)? "여자" : "남자"; 
		System.out.println(str);
		//i != 0? str="남자" : str="여자"; //에러
		
	}


}


