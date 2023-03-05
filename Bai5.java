import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		 int sum = 0, n;
		    Scanner sc = new Scanner(System.in);
		    do {
		        System.out.println("Nhập n :");
		        n = sc.nextInt();
		        sum += n;
		            
		        if (sum > 100)
		            break;
		    } while (n > 0);
		         
		    System.out.println("Tổng = " + sum);
	}
}
