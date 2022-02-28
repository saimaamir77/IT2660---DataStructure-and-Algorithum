/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;

public class GenericStack<T>   //implements Comparable<GenericNode> 
{
   private T[] data;
   private int top;
   private int size;
   
   public GenericStack(){
       top = -1;
       size = 3;
       data = (T[]) new Object[3];      
   }
   
   public GenericStack(int sizeGiven){
       top = -1;
       size = sizeGiven;
       data = (T[]) new Object[sizeGiven];
   }
   
   public boolean push (Node newNode  ){
       Node node = (Node) newNode; 
       if (top == size -1 ) 
           return false;       
       else 
       {
           top = top + 1 ;
           data[top] = (T) node.deepCopy();
           return true;
       }
   }
   
   public T pop(){
       int topLocation;
       if (top == -1 ){
           return null;
       }
       else {
           topLocation = top ;
           top = top -1;
           return data[topLocation];
       }
   }
   
   public T peek(){
       if (top == -1)
           return null;
        else       return data[top];
   }
   
   public void showAll(){
       for (int i = top; i >= 0; i--){
           System.out.println(data[i].toString());
       }
   }
    
    

    


   
    


       
}
      
        

