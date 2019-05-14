import java.util.*;
import java.io.*;
class Member
{
    String name;
    int age;
    double salary;
    Member(String nm, int a, double s)
    {
        name=nm;
        age=a;
        salary=s;
    }
}
public class    Class3
{
    public static void main(String args[])
    {
        Member member=new Member("Harry Potter",30,2500.3);
        System.out.println("Members Name:"+member.name);
        System.out.println("Members Age:"+member.age);
        System.out.println("Members Salary:"+member.salary);
    }
}
