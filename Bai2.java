import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên x : ");
		int x = sc.nextInt();
		if(x % 2 == 0)
			System.out.println("x là số chẵn");
		else 
			System.out.println("x là số lẻ");
	}
}
