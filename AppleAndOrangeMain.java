import java.util.Scanner;

/**
 * @author @Trushit777
 * @change Unnecessary Imports removed and necessary import added to the code.
 * @since 12-10-2020
 */
public class Solution {

	/**
	 * @param s
	 * @param t
	 * @param a
	 * @param b
	 * @param apples
	 * @param oranges
	 */
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount=0,orangeCount=0;

		for(int i : apples){
			if(a+i>=s && a+i<=t){
				appleCount++;
			}
		}
		for(int o : oranges){
			if(b+o>=s && b+o<=t){
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");

		int s = Integer.parseInt(st[0]);

		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");

		int a = Integer.parseInt(ab[0]);

		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		int[] apples = new int[m];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[n];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);

		scanner.close();
	}
}
