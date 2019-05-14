import java.util.*;
import java.io.*;
class Second1
{
    int num;
    int p=0; //variable to store reverse of a number
    Scanner sc=new Scanner(System.in);
    public void display()
    {
        num=sc.nextInt();
        if(num%4==0)
            System.out.println(num+" is power of 4");
        else
            System.out.println(num+" is Not Power of 4");
    }
}
public class Class2
{
    public static void main(String args[])
    {
        First first=new First();
        first.display();
    }
}
