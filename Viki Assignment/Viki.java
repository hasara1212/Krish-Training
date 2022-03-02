import java.util.Scanner;


public class Viki {

public void vikitimecalc(double d){

double x;           //additional time which wants to complete distance without full iterative time.
double totaltime = 0;

double h=d/9;       //calculate full iterative amount
int j=(int)h;
double a=j;

double b=d%9;       //calculate remaining distance that does not have full iterate.

double y=a*(6);     // Total time for all iterates.

if(d>=9)
{
	if(b==0)
	{ totaltime=a*(3)+(a-1)*3; }       // Total time If distance completes having full iterates only.

        else if(b<=5)
	{ x=0;
	totaltime=y+x; }
	
	else if(b%5<=3)
        { x=1;
          totaltime=y+x; }
		  
        else
        {  x=1+2;
	   totaltime=y+x; }
	


}
                 // if distance has less than one iterate.
else
{ 
    if(d<=5)
        { totaltime=0; }
 
    else if(d>=5 && d<=8)
        { totaltime=1; }
    else
        { totaltime=3; }

}
    System.out.println(" Total Time for the Distance Viki Takes : "+ totaltime +"s");
}

public static void main(String args[]){
	System.out.println("======= VIKI'S TIME CALCULATOR =======");
	
	Scanner sc=new Scanner(System.in);
	System.out.print( "Enter The Distance viki have to complete in Meters(m) : ");
	
	while(!sc.hasNextDouble())
	{ System.out.println("Input is not a valid Number..Please Enter a Valid Number..");
      sc.nextLine();
	}
	
	double k = sc.nextDouble();
	Viki d01=new Viki();
	d01.vikitimecalc(k);
}
}

