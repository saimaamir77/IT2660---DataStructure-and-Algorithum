



package array;
import java.util.Scanner;

public class Array 
{

    
    public static void main(String[] args) {
        
       Listing L = new Listing ();
       Listing L1 = new Listing();
       Listing L2 = new Listing();
       Listing L3 = new Listing();
       L.input();
       //System.out.println(  L.toString());
        L1.input();
        //System.out.println(  L1.toString());
        L2.input();
        //System.out.println(  L2.toString());
        L3.input();
        //System.out.println(  L3.toString());
        
        
        Listing [] listArr = new Listing[4];
        listArr[0] = L;
        listArr[1] = L1;
        listArr[2] = L2;
        listArr[3] = L3;
        
        
        
        for(int i = 0; i <= listArr.length-1; i++){
        System.out.println( listArr[i]  );
        }

        for(int i = listArr.length-1 ; i >= 0; i--){
        System.out.println( listArr[i]  );
        }
        
    }
    
}

