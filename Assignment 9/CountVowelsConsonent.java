import java.util.Arrays;

public class CountVowelsConsonent {

	public static void main(String[] args) {

		int vowels = 0;
		int consonants = 0;
		char[] input = new char[3];
		input[0] = 'h';
		input[1] = 'i';
		input[2] = 'a';

		System.out.println(" The given paragraph is:");
		System.out.println(Arrays.toString(input));

		for (int i = 0; i < 3; i++) {

			if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {

				vowels++;

			}

			else {
				consonants++;
			}
		}
		System.out.println("the count of vowels is: "+vowels);
		System.out.println("the count of consaonats is :"+consonants);
		

	}

}
