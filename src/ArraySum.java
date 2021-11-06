//Sum of array elements
import java.util.Scanner;

public class ArraySum
{

    public static void main(String [] args)
    {

        Scanner obj=new Scanner(System.in);
        float a[]=new float[10];
        float sum=0;
        int n=0,i=0;

        System.out.println("enter the  size of array   ");
        n=obj.nextInt();
        System.out.println("enter  " + n +"  elements   ");

        for(i=0;i<n;i++)
        {
            a[i]=obj.nextFloat();
            sum=sum+a[i];
        }

        System.out.println("The  " +n + " elements are as ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Sum of " + n + "  elements are : " + sum);
    }
}




