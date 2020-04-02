package shalou;

import java.util.*;

public class Test_1 {
	public static String jiaxingxing(int p, String s) {
		String ss = "";
		for (int i = 0; i < p; i++) {
			ss += s;
		}
		return ss;
	}
	public static String addspace(int max, int n) {
		String ss = "";
		for (int i = 0; i < (max-n)/2; i++) {
			ss += " ";
		}
		return ss;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String c = in.next();
		in.close();
		if (n < 1) {
			System.out.print(n);
		} else {
			String[] shalou = new String[25];
			shalou[0] = c;
			int ceng = 3, floor = 1;
			n--;
			while (n >= 2 * ceng) {
				shalou[floor] = jiaxingxing(ceng, c);
				n -= (2 * ceng);
				ceng += 2;
				floor++;
			}
			int yy = 0;
			while (shalou[yy] != null) {
				yy++;
			}
			yy--;
			int max_floor = yy;
			int max_xx=shalou[max_floor].length();
			for (; yy >= 0; yy--) {
				shalou[yy]=addspace(max_xx,shalou[yy].length())+shalou[yy];
				System.out.println(shalou[yy]);
			}
			for(int i=1;i<=max_floor;i++) {
				System.out.println(shalou[i]);
			}
			System.out.print(n);
			
		}
	}

}
