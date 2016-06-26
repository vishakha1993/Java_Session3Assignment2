import java.util.Scanner;

public class Prime 
{
	private int number;
	
	boolean check_prime()
	{
		int i;
		for(i=2;i<=number;i++)
		{
			if(number%i==0)
				break;
		}
		
		if(i==number)
			return true;
		else 
			return false;
		
	}
	
	public int getNumber()
	{
		return number;
		
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String arg[])
	{
		Prime p=new Prime();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		p.setNumber(scan.nextInt());
		
		if(p.check_prime())
		{
			System.out.println("Number is prime ");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
	
}

