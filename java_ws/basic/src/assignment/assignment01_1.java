package assignment;

import java.util.Scanner;

public class assignment01_1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("정수 하나를 입력 해주세요. : ");
      int a = sc.nextInt();
      System.out.println(((a % 2) == 1) ? "홀수 입니다." : "짝수 입니다.");
   }

}