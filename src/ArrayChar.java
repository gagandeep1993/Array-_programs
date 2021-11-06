//progran to show your name
import java.util.Scanner;

public class ArrayChar
{

    public static void main(String [] args)
    {

        Scanner obj=new Scanner(System.in);

        int i=0;

        System.out.println("enter length of your name  : ");
        int size= obj.nextInt();
        char a[]=new char[size];

        for(i=0;i<size;i++)
        {
            System.out.println("enter "+ (i+1)+ "th character of your name :  ");
            a[i]=obj.next().charAt(0);
        }

        System.out.println("Your name is : ");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]);
        }

    }
}




