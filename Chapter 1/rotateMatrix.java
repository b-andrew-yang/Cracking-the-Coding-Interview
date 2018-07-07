import java.util.Arrays;

public class rotateMatrix{
	public static void main(String[] args){
		int[][] a1 = new int[3][3];

		int index = 0;
		for(int i = 0; i< a1.length; i++){
			for(int j = 0; j< a1[0].length; j++){
				a1[i][j] = index;
				index++;
			}
		}
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(rotate(a1)));
	}

	public static int[][] rotate(int[][] original){
		int[][] rotated = new int[original.length][original[0].length];

		for(int i = 0; i< original.length; i++){
			for(int j = 0; j< original[0].length; j++){
				rotated[j][original.length - i - 1] = original[i][j]; 
			}
		}
		return rotated;
	}
}