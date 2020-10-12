import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/drawing-book/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class DrawingBook {

	/**
	 * @param n
	 * @param p
	 *
	 * @return
	 */
	static int pageCount(int n, int p) {
		if(p > n/2.0){
			return p%2 == 0 ? (n-p) / 2 : (n-p+1) / 2;
		} else {
			return p%2 == 0 ? ((p-1) / 2) + 1 : (p-1) / 2;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int reach = scan.nextInt();
		System.out.println(pageCount(total,reach));
	}
}
