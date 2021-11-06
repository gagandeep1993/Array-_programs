//Accessing array with object
import java.util.Scanner;
public class ArrayWithObj {
    public static void main(String [] args)
    {

        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0,n=0,i=0;

        System.out.println("enter the  size of array   ");
        n=obj.nextInt();
        System.out.println("enter  " + n +"  elements   ");

        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("The  " +n + " elements are as ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}


