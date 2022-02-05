/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import assignment1.Person;
import java.util.Scanner;


/**
 
 * @author saafp
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person a = new Person();
        Person bb = new Person("mian");
        Person cc = new Person ("mianfmaily", 1001);
         Employee b = new Employee( );
         
         
        
        // set statements
        System.out.println(" what is person first name?");
        Scanner sc = new Scanner(System.in);
        a.setperFirstname(sc.nextLine());
        a.getperFirstname();
        
        
        System.out.println(" what is person last name?");
        a.setperLastname(sc.nextLine());
        a.getperLastname();
        
        System.out.println(" what is person SSN?");
        //int number = Integer.parseInt(" ");
        a.setperSSN(Integer.parseInt(sc.nextLine()));
        a.getperSSN();
        
        
        System.out.println(" what is person email?");
        a.setperEmail(sc.nextLine());
        a.getperEmail();
        
        System.out.println(" what is person phone?");
        //int number = Integer.parseInt(" ");
        a.setperPhone(sc.nextLine());
        a.getperPhone();
        
        
        
        System.out.println(" what is employee number?");
        //int number = Integer.parseInt(" ");
        b.setEmpNum(Integer.parseInt( sc.nextLine()));
        b.getEmpNum();
        
        System.out.println(" what is employee salary?");
        //int number = Integer.parseInt(" ");
        b.setEmpSalary(Integer.parseInt( sc.nextLine()));
        b.getEmpSalary();
        
        
        
        
        System.out.println("mianfamily has 1001");
        //int number = Integer.parseInt(" ");
        //bb.setEmpSalary(Integer.parseInt( sc.nextLine()));
        //bb.getEmpSalary();
        
        
        
        
        
        
                
        
        
    }
    
}
