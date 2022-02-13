


package assignment2;
import java.util.Scanner;

public class Node implements Comparable<Node> {
    private String Name;
    private int id;
    private double gradeavg;
    public Node  (String n,int i, double d){
        Name=n;
        id= i;
        gradeavg=d;
    }
    
    @Override
    public int compareTo(Node obj){
        return (this.Name.compareTo(obj.Name));
    }
    
    
public String toString ( ){
       
     return ( " Name is " + this.Name +  " and  id is " + this.id +" and gradeavg is "+ this.gradeavg); 
    
    }

    public Node deepCopy () {
        Node clone = new Node ( Name, id, gradeavg);
        return clone;
    }
    
public int compareTo0( String targetKey)
    { 
        return(Name. compareTo(targetKey));
    }

        public void input()
        {
            System.out.println("enter name " + "enter id" + "enter grade");   
 
        }
        
        



}