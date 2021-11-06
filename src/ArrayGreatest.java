//Program to find greatest number in array
import java.util.Scanner;

public class ArrayGreatest
{

    public static void main(String [] args)
    {

        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        int n=0,i=0;

        System.out.println("enter the  size of array   ");
        n=obj.nextInt();
        System.out.println("enter  " + n +"  elements   ");


        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int x=a[0];
        for(i=0;i<n;i++)
        {
            if(x<a[i])
            {
                x=a[i];
            }
        }
        System.out.println("the greatest number in array list is  :: "+ x );
    }
}





