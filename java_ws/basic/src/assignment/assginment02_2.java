package assignment;

import java.io.IOException;
import java.util.Scanner;

public class assginment02_2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("직업을 입력하세요 : A. 회사원 B. 학생 C. 주부 D. 기타");
		int code = System.in.read();
		char job = (char)code;
		char upperCase = Character.toUpperCase(job);
		String str = "";
		
		switch(Character.toUpperCase(job)) { 
		case 'A' :
			str = "회사원이시군요";
			break;
			
		case 'B' :
			str = "학생이시군요";
			break;
		
		case 'C' :
			str = "주부시군요";
			break;
		
		case 'D' :
			str = "기타시군요";
			break; 
		
		default :
			str = "잘못입력했어요";	
		}
		System.out.println(str.toUpperCase());
	

	}

}
