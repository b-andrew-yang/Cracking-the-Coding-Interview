package chapter3;

import java.util.IllegalArgumentException;

public class AnimalShelter{
	private static AnimalShelter shelter = new AnimalShelter();
	private LinkedList<Animal> inventory;

	private AnimalShelter(){
		inventory = new LinkedList<>();
	}

	public static AnimalShelter getInstance(){
		return shelter;
	}

	public void enqueue(Animals newAnimal){
		inventory.add(newAnimal);
	}

	public Animals dequeueAny(){
		return inventory.remove();
	}

	public Animals dequeueDog(){
		for(Animals a: inventory){
			if(a.getType().equals("Dog")){
				Animals temp = a;
				inventory.remove(inventory.indexOf(a));
				return temp;
			}else{
				throw new IllegalArgumentException("No dogs available");
			}
		}
	}

	public Animals dequeueCat(){
		for(Animals a: inventory){
			if(a.getType().equals("Cat")){
				Animals temp = a;
				inventory.remove(inventory.indexOf(a));
				return temp;
			}else{
				throw new IllegalArgumentException("No cats available");
			}
		}
	}
}