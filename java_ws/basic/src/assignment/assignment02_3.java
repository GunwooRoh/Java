package assignment;

import java.util.Scanner;

public class assignment02_3 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		String str = "";
		int age = sc.nextInt();
			if (age >= 20) {
				System.out.println("취미를 입력하세요 : 1. 영화 2. 축구 3. 야구 4. 등산");
				int hobby = sc.nextInt();
				if (hobby == 1) {
					str = "영화를 선택하였습니다";
					}else if (hobby == 2) {
						str = "축구를 선택하였습니다";
					}else if (hobby == 3) {
						str = "야구를 선택하였습니다";
					}else if (hobby == 4) {
						str = "등산을 선택하였습니다";
					}else {
						str = "잘못 입력하셨습니다";	
					}
				}else {
					str = "20세 이상만 본 설문에 응할 수 있습니다.";
				}
			System.out.println(str);
	}

}
