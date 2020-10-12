import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/bon-appetit/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class BillDivision {

	/**
	 * @param bill
	 * @param k
	 * @param b
	 */
	static void bonAppetit(List<Integer> bill, int k, int b) {
		bill.remove(k);
		AtomicInteger sum = new AtomicInteger();
		bill.forEach(sum::addAndGet);
		double anna = sum.get() / 2.0;
		if (b == anna){
			System.out.println("Bon Appetit");
		} else {
			System.out.println((int)(b-anna));
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int k = Integer.parseInt(s[1]);
		String[] nArray = scan.nextLine().split(" ");
		int b = scan.nextInt();
		scan.close();
		List<Integer> bill = Arrays.stream(nArray).map(Integer::parseInt).collect(Collectors.toList());

		bonAppetit(bill,k,b);
	}
}
