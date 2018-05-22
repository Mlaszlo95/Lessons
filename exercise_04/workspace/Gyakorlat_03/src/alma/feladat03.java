package alma;

import java.util.Scanner;

public class feladat03 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double szorzat=0;
		System.out.println("Irja be a tort erteket, 10 db-ot:");
		for(int i=0;i<10;i++){
			szorzat=szorzat*input.nextDouble();
		}
		System.out.println("Ennyi a mertani atlag: "+Math.pow(szorzat,(-1)*10));
	}
}
