package alma;

import java.util.Random;

public class feladat02 {
	public static void main(String[] args) {
		int max=0;
		Random rand = new Random();
		int tomb[] = new int[10];
		for (int i = 0; i < 10; i++) {
			tomb[i] = rand.nextInt(50) + 1;
			if(max<tomb[i]){
				max=tomb[i];
			}
			System.out.println(i + ":" + tomb[i]);
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(i + ":" + tomb[i]);
		}
		System.out.println("Legnagyobb szam: "+max);
	}
}