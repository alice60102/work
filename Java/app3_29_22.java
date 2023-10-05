import java.util.Scanner;

public class app3_29_22
{
  public static void main(String[] args) 
  {
    Scanner scan_input = new Scanner(System.in);
    String str;
    char ch;
    str = scan_input.next();
    ch = str.charAt(0);
    int a = (int)ch-64;
    System.out.println(a);    
  }
}