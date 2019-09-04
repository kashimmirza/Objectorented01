 package Geometricob;
import java.util.*;
public class Problem07
  {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        String operation;
        boolean numIsAbc = true;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("please enter the first number");
                num1 = input.nextInt(); 
                System.out.println("please enter the second number");
                num2 = input.nextInt();
                numIsAbc = false;
            }catch(Exception e){
                 
                int[] numArray = new int[num1];
                for(int i =0; i< numArray.length ;i++){
            System.out.println(numArray.toString()+" "+"can't be mathematically compared to "+num2+" ");
                }
            }
        }while(numIsAbc == true);
 
        Scanner op = new Scanner(System.in);
 
        System.out.println("Please enter operation");
 
        operation = op.next();
 
        int num11 = num1;
        int num22 = num2;
        if (operation.equals("+")){
 
            System.out.println("your answer is " + (num11 + num22));
        }
        if (operation.equals("-"))
        {
            System.out.println("your answer is " + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("your answer is " + (num1 / num2));
        }
        if (operation .equals( "*"))
        {
            System.out.println("your answer is " + (num1 * num2));
        }
 
 
    }
}