package chapter3;

import java.util.NoSuchElementException;

public class QueueViaStacks<T>{
	private MyStack<T> storage;
	private MyStack<T> tempStack;

	public QueueViaStacks(){
		storage = new MyStack<>();
		tempStack = new MyStack<>();
	}

	public void add(T data){
		while(!storage.isEmpty()){
			tempStack.push(storage.pop());
		}

		tempStack.push(data);

		while(!tempStack.isEmpty()){
			storage.push(tempStack.pop());
		}

	}

	public T remove(){
		if(storage.isEmpty()){
			throw new NoSuchElementException();
		}
		return storage.pop();
	}

	public T peek(){
		if(storage.isEmpty()){
			throw new NoSuchElementException();
		}
		return storage.peek();
	}

	public boolean isEmpty(){
		return storage.isEmpty();
	}
}