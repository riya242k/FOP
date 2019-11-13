import java.util.*;

public class ElementFromBottom {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
         if(stack.size()<5){
             System.out.println("There are not enough elements in the stack");
         }
         else{
             int n=stack.size();
             for(int i=0;i<n-5;i++)
             {
                 stack.pop();
             }
              System.out.println(stack.peek());
         }
      
    }
}