package evOd;

import java.util.Scanner;

public class EvOd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pop = new Scanner(System.in);
		System.out.println("Enter The numher:_ ");
		int a = pop.nextInt();
		EvOd.evo(a);
		pop.close();

	}

	private static void evo(int a) {
		if (a % 2 == 0) {
			System.out.println("the number you entered(" + a + ") is Even");
		} else {
			System.out.println("the number you entered(" + a + ") is Odd");
		}
	}

}
