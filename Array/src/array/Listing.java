/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author saafp
 */
public class Listing {
    String name;
    int age;
    
    //default constructor
    public Listing(){
        this.name = " ";
        this.age = 0;
    }      
    //constructor with parameters
    public Listing (String a, int b){
        this.name = a;
        this.age = b;
        
    }
    //method
     public void setName( String a){
      this.name = a;
      
     }
     public void setAge (int b){
         this.age = b;
     }
        
     public String getName(){
         return this.name; 
     }
     public int getAge(){
         return this.age;
     }
    public void input(){
        System.out.println("enter name?");
        Scanner sc = new Scanner(System.in);
        this.setName(sc.nextLine());
        
        System.out.println("enter age?");
        this.setAge(Integer.parseInt(sc.nextLine()));
    } 
        
    public String toString(){
        return this.name + " " +this.age;
       
    
    }
     
}
  