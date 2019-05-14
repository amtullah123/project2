

class Fact
{
    void longfactorial()
    {

        for(int i=1;i<=60;i++)
        {
            long fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            if(fact<0)
            {
                System.out.println("Factorial of "+i+" is out of range");
                break;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }
}

public class Class7
{
    public static void main(String args[])
    {
        Fact f=new Fact();
        f.longfactorial();
    }
}
