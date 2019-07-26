import java.io.*;
import java.util.*;
public class Pack  {
	 public static void stack_push(Stack<Integer>stack) {
		
		for(int i=1;i<5;i++) {
			stack.push(i);
			
		}
	}
	static void stack_pop(Stack<Integer>stack) {
		 for(int i=1;i<5;i++) {
			 int y=stack.pop();
			 System.out.println(y);
			 
		 }
		
	}
	static void stack_peek(Stack<Integer>stack) {
		Integer element=stack.peek();
		System.out.println(element);
		
		
	}
	static void stack_search(Stack<Integer>stack,int element) {
	     Integer pos=stack.search(element)	;
	     if(pos==-1)
	    	 System.out.println("element is not found");
		
	
	else
		System.out.println("element is found at"+pos);
	}
	public static void main(String []arg) {
		Stack<Integer>stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		
		
		stack_peek(stack);
		stack_search(stack,2);
		
		
	}

}
