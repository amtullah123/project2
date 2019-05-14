import java.util.*;
class Fifth
{


    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
}
public class Class5
{
    public static void main(String[] args)
    {
        Fifth f=new Fifth();
        Boolean b=f.isEven(77);
        if(b==true)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
