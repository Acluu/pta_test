package prime_pair;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		if (n <= 4) {
			System.out.print(0);
		} else if (n <= 6) {
			System.out.print(1);
		} else {
			int[] prime_list = new int[n/3+2];
			int flag = 1, count = 3;
			prime_list[0] = 2;
			prime_list[1] = 3;
			prime_list[2] = 5;
			for (int i = 6; i <= n; i++) {
				for (int j = 2; j < Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = 0;
						break;
					}
				}
				if (flag == 1) {
					prime_list[count++] = i;
				}
				flag = 1;
			}
			int sum = 0;
			for (int i = 0; i < count - 1; i++) {
				if ((prime_list[i + 1] - prime_list[i]) == 2) {
					sum++;
				}
			}
			System.out.println(Arrays.toString(prime_list));
			System.out.print(sum);
			
		}
	}

}
