package chapter3;

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
			}
		}
		System.out.println("No dogs available");
	}

	public Animals dequeueCat(){
		for(Animals a: inventory){
			if(a.getType().equals("Cat")){
				Animals temp = a;
				inventory.remove(inventory.indexOf(a));
				return temp;
			}
		}
		System.out.println("No cats available");
	}
}