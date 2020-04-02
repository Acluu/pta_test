package heappath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PTA test 最小堆路径
 * 
 * @author Acluu 将一系列给定数字插入一个初始为空的小顶堆H[]。 随后对任意给定的下标i，打印从H[i]到根结点的路径。
 *         插入元素的个数、以及需要打印的路径条数。 下一行给出区间[-10000, 10000]内的N个要被插入一个初始为空的小顶堆的整数。
 *         最后一行给出M个下标
 *
 *         对输入中给出的每个下标i，在一行中输出从H[i]到根结点的路径上的数据。 数字间以1个空格分隔，行末不得有多余空格。
 */
public class Main {
	public static int size = 0;
	public static int[] heap;
	public static void insert(int x) {
		int i = ++size;// 指向插入后堆末尾元素
		for (; heap[i / 2] > x; i /= 2) {
			heap[i] = heap[i / 2];
		}
		heap[i] = x;
	}

	public static void findpath(int loc) {
		while (loc > 1) {
			System.out.printf("%d ",heap[loc]);
			loc /= 2;
		}
		System.out.println(heap[1]);
	}

	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String firstline = reader.readLine();
 		String[] fls = firstline.split("\\s+");
 		int N =Integer.parseInt(fls[0]);
		int pathnum = Integer.parseInt(fls[1]);
		heap = new int[N + 1];
		heap[0] = -10001;
		int inpu;
		String secondline = reader.readLine();
		String[] sls = secondline.split("\\s+");
		for (int i = 0; i < N; i++) {
			inpu = Integer.parseInt(sls[i]);
			insert(inpu);
		}
		int lowerc;
		String thirdline = reader.readLine();
		String[] tls = thirdline.split("\\s+");
		for (int i = 0; i < pathnum; i++) {
			lowerc = Integer.parseInt(tls[i]);
			findpath(lowerc);
		}
		reader.close();
	}

}
