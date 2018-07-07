import java.lang.String;

public class palPerm{
	public static void main(String[] args){
		System.out.println(palPerm("taco cat"));
		System.out.println(palPerm("racecar"));
		System.out.println(palPerm("perm"));
	}

	public static boolean palPerm(String s){
		s = s.replaceAll("\\s+","");

		if(s.length() % 2 == 0){
			return false;
		}

		int[] counter = new int[26];
		s = s.toLowerCase();
		for(int i = 0; i< s.length(); i++){
			int ascii = (((int)s.charAt(i)) - 97);
			counter[ascii]++;
		}

		int odd = 1;
		for(int j = 0; j< 26; j++){
			if(odd > 0){
				if(counter[j] % 2 != 0){
					odd--;
				}
			}else if(odd < 1){
				if(counter[j] % 2 != 0){
					return false;
				}
			}
		}
		return true;
	}
}