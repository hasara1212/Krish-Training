public class Test{
public static void main(String args[])
{
int arr[] = new int[]{10,5,3,7,2,9};
int sum = 0;
int avarage;

for(int i=0; i<arr.length; i++)
{
sum = sum + arr[i];
}

avarage = sum/arr.length;
System.out.println(avarage);
}
}
