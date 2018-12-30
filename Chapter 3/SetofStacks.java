package chapter3;

import java.util.LinkedList;

public class SetofStacks<T>{
	private LinkedList<MyStack<T>> setOfStacks;
	private int currStack;
	private int numStack;

	public SetofStacks(){
		setOfStacks = new LinkedList<MyStack<T>>();
		MyStack<T> newStack = new MyStack<T>();
		setOfStacks.add(newStack);

		currStack = 0;
		numStack = 1;
	}

	public T pop(){
		MyStack<T> tmpStack = setOfStacks.get(numStack - 1);
		return tmpStack.pop();
	}

	public void push(T data){
		if(currStack >= 10){
			MyStack<T> newStack = new MyStack<T>();
			newStack.push(data);
			setOfStacks.add(newStack);
			numStack++;
			currStack = 0;
		}else{
			MyStack<T> tmpStack = setOfStacks.get(numStack - 1);
			tmpStack.add(data);
			currStack++;
		}
	}

	public int getNumStack(){
		return numStack;
	}

	public int getCurrStack(){
		return currStack;
	}
}