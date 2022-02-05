


package assignment1;
import java.util.Scanner;

public class Person {
    private String perFirstname;
    private String perLastname;
    private String perPhone;
    private String perEmail;
    private int perSSN;
    
    public Person ()
    {
    
    }
    
    public Person (String fname){
        this.perFirstname = fname;
    }
    
    public Person (String fname, int snumber){
        this.perFirstname = fname;
        this.perSSN = snumber;
    }
    
    public int getperSSN()
    {
        return perSSN;
    
    }
    public void setperSSN(int pSSN)
    {    perSSN = pSSN;
            
    } 
    
    
    public String getperFirstname()
    { 
        return perFirstname;
    }
    public void setperFirstname(String pFirstname)
    {    perFirstname= pFirstname;
    
    }
    
    public String getperLastname()
    { 
        return perLastname;
    }
    public void setperLastname(String pLastname)
    {    perLastname = pLastname;
    
    }
    public String getperEmail()
    { 
        return perEmail;
    }
    
    public void setperEmail(String pEmail)
    {    perEmail = pEmail;
    
    }
    public String getperPhone()
    { 
        return perPhone;
    }
    
    public void setperPhone(String pPhone)
    {    this.perPhone = pPhone;
    }
}

    



    

    
