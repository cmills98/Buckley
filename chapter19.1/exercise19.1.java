//   - E[] arr:   - array to store elements (initial capacity - 10 elements)
//   - last: int   - index of the last element
// 
//   + GenericStack()   - creates an empty stack
//   + getSize(): int     - Returns the number of elements in this stack
//   + peek(): E    - Returns the top element in this stack (null if it is empty)
//   + pop(): E    - Returns and removes the top element in this stack (returns null if it is empty)
//   + push(o: E): void     - Adds a new element to the top of this stack
//   + isEmpty(): boolean    - Returns true if the stack is empty
//   + toString(): String    - Returns  a string description of the stack “Stack: [2, 3]”

import java.util.*;
import java.io.*;

public class genericStacks {
	
	
static  class GenericStack<E> {

    private int capacity = 10;
    private int size;
    private E[] list = (E[])new Object[capacity];
    private int last = list.length;

    GenericStack() {

    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0)
            return null;
        else
            return list[size - 1];
    }

    public void push(E o) {
        list[size++] = o;
        if (size == capacity) {
            E[] tmp = (E[])new Object[capacity *= 2];
            for(int k = 0; k < list.length; k++){
            	if (list[k] != null){
            		tmp[k] = list[k];
            	}
            	
            }
            list = tmp;
        }
    }

    public E pop() {
        if (size == 0)
            return null;
        else
            return list[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
    	
    	
        	String stringArray = "[";
    	for(int i = 0; i < list.length; i++)
    	{
    		if(list[i] != null){
    			if(i>0){
        			stringArray = stringArray + "," + list[i];
    			}
    			else{
    				stringArray += list[i];
    			}
    		}
    	}
        return "stack: " + stringArray + "]";
    }
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   GenericStack<String> stack1 = new GenericStack<>(); 
		   
		   System.out.println("Stack1 size before adding elements: " + stack1.getSize());
		   stack1.push("London");
		   stack1.push("Paris");
		   stack1.push("LA");

		   System.out.println(stack1);
		   System.out.println("Stack1 size after adding elements:" + stack1.getSize());
		 
		   GenericStack<Integer> stack2 = new GenericStack<>();
		   stack2.push(2);
		   stack2.push(-9);
		   System.out.println("\n" + stack2.peek());
		   stack2.push(21);
		   System.out.println(stack2.pop());
		   stack2.push(29);
		   System.out.println(stack2);
		   System.out.println("Stack2 size: " + stack2.getSize());

		   GenericStack<Integer> stack3 = new GenericStack<>();
		   for (int i = 0; i < 100; i++)
		      stack3.push(i);
		   System.out.println("\n Stack3 size: " + stack3.getSize());
	}
	 

}

