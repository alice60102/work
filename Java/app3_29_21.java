import java.util.Scanner;

public class app3_29_21
{
  public static void main(String[] args) 
  {
    double A = 0.0f;
    double B = 0.0f;
    Scanner scan_input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        A = scan_input.nextDouble();
        System.out.print("Pleae enter the sencond number: ");
        B = scan_input.nextDouble();

    double plus = A+B;
    System.out.println(A+"+"+B+"="+ plus);
  }
}