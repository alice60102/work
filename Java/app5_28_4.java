import java.util.Scanner;

public class app5_28_4
{
  public static void main(String[] args) 
  {
    Scanner scan_input = new Scanner(System.in);
    String str;
    char ch;
    str = scan_input.next();
    ch = str.charAt(0);
    int a = (int)ch;
    if (a>47 && a<58){
    System.out.println("number");
    }
    else{
        System.out.println("word");
    }   
  }
}