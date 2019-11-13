import java.util.*;

public class ElementFromTop {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        
        if(stack.size()>=5){
       for(int i=0;i<4;i++)
       stack.pop();
       
       System.out.println(stack.pop());
        }
        else{
          System.out.println("There are not enough elements in the stack");
        }
        
    }
}