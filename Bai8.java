import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử mảng n : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<a.length;i++) {
			System.out.println("Phần tử thứ " + (i+1) + " : ");
			a[i] = sc.nextInt();
			tong += a[i];
		}
		int tbc = tong / a.length;
		System.out.println("Trung bình cộng của mảng là : " + tbc);
	}
}
