package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();//n個人
		int l, r, s, t;
		for (int i = 0; i < n; i++) {
			System.out.print("聽力");
			l = scn.nextInt();
			
			System.out.print("閱讀");
			r = scn.nextInt();
			
			System.out.print("口說");
			s = scn.nextInt();
			t = l + r + s;//總分
			
			if (l >= 60 && r >= 60 && s >= 60 && t <= 300) {
				System.out.println("P");
				
			} else if (l < 60 && t > 220 || r < 60 && t > 220 || s < 60 && t > 220) {
				System.out.println("P");
				
			} else if (l < 60 && r >= 60 && s >= 60 && t < 220|| l >= 60 && r < 60 && s >= 60 && t < 220|| l >= 60 && r >= 60 && s < 60 && t < 220) {
				System.out.println("M");
				
			} else if (l < 60 && r < 60 && s >= 80 || l < 60 && r >= 80 && s < 60|| l >= 80 && r < 60 && s < 60) {
				System.out.println("M");
				
			} else if (l < 0 || l > 100 || r < 0 || r > 100 || s < 0 || s > 100) {
				System.out.println("請輸入0~100分");
				
			} else {
				System.out.println("F");
			}
		}
	}
}