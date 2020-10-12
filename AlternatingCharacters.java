import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/alternating-characters/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class AlternatingCharacters {

	/**
	 * @param s
	 *
	 * @return
	 */
	public static int alternatingCharacters(String s) {
		List<Character> deleted = new ArrayList<>();
		s=s.toUpperCase();
		for(int i=1;i<s.length();i++){
			if((int) s.charAt(i) == (int) s.charAt(i-1)){
				deleted.add(s.charAt(i-1));
			}
		}
		return deleted.size();
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
