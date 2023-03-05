import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên : ");
		String name = sc.nextLine();
		System.out.println("Nhập năm sinh : ");
		int n = sc.nextInt();
		if(2023-n < 16)
			System.out.println("Bạn "+ name +" ở độ tuổi vị thành niên");
		else if(2023-n >= 16 & n < 18)
			System.out.println("Bạn "+ name +" ở độ tuổi trưởng thành");
		else
			System.out.println("Bạn "+ name + " đã già");
	}
}
