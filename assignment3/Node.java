
package assignment3;

import java.util.Scanner;

public class Node {
    private String name;
    private String address;
    private String number;
    public Node  (String n,String a, String num){
        name = n;
        address = a;
        number = num;
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public Node deepCopy()
    {
        Node clone= new Node(name, address, number);
        return clone;
    }
    public int campareTo(String targetKey)
    {return(name.compareTo(targetKey));
    }
    
    public void setaddress(String a){
        
        address= a;
    }

    public String toString() {
        return "Name: " + this.name + " Address: " + this.address + " Number:  " + this.number ;
    }
   	
     public void input()
        {
           Scanner sc = new Scanner(System.in); 
           System.out.print ("Enter student name:  >> ");
           this.name = sc.nextLine();
           System.out.print ("Enter student Id:  >> ");
           this.address = sc.nextLine();
           sc.nextLine();
           System.out.print ("Enter student average grade: >> ");
           this.number = sc.nextLine();
           sc.nextLine(); 
 
        }
	
}