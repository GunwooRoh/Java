package assignment;

public class assignment04_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++)  {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println("1부터 10 까지의 합");
		for (int i = 1; i <= 10; i++) {
			String str = "";
			for (int j = 1; j <= i; j++) {
			 str += j;
			 if( j < i) str += "+";
			} System.out.println(str);
		}
	}
	
}
