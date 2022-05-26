package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Please put value below:");
		Scanner scanner = new Scanner(System.in);

		int tamp1 = scanner.nextInt();
		int tamp2 = scanner.nextInt();

		if (tamp1 > tamp2) {
			System.out.println(tamp1 + "Freezing" + tamp2);
		} else if (tamp1 < tamp2) {
			System.out.println(tamp1 + "Pleasant" + tamp2);
		} else if (tamp1 == tamp2) {
			System.out.println(tamp1 + "Getting Warmer" + tamp2);
		} else if (tamp1 != tamp2) {
			System.out.println(tamp1 + "Hot" + tamp2);
		}else {
			
		}
         scanner.close();
         
	}
}