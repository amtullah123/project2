import java.util.*;
import java.io.*;
class First1
{
    int num;
    int p=0; //variable to store reverse of a number
    Scanner sc=new Scanner(System.in);
    public void display()
    {
        num=sc.nextInt();
        int n=num;
        int p=0;
        while(n!=0)
        {
            int t=n%10;  //Here t is temporary variable
            p=(p*10)+t;
            n=n/10;
        }
        if(p==num)
            System.out.println(num+" is Palindrome");
        else
            System.out.println(num+" is Not Palindrome");
    }
}
public class Class1
{
    public static void main(String args[])
    {
        First first=new First();
        first.display();
    }
}
