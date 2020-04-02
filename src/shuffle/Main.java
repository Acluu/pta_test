package shuffle;

import java.util.*;

public class Main {

	public static String[] prim() {
		String[] huase = { "S", "H", "C", "D" };
		String[] raw = new String[54];
		int count = 0;
		for (String s : huase) {
			for (int i = 1; i <= 13; i++) {
				raw[count] = "" + s + i;
				count++;
			}
		}
		raw[52] = "J1";
		raw[53] = "J2";
		return raw;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		in.close();
		int[] a = new int[54];
		String[] ss = s.split("\\s+");
		
		
		String[] firstpos = prim();
		for (int i = 0; i < 54; i++) {
			a[i] = Integer.parseInt(ss[i]);
		}
		String[] process = prim();
		
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 54; j++) {
				process[a[j] - 1] =firstpos[j];
				
			}
			System.arraycopy(process, 0, firstpos, 0, 54);
		}
		for (int i = 0; i < 53; i++)
			System.out.printf("%s ", process[i]);
		System.out.print(process[53]);

	}

}
