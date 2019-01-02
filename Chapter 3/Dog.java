package chapter3;

public class Dog implements Animals{
	private String name;

	public Dog(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return "Dog";
	}
}