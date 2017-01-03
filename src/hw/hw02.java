package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int v3 = scn.nextInt();
		int v4 = scn.nextInt();

		if (v1 == v2 || v2 == v3 || v3 == v4 || v4 == v1 || v1 == v3 || v2 == v4) {
			while (true) {
				if (v1 == v2 && v3 == v4 && v2 == v3 && v1 == v4) {
					while (true) {
						System.out.print("通殺");
						break;
					}
					break;
				} else if (v1 == v2) {
					i = v3 + v4;
					break;
				} else if (v1 == v3) {
					i = v2 + v4;
					break;
				} else if (v1 == v4) {
					i = v2 + v3;
					break;
				} else if (v2 == v3) {
					i = v1 + v4;
					break;
				} else if (v2 == v4) {
					i = v1 + v3;
					break;
				} else if (v3 == v4) {
					i = v1 + v2;
					break;
				}
				System.out.print(i);
			}
		} else {
			System.out.print("無意義");
		}
	}
}