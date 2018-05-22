package alma;
import java.util.Scanner;

public class feladat01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Irja be az a erteket:");
		int a = input.nextInt();
		System.out.println("Irja be a b erteket:");
		int b = input.nextInt();
		System.out
				.println("1 - osztas, 2 - szorzas, 3 - osszeadas, 4 - kivonas");
		int sw_feladat = input.nextInt();
		if (sw_feladat == 1 && b == 0) {
			System.out.println("Hiba nullaval nem osztunk.");

		} else {
			int eredmeny = a - b;
			switch (sw_feladat) {
			case '1':
				System.out.println("Az eredmeny: " + a / b);
				break;
			case '2':
				System.out.println("Az eredmeny: " + a * b);
				break;
			case '3':
				System.out.println("Az eredmeny: " + a + b);
				break;
			case '4':
				System.out.println("Az eredmeny: " + eredmeny);
				break;
			}
		}

	}
}
