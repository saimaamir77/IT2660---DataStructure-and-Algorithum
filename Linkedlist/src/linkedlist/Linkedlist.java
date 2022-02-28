
package linkedlist;


public class Linkedlist {

    
    public static void main(String[] args) {
         SinglyLinkedList cleveland= new SinglyLinkedList();
        Node  L1 = new Node( "saima","2nd Ave", "54320");
        Node L2 = new Node( "test","3rd Ave", "55320");
        Node L3 = new Node( "fasi","4th Ave", "56320");
        Node L4 = new Node ("amir", "dont now ", "34343");
       Node L5 = new Node ("afnan", "address of test","address phone");
       
    cleveland.NewNode(L1);
    cleveland.Append(L2); 
    cleveland.Append(L3);
    cleveland.insertNodeAtPosition(L5,1);    
    cleveland.Append(L4);
    cleveland.showAll();
    Node nodefound = cleveland.fetch("amir");
    System.out.println(nodefound.getValue());
    System.out.println(cleveland.delete("afnan"));
    cleveland.showAll();
    cleveland.update("amir", L2);
    cleveland.showAll();
    System.exit(0);
    
    
    
    }
    
}
    
    

