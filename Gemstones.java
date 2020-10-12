import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Problem Statement -> https://www.hackerrank.com/challenges/gem-stones/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class Gemstones {

	/**
	 * @param arr
	 *
	 * @return
	 */
	public static int gemstones(String[] arr) {
		List<Integer> asc = new ArrayList<>();
		Set<Integer> integerSet = new HashSet<>();
		for(String s:arr){
			for(String ch : s.split("")){
				integerSet.add((int) ch.charAt(0));
			}
			asc.addAll(integerSet);
			integerSet.clear();
		}
		return  asc.stream().filter(val -> arr.length == Collections.frequency(asc, val)).collect(Collectors.toSet()).size();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			String arrItem = scanner.nextLine();
			arr[i] = arrItem;
		}
		int result = gemstones(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}
}
