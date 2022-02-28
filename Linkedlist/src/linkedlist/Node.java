
package linkedlist;

import java.util.Scanner;

public class Node {
    private String name;
    private String address;
    private String number;
    public Node  (String n,String a, String num){
        name =n;
        address= a;
        number= num;
        
    }
    
    public String getName()
    {
        return this.name;
    }
//    public Node deepCopy()
//    {
//        Node clone= new Node(name, address, number);
//        return clone;
//    }
//    public int campareTo(String targetKey)
//    {return(name.compareTo(targetKey));
//    }
//    
//    public void setaddress(String a){
//        
//        address= a;
//    }
//
    public String getValue() {
        return "Name: " + this.name + " Address: " + this.address + " Number:  " + this.number ;
    }
//    
//}
    //private String value;
    private Node next;

	//Node(String value) { this.value = value; }

	public Node getNextNode() { return this.next; }

	public void setNextNode(Node node) { this.next = node; }

	
	public void print() {
		Node walker = this;
		System.out.print("[" + this.name + "] ");
                System.out.print("[" + this.address + "] ");
                System.out.print("[" + this.number + "] ");
		while (walker.getNextNode() != null) {
			walker = walker.getNextNode();
			System.out.print("[" + this.name + "] ");
                        System.out.print("[" + this.address + "] ");
                        System.out.print("[" + this.number + "] ");
		}
	}
}