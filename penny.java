import java.util.Scanner;

public class penny {

	public static void main(String[] args) {

		Scanner bread = new Scanner (System.in);
		
		/**
		*
		*	@ Sam Bauer 22
		*	
		**/	
		
	
		double income = 0.01;
		double total = 0;
		
		System.out.print("How many days will you be  working");
		int days = bread.nextInt();
		
		for (int i  = 1; i <= days;   i++)
		{
		
			total += income;
			
			System.out.printf("$%11f\t$%11f\n",income,total);
			income *= 2;
			
		}
		
		
		
		
		

	}

}
