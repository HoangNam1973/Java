import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		int gt = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n;i++) {
			gt *= i;
		}
		System.out.println(n + "! = " + gt);
	}
}
