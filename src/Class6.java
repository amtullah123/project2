
import java.util.*;
class Sixth
{

    public void avgdisplay( int a[])
    {
        int sum=0;
        double avg;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.println("The average is:"+avg);
    }
    public void maxdisplay(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("The maximum is:"+max);
    }
    public void mindisplay(int a[])
    {
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("The manimum is:"+min);
    }
}
public class Class6
{
    public static void main(String[] args)
    {
        int n,g;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of student:");
        n=sc.nextInt();
        int gd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter grade of student "+(i+1)+":");
            g=sc.nextInt();
            if(g>100 || g<0) //checking for valid input   
            {
                System.out.println("Please Enter valid input");
                i--;
            }
            else
                gd[i]=g;
        }
        Sixth s=new Sixth();  //object creation
        s.avgdisplay(gd); //method calling
        s.maxdisplay(gd); //method calling
        s.mindisplay(gd);//mathod calling
    }
}
