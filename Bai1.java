import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên thứ nhất : ");
		int a = sc.nextInt();
		System.out.println("Nhập số nguyên thứ hai :");
		int b = sc.nextInt();
		System.out.println("Tổng của hai số là : "+ (a+b));
		System.out.println("Tích của hai số là : "+ (a*b));
		System.out.println("Hiệu của hai số là : "+ (a-b));
		System.out.println("Thương của hai số là : "+ (a/b));
		System.out.println("Thương lấy dư của hai số là : "+(a%b));
		if(a > b)
			System.out.println("a > b");
		else if(a<b)
			System.out.println("a < b");
		else 
			System.out.println("a = b");
	}
}
