//Aim: Write a Program to demonstrate the use of getter and setter method of Java Beans.

public class pra10
{
public static void main(String[] args)
{
    P10 p = new P10();
    p = new P10();
    p.setTier("Lkhan");
    p.setName("john"); 
    String a=p.getName(); 
    String b=p.getTier();
    
    System.out.println("Tier = "+b); 
    System.out.println("UserName = "+a);

}
}

