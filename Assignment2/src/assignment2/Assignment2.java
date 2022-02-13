


package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

    private static int[] StudentListing;
    
    public static void main(String[] args) {
        StudentListing stList = new StudentListing();
         // StudentLising [] StudentLising= new StudentLising [2];
      /*   StudentListing stList = new StudentListing(5);
         Node first =  new Node("saima",0,75.5);
         Node second = new Node ("amir", 4, 89.9);
         Node third = new Node ("afnan", 1, 99.8);
         Node fourth = new Node ("fasi", 7, 88.6);
         Node fifth = new Node ("jugno", 2, 77.5);
         
         Node replace = new Node ("babla", 9, 98.0);
         
         
         
         stList.insert(first);
         stList.insert(second);
         stList.insert(third);
         stList.insert(fourth);
         stList.insert(fifth);
        
         stList.showAll();
         System.out.println("Fetched values as follows:-------");
         System.out.println(stList.fetch("lookit"));
         System.out.println(stList.fetch("amir"));
         
         
         
         System.out.println(stList.delete("lookit"));
         System.out.println(stList.delete("amir"));
         System.out.println("After deleting amir node  as follows:-------");
        stList.showAll();
        
        System.out.println(stList.insert( second));
        System.out.println("After inserting amir:-------");
         stList.showAll();
        
        
         System.out.println(stList.update("lookit", first));
         System.out.println(stList.update("amir", replace));
         System.out.println("After updating amir to babla node:-------");
        stList.showAll();
        
        
        
         stList.sortStudents();
       //System.out.println("After sorting by name :-------");
        
    stList.showAll();
         
    */
    int number = -1;
    String name_given = "";
    int Id_given = -1;
    Double averageGrade_given = 0.00;
    Scanner sc = new Scanner(System.in);
    do 
    {
        System.out.println("enter 1 to insert a new student information\n"+
        "enter 2 to output student information\n" + "enter 3 to delete student information\n" + 
        "enter 4 to update student information\n"   + "enter 5 to output all students information in sorted order\n" + "1enter 6 to exit the programm\n");


        number = sc.nextInt();
        if ( number ==1 ){
           sc.nextLine();
           System.out.print ("Enter student name:  >> ");
           name_given = sc.nextLine();
           System.out.print ("Enter student Id:  >> ");
           Id_given = sc.nextInt();
           sc.nextLine();
           System.out.print ("Enter student average grade: >> ");
           averageGrade_given = sc.nextDouble();
           sc.nextLine();
           Node given_values = new Node (name_given, Id_given, averageGrade_given);
           System.out.println(stList.insert(given_values));   
           //sc.nextLine();
        }
        else if (number == 2 ){
           //sc.nextLine();
           sc = new Scanner(System.in);
           System.out.print ("\nEnter student name to fetch:  >> ");
           name_given = sc.nextLine();
           System.out.println(stList.fetch(name_given));
           
        }
        else if( number==3){
            sc = new Scanner(System.in);
             System.out.print ("\nEnter student name to delete:  >> ");
           name_given = sc.nextLine();
           System.out.println(stList.delete(name_given));
        }
        else if( number==4){
            sc.nextLine();
           System.out.print ("Enter student name:  >> ");
           name_given = sc.nextLine();
           System.out.print ("Enter student Id:  >> ");
           Id_given = sc.nextInt();
           sc.nextLine();
           System.out.print ("Enter student average grade: >> ");
           averageGrade_given = sc.nextDouble();
           sc.nextLine();
           Node given_values = new Node (name_given, Id_given, averageGrade_given);
           System.out.println(stList.update( name_given,given_values  )); 
        }
        else if (number==5) {
            stList.sortStudents();
            stList.showAll();
            
            
            
        }
        else if( number==6){
        System.out.println("exit the programm");
            
       
        }
    
    
    
    
    
    }while ( number != 6 );
            
    
    
    
    
    }
    
}
