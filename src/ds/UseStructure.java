package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseStructure {
	
	LinkedList<String> list;
	ArrayList<String> arrayList;
	Stack<String> stack;
	Queue<String> queue;
	
	//add data into the LinkedList
	public void addByLinkedList(String name){
 		list.add(name);
	}
	
	//Retrieve data and return the LinkedList
	public LinkedList<String> returnByLinkedList(String name){
		list.add(name);
		System.out.println("New element <" + name + "> is added to LinkedList.");
		return list;
	}
	
	//add data into the ArrayList
	public void addByArrayList(String name){
		arrayList.add(name);
	}
	
	//Retrieve data and return the ArrayList
	public ArrayList<String> returnByArrayList(String name){
		arrayList.add(name);
		System.out.println("New element <" + name + "> is added to ArrayList.");
		return arrayList;
	}
	
	//add data into the Stack
	public void addByStack(String name) {
		stack.push(name);
	}
	
	//Retrieve data and return as Stack order
	public Stack<String> returnByStack(String name){
		stack.push(name);
		System.out.println("The element <" + name + "> is pushed to Stack.");
		name = stack.pop();
		System.out.println("The element <" + name + "> is popped from Stack.");
		return stack;
	}
	
	//add data in Queue order
	public void addByQueue(String name){
		queue.add(name);
	}
	
	//Retrieve data and return in Queue order
	public Queue<String> returnByQueue(String name){
		queue.add(name);
		System.out.println("The element <" + name + "> is added to Queue.");
		name = queue.poll();
		System.out.println("The element <" + name + "> is polled from Queue.");
		return queue;
	}
}
