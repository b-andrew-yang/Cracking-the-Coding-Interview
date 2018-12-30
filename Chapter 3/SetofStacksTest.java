package chapter3;

public class SetofStacksTest{
	public static void main(){
		SetofStacks<Integer> test = new SetofStacks<Integer>();

		for(int i = 0; i< 15; i++){
			test.push(i);
		}

		if(test.getNumStack() == 2){
			System.out.println("Created new Stack correctly");
		}

		if(test.getCurrStack() == 5){
			System.out.println("Number of elements in last stack correct");
		}

		for(int i = 0; i< 100; i++){
			test.push(i);
		}

		if(test.getNumStack() == 12){
			System.out.println("Large number of pushes added correctly");
		}
	}
}