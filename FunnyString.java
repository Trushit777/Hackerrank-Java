import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/funny-string/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class FunnyString {

	/**
	 * @param s 
	 *
	 * @return
	 */
	public static String checkFunny(String s){
		String funny = "Not Funny";
		List<Integer> asc0 = new ArrayList<>();
		String[] c=s.split("");
		for(String ch:c){
			asc0.add((int) ch.charAt(0));
		}
		List<Integer> diffList = new ArrayList<>();
		List<Integer> rdiffList = new ArrayList<>();
		for(int i=1;i<asc0.size();i++){
			diffList.add(Math.abs(asc0.get(i)-asc0.get(i-1)));
		}
		Collections.reverse(asc0);
		for(int i=1;i<asc0.size();i++){
			rdiffList.add(Math.abs(asc0.get(i)-asc0.get(i-1)));
		}
		if(rdiffList.equals(diffList)){
			funny = "Funny";
		}
		return funny;
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			String result = checkFunny(s);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
