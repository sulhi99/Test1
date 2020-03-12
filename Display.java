import java.util.Scanner;
public class Display
{
  public static void main(String [] args)
  {
  Scanner sc = new Scanner(System.in);
  String name;
  int age;
  double height;
  
  System.out.print("Enter name : ");
  name=sc.nextLine();
  System.out.print("My age is ");
  age=sc.nextInt();
  System.out.print("My height ");
  height=sc.nextDouble();
  System.out.println(name);
  System.out.println(age);
  System.out.println(height);
  
  
  }
}
