import java.lang.String;

public class checkPerm{
	public static void main(String[] args){
		System.out.println(checkPerm("happy", "pahpy"));

		System.out.println(checkPerm("sad", "depressed"));

		System.out.println(checkPerm("google", "goggle"));
	}

	public static boolean checkPerm(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		int[] counter = new int[26];
		// Array of size 26 to keep track number of times we see a char
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		for(int i = 0; i< str1.length(); i++){
			int ascii = ((int) str1.charAt(i)) - 97;
			counter[ascii]++;
		}

		for(int j = 0; j< str2.length(); j++){
			int ascii = ((int) str2.charAt(j)) - 97;
			counter[ascii]--;
		}

		for(int k = 0; k< 26; k++){
			if(counter[k] > 0){
				return false;
			}
		}

		return true;
	}
}