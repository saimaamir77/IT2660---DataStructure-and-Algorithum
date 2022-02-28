
package assignment3;
import java.util.Stack;
import java.util.Scanner;
public class Assignment3 {
 int Stack;
    
    public static void main(String[] args) {
        GenericStack  STACK = new GenericStack();
        
        
        Node  L1 = new Node( "saima","2nd Ave", "54320");
        Node L2 = new Node( "test","3rd Ave", "55320");
        Node L3 = new Node( "fasi","4th Ave", "56320");
        Node L4 = new Node ("amir", "dont now ", "34343");
       Node L5 = new Node ("afnan", "address of test","address phone");
       
        if (STACK.pop() == null)
        System.out.println("The stack is Empty ");
        
        if (STACK.peek() == null)
        System.out.println("The stack is Empty nothing at Peek ");
        
        
        STACK.push(L1);
        STACK.push(L2);
        STACK.push(L3);
        
        System.out.println("The stack Peek is  " + STACK.peek());
        
        if ( !STACK.push(L4) )
        System.out.println("The stack is Full" );
        
        STACK.showAll();
        //Need to add functionaly for Peek
        
        //
        
        STACK.pop();
        STACK.pop();
        STACK.pop();
        //STACK.pop();
        //STACK.pop();
        if (STACK.pop() == null)
        System.out.println("The stack is Empty ");
        
        
        
    }       
    
}
