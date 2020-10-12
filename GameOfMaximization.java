import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Problem Description -> https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/stones-piles
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class GameOfMaximization {

	/**
	 * @param arr
	 *
	 * @return
	 */
	public static int maximumStones(List<Integer> arr) {
		int sum1=0,sum2=0;
		for(int i=0;i<arr.size();i++){
			if(i%2==0){
				sum1+=arr.get(i);
			} else{
				sum2+=arr.get(i);
			}
		}
		if(sum1<sum2){
			return 2*sum1;
		}else{
			return 2*sum2;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");
		List<Integer> arr = Arrays.stream(array).map(Integer::parseInt).collect(Collectors.toList());
		scan.close();

		System.out.println(maximumStones(arr));
	}
}
