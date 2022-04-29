package binary.tree;
        
import java.util.Scanner;
        
//package BinaryTreeImplementation;


public class BinaryTreeImplementation {
    
    public static void main(String[] args) {
        int number = -1;
        String name_given = "";
        int Id_given = -1;
        Double averageGrade_given = 0.00;
        Scanner sc = new Scanner(System.in);
        BinaryTreeClass bst = new BinaryTreeClass();
        
        bst.insert(new Student("amir", 34, 34.44));
        bst.insert(new Student("ami", 34, 34.44));
        bst.insert(new Student("am", 34, 34.44));
        bst.insert(new Student("samir", 34, 34.44));
        do {
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
               Student given_values = new Student (name_given, Id_given, averageGrade_given);
               bst.insert(given_values);
               //System.out.println(stList.insert(given_values));   
               sc.nextLine();
            }
            else if (number == 2 ){
               //sc.nextLine();
               sc = new Scanner(System.in);
               System.out.print ("\nEnter student name to fetch:  >> ");
               name_given = sc.nextLine();

               System.out.println(bst.search(name_given));

            }
            else if( number ==  3){
                sc = new Scanner(System.in);
                 System.out.print ("\nEnter student name to delete:  >> ");
               name_given = sc.nextLine();
               bst.deleteKey(name_given);
            }
            else if( number == 4){
                sc.nextLine();
               System.out.print ("Enter student name to update:  >> ");
               name_given = sc.nextLine();
               System.out.print ("Enter student Id:  >> ");
               Id_given = sc.nextInt();
               sc.nextLine();
               System.out.print ("Enter student average grade: >> ");
               averageGrade_given = sc.nextDouble();
               sc.nextLine();
               Student given_values = new Student (name_given, Id_given, averageGrade_given);
               
               if (bst.search(name_given)) 
               {
                   bst.deleteKey(name_given);
                   bst.insert(given_values);
                   System.out.println("Given Student detail updated successfully");
               }
               else 
                   System.out.println("Given Student does not exist ");
              // Node given_values = new Node (name_given, Id_given, averageGrade_given);
            } //System.out.println(stList.update( name_given,given_values  )); 
            
            else if (number==5) {
                //stList.sortStudents();
                //stList.showAll();

            }
            else if( number==6){
            System.out.println("exit the programm");


            }
        }while ( number != 6 );
    }
    
}