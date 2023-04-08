import java.util.Scanner;
public class Bank {
	String name;
	double acc;
	String type;
	int balance_left;
	double depo;
	double withdraw;
	void setdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Account:");
		acc= sc.nextInt();
		System.out.println("Type:");
		type = sc.next();
		System.out.println("Amount:");
		balance_left= sc.nextInt();
	}
	void depositAmount()
	{
		System.out.println("Amount to be deposit:\n");
		Scanner s = new Scanner(System.in);
		depo = s.nextDouble();
		balance_left+=depo;
	}
	void withdraw()
	{
		System.out.println("Withdrawn amount:\n");
		Scanner w = new Scanner(System.in);
		withdraw = w.nextDouble();
		balance_left-=withdraw;
		
	}
	void show()
	{
		System.out.println("Account holders name:\n" +name);
		System.out.println("banalce left:\n" +balance_left);
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setdata();
		b.depositAmount();
		b.withdraw();
		b.show();
		
	}

}
