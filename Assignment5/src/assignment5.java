
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random; 
public class assignment5 {   

   

    public static void main(String[] args) {
        Random random = new Random();
        
        int x;  
       // System.out.println("Randomly Generated Integers Values");  
       // System.out.println(x);   
        
        
        List<Integer> list=new ArrayList<Integer>();  
        
        
        
        for(int i=0;i <= 99;i++){
        x = random.nextInt(100); 
        list.add(x);
        }
        
        // to display 
        System.out.println(list.toString());
        List<Integer> sortedList = mergeSort(list);
        System.out.println(sortedList.toString()) ;
        
    }
    
    public static List mergeSort(List x)
    {
        if (   x.size()   <= 1) 
        {
            return x;
        }
        List<Integer> L = new ArrayList<Integer>();  
        List<Integer> R = new ArrayList<Integer>();  

        for (int i = 0; i < x.size(); i++)
        {
            if ( i <  x.size()/2) 
                L.add(Integer.parseInt(x.get(i).toString()));
            else 
                R.add(Integer.parseInt(x.get(i).toString()));
        }
        L = mergeSort(L);
        R = mergeSort(R);
        return merge(L,R);
    }
    
    public static List merge(List left, List right)
    {
        List<Integer> result = new ArrayList<Integer>();
        
        while  ((left.size() > 0) && (right.size() > 0))
        {
            int left_first = Integer.parseInt(left.get(0).toString());
            int right_first = Integer.parseInt(right.get(0).toString());
            
            if ( left_first <= right_first)
                { 
                    result.addAll(left); 
                    result.addAll(right);
                    left.clear();
                                   
                    
                }
            else
                {
                    result.addAll(right);
                    result.addAll(left);                    
                    right.clear();                   
                    
                }
                
        }
        
        Collections.sort(result);
        return result;
    }
    
}
    