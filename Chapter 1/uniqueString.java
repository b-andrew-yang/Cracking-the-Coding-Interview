//import java.util.String;

public class uniqueString{
	public static void main(String[] args){
		System.out.println(checkUnique("abcde"));
		System.out.println(checkUnique("hello"));
		System.out.println(checkUnique("apple"));
		System.out.println(checkUnique("kite"));
		System.out.println(checkUnique("padle"));

		// true
		// false
		// false
		// true
		// true
	}

	public static boolean checkUnique(String s){
		String sLower = s.toLowerCase();

		for(int i = 0; i< sLower.length(); i++){
			for(int j = i + 1; j< sLower.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					return false;
				}
			}	
		}
		return true;
	}
}
