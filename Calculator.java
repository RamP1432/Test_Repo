import java.util.Scanner;
public class Calculator
{
  public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     double num1=sc.nextDouble();
     char ch=sc.next().charAt(0);
     double num2=sc.nextDouble();
     switch(ch)
     {
       case '+':
            System.out.println(num1+num2);
            break;
       case '-':
            System.out.println(num1-num2);
            break;
       case '*':
            System.out.println(num1*num2);
            break;
       case '/':
            System.out.println(num1/num2);
            break;
       default:
            System.out.println("Please Enter valid operator");
     }
   }
}