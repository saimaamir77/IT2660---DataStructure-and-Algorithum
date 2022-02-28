/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


class SinglyLinkedList {
    private Node _root ;
    private  Node _last ;
    private int   _size ;
  
    public void NewNode(Node node)
    {
        _root = node;
        _last = node;
        _size = 1;
    }    
    public void Append(Node node)
    {        
        _last.setNextNode( node);
        _last = node; 
        _size = _size +1;
                
    }    
    //always insert at 0 place
    public void insertNodeAtPosition(Node newNode, int position) 
    {

		// Edge Cases
		if (position == 0) {  insertNewRoot(newNode); }
		if (position == _size) {  Append(newNode); }
                
                else 
                {
                    insert(newNode, position);
                }
		// General Cases
		
    }
    public void insertNewRoot(Node node)
    {
       node.setNextNode(_root);
       _root = node;
       _size = _size +1; 
    }    
    private void insert(Node node, int position)
    {
        Node targetNode =  GetNode(position-1,false );
        node.setNextNode(targetNode.getNextNode());
        targetNode.setNextNode(node);
        _size = _size + 1;
        
    }    
    public Node GetNode(int position, boolean shouldPrint)
    {
        Node walker = _root;

		for (int i=1; i <= position; i++) {
			if (shouldPrint) {
				System.out.println(walker.getValue() + " ");
			}
			walker = walker.getNextNode();
		}

		return walker;
    }    
    public void showAll()
    {
        Node walker = GetNode(_size, true);
    }    
    public Node fetch (String searchValue)
    {
        Node walker = _root;

		for (int i=1; i <= _size; i++) {
			
			if (walker.getName() == searchValue)
                            return walker;
                        walker = walker.getNextNode();
		}

		return walker;
    }   
    public boolean delete (String valueToDelete)
    {
        boolean delete = false;
        Node walker = _root;
        int count = _size;
		for (int i=1; i <= count; i++) {
			
			if (walker.getName() == valueToDelete){
                           if (i == 1 ){
                               _root = GetNode(i+1, false);
                               _size = _size -1;
                               break;
                            } 
                           if ( i == _size ){
                               _last = GetNode(i-2, false);
                               _size = _size -1 ;
                               break;
                           } 
                            
                          Node previousNode = GetNode(i-2,false);
                          Node CurrentNodes_nextNode = walker.getNextNode();
                          previousNode.setNextNode(CurrentNodes_nextNode);
                          _size = _size - 1;
                          delete = true;
                          break;
                        }
                        walker = walker.getNextNode();
                            
		}

		return delete;
    }    
    public boolean update (String valueToUpdate, Node node){
        boolean update = false;
        Node walker = _root;
        

		for (int i=0; i < _size; i++) {
			
			if (walker.getName() == valueToUpdate){
                          delete(valueToUpdate);
                          insertNodeAtPosition(node, i);                          
                          update = true;
                          break;
                        }
                        walker = walker.getNextNode();
                            
		}

		return update;
    }
    
    
    
}