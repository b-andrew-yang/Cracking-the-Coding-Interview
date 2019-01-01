package chapter3;

import java.util.EmptyStackException;

public class MyStackSort<T> {
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;
		}
	}

	private MyStack<T> tmpStack;
	private MyStack<T> data;

	public MyStackSort(MyStack<T> input){
		data = input;
		tmpStack = new MyStack<>();
	}

	public MyStack<T> sort(){
		tmpStack.push(data.pop());
		// Push first element onto sorted stack.

		while(!data.isEmpty()){
			T tmpData = data.pop();
			if(tmpStack.peek() <= tmpData){
				tmpStack.push(data.pop());
			}else{
				while(tmpStack.peek() > tmpData){
					data.push(tmpStack.pop());
				}
				data.push(tmpData);
			}
		}
		return tmpStack;
	}
}