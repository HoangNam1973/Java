import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập Tháng : ");
			n = sc.nextInt();
			if(n < 1 || n > 12)
			System.out.println("Mời bạn nhập lại tháng : ");
		}while(n < 1 || n > 12);
		System.out.println("Tháng "+ n);
	}
}
