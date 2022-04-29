package binary.tree;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


        


/**
 *
 * @author saafp
 */
public class BinaryTreeClass {
    
 
    //node class that defines BST node
    class Node { 
        Student key; 
        Node left, right; 
   
        public Node(Student data){ 
            key = data; 
            left = right = null; 
        } 
    } 
    // BST root node 
    Node root; 
  
   // Constructor for BST =>initial empty tree
    public BinaryTreeClass(){ 
        root = null; 
    } 
    //delete a node from BST
    void deleteKey(String search_key) { 
        root = delete_Recursive(root,  search_key); 
    } 
   
    //recursive delete function
    Node delete_Recursive(Node root, String search_key)  { 
        //tree is empty
        if (root == null)  return root; 
   
        //traverse the tree-
        if (root.key.getName().compareTo (search_key) > 0)     //traverse left subtree 
            root.left = delete_Recursive(root.left, search_key); 
        else if (root.key.getName().compareTo (search_key) < 0)  //traverse right subtree
            root.right = delete_Recursive(root.right, search_key); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.key =  minValue(root.right).key.deepCopy() ; 
   
            // Delete the inorder successor 
            root.right = delete_Recursive(root.right, root.key.getName()); 
        } 
        return root; 
    } 
   
    Node minValue(Node root)  { 
        //initially minval = root
        String minval = root.key.getName(); 
        //find minval
        while (root.left != null)  { 
            minval = root.left.key.getName(); 
            root = root.left; 
        } 
        return root; 
    } 
   
    // insert a node in BST 
    void insert(Student key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, Student key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key.getName().compareTo( root.key.getName()) < 0)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key.getName().compareTo( root.key.getName()) > 0)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    } 
 
//// method for inorder traversal of BST 
//    void inorder() { 
//        inorder_Recursive(root); 
//    } 
//   
//    // recursively traverse the BST  
//    void inorder_Recursive(Node root) { 
//        if (root != null) { 
//            inorder_Recursive(root.left); 
//            System.out.print(root.key + " "); 
//            inorder_Recursive(root.right); 
//        } 
//    } 
//     
    boolean search(String search_key)  { 
        root = search_Recursive(root,  search_key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, String search_key)  { 
        // Base Cases: root is null or key is present at root 
        if (root==null || ( root.key.getName().equals(search_key))) 
            return root; 
        // val is greater than root's key
        if (root.key.getName().compareTo (search_key) > 0) 
            return search_Recursive(root.left, search_key); 
        // val is less than root's key 
        return search_Recursive(root.right, search_key); 
    } 
}
