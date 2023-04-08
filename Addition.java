import java.util.Scanner;
public class Addition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    char op;
    do{
      System.out.println("Enter two numbers");
      int a= sc.nextInt();
      int b = sc.nextInt();
      sum = sum+a+b;
      System.out.println("Do you wish to perform another operation, Y/N");
      op =sc.next().charAt(0);
    }
    while(op =='Y'||op=='y');
    System.out.println("sum "+sum);
  }
}