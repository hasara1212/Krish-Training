
package findmissingvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindMissingValue {

    public static void main(String[] args) {
        int temp;
        int missvalue = 0;
        int place;
        int firstvalue = 0;
        int lastvalue = 0;
        
        System.out.println("========== MISSING NUMBER FINDER =========");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Numbers You Should Have On Your Number Set : ");
        int n=sc.nextInt();
        int[] nArray=new int[n];
       
        System.out.println("Enter Your Numbers : ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (sc.hasNextInt())
        {
            int i = sc.nextInt();
            numbers.add(i);
        }
       
        Integer[] numArray = new Integer[numbers.size()];

        for (int i = 0; i < numbers.size(); i++)
            numArray[i] = numbers.get(i);
  
        for(int i=0;i<numArray.length;i++)
        {
            for(int j=i+1;j<numArray.length;j++)
            {
              if(numArray[i]>numArray[j])
              {
                  temp=numArray[i];
                  numArray[i]=numArray[j];
                  numArray[j]=temp;
                  
              }
            }
        }
        
        System.out.println("Sorted Values : ");
        for(int i=0;i<numArray.length;i++)
        System.out.print(numArray[i]+" ");
        System.out.println();
        
        firstvalue=numArray[0]-1;
        lastvalue=numArray[numArray.length-1]-1;
        String sfirstvalue=Integer.toString(firstvalue);
        String slastvalue=Integer.toString(lastvalue);
        
        if(nArray.length-numArray.length !=1)
        {
            System.out.println("Your number set has missed more than one value.");
        }
        
        else
        {
            for(int i=0;i<numArray.length;i++)
            {
               
                if(numArray[i+1]-numArray[i]!=1)
                {
                    missvalue=numArray[i]+1;
                    place=i+2; 
                    System.out.println("Missing value is "+missvalue+" in  place "+place+".");
                    
                    break;
                }  
                
            }
            
              
            /*
            else
            {
                firstvalue=numArray[0]-1;
                lastvalue=numArray[numArray.length]+1;
                //System.out.println("The missing value may be First value "+firstvalue+" or Last value "+lastvalue+".");
            }
                System.out.println("The missing value may be First value "+firstvalue+" or Last value "+lastvalue+".");
            */
            
           
          
            }  
            
            
           
          
        }     
}   
        
    
    

