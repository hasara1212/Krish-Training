
import java.util.Scanner;

class EllectricBillCalculation{
    public static void main(String args[]){
    double amount = 0;   
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter UserType and User Type");
    
    System.out.println("User Type(Domestic/Commercial)");
    String usertype = sc.nextLine();
    
    System.out.println("No of Units");
    int units = sc.nextInt();
    
    if(usertype == "Domestic")
    {
      if(units<=10)
          amount = units*10.50;
      else if( units>=11 && units<=20)
          amount = 10*10.50 + (units-10)*15.50;
      else if( units>=21 && units<=50)
          amount = 10*10.50 + 10*15.50 +(units-20)*50.00;
      else if(units>=50) 
          amount = 10*10.50 + 10*15.50 + 30*50.00 + (units-50)* 75.00;
      else 
          System.out.println("Yout Input for the units may be wrong. Please check Again.");
      
    }
    
    else if(usertype == "Commercial")
    {
      if(units<=10)
          amount = units*15.50;
      else if( units>=11 && units<=20)
          amount = 10*15.50 + (units-10)*12.50;
      else if( units>=21 && units<=50)
          amount = 10*15.50 + 10*12.50 +(units-20)*25.00;
      else if(units>=50) 
          amount = 10*15.50 + 10*12.50 + 30*25.00 + (units-50)* 60.00;
      else 
          System.out.println("Yout Input for the units may be wrong. Please check Again.");
      
    }
    
   /*
     else
    {System.out.println("Yout Input for the User Type may be wrong. Please check Again.");}
    */
    
    
    System.out.println("Your Electric Bill for the Month  Rs: " + amount);
    
    }
    
    
}