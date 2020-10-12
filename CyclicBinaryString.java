import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/cyclic-binary-string
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class CyclicBinaryString {

	/**
	 * @param word
	 *
	 * @return
	 */
	public static int maximumPower(String word) {
		List<Integer> togetherOcc = new ArrayList<>();
		int len = 0;
		if(!word.contains("1")){
			return -1;
		}
		for (int i = 0; i < word.length(); i++){
			if(word.charAt(i) == '0'){
				len++;
				if(i == word.length()-1){
					if(word.charAt(0) == '0'){
						togetherOcc.add(len + togetherOcc.get(0));
					}else {
						togetherOcc.add(len);
					}
				}
			} else {
				togetherOcc.add(len);
				len = 0;
			}
		}
		return togetherOcc.stream().max(Integer::compareTo).get();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		System.out.println(maximumPower(s));
	}
}
