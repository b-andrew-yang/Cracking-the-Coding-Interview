package chapter3;

public class Cat implements Animals{
	private String name;

	public Cat(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return "Cat";
	}
}