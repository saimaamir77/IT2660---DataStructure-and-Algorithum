/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.*;
import java.util.Scanner;

 public class StudentListing {
    private Node[] data;
    private int next;
    private int size;
    

public void sortStudents(){
    Arrays.sort(data);
}

public StudentListing( )//default constructor
{
    next = 0;
    size = 10;
    data = new Node[ size]; 
    
}   
  public StudentListing (int s)  //constructor with parameter
  {
      next= 0;
      data = new Node [s];
      size= s;
  }
  public boolean insert ( Node newNode)
  {
  if (next>= size)
      return false;
  data[next] = newNode.deepCopy();
  if ( data[next]== null)
      return false;
      next= next +1;
      return true;
  }
  public Node fetch(String targetKey)
  {
      Node node;
      Node temp = null;
      int i=0;
      while(i<next&&!(data[i].compareTo0(targetKey)==0))
      {i++;
      }
  
     if(i==next)
     return null;
     node=data[i].deepCopy();
     if(i !=0) {
         temp = data[i -1];
       data[i - 1]=data [i];
       data[i] = temp; }
       return node;
  }
     public boolean delete(String targetKey)
     {
       int i=0;
       while (i<next&&!(data[i].compareTo0(targetKey)==0))
       { 
            i++;
       }
         if (i == next)
         return false;
         data[i]= data [next - 1];
         data [next -1] = null;
         next = next - 1;
         return true;
        }
     public boolean update (String targetKey, Node newnode)
     {
         if(delete(targetKey)== false)
         return false;
         else if (insert (newnode)==false)
             return false;
         else 
             return true;
     }
     public void showAll()
     { 
         for (int i =0;i<next;i++)
             System.out.println(data[i]. toString());
     }     

    boolean update(String name_given, int Id_given, Double averageGrade_given) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }