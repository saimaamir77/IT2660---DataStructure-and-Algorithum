/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

/**
 *
 * @author saafp
 */
public class Student {
    private String Name;
    private int id;
    private double gradeavg;
    //private Node _next;
    
    public Student  (String n,int i, double d){
        Name=n;
        id= i;
        gradeavg=d;
    }    
    
    
    @Override
    public  String toString ( ){
        return ( " Name is " + this.Name +  " and  id is " + this.id +" and gradeavg is "+ this.gradeavg); 
    }
 
    public Student deepCopy () {
        Student clone = new Student ( Name, id, gradeavg);
        return clone;
    }
    
    public  String getName ( ){
        return ( this.Name ); 
    }
    


}
