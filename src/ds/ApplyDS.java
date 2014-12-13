package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ApplyDS {

	public static void main(String[] args) {
		/*
		 * UseStructure can be applied here to demonstrate how to add and retrieve.
		 * 
		 */
		UseStructure structure = new UseStructure();
		structure.arrayList = new ArrayList<String>();
		
		structure.addByArrayList("Array element Nub1");
		structure.addByArrayList("Array element Nub2");
		structure.addByArrayList("Array element Nub3");

		String element = "Array element Nub4";
		ArrayList<String> array = new ArrayList<String>();
		array = structure.returnByArrayList(element);
		for (String str : array) {
			System.out.println("Next element: " + str);
		}
		System.out.println();
		
		structure.list = new LinkedList<String>();
		
		structure.addByLinkedList("Array element Nub5");
		structure.addByLinkedList("Array element Nub6");
		structure.addByLinkedList("Array element Nub7");

		element = "Array element Nub8";
		LinkedList<String> list = new LinkedList<String>();
		list = structure.returnByLinkedList(element);
		for (String str : list) {
			System.out.println("Next element: " + str);
		}
		System.out.println();
		
		structure.stack = new Stack<String>();
		
		structure.addByStack("Array element AA");
		structure.addByStack("Array element BB");
		structure.addByStack("Array element CC");

		element = "Array element DD";
		Stack<String> stack = new Stack<String>();
		stack = structure.returnByStack(element);
		while ( !stack.isEmpty() ) {
			System.out.println("Next popped: " + stack.pop());
		}
		System.out.println();
		
		structure.queue = new LinkedList<String>();
		
		structure.addByQueue("Array element A");
		structure.addByQueue("Array element B");
		structure.addByQueue("Array element C");

		element = "Array element D";
		Queue<String> queue = new LinkedList<String>();
		queue = structure.returnByQueue(element);
		while ( !queue.isEmpty() ) {
			System.out.println("Next polled: " + queue.poll());
		}
		
	}

	}


