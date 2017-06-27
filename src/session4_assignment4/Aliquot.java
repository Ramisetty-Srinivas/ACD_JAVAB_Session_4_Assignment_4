package session4_assignment4;

import java.util.Scanner;

public class Aliquot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		sc.nextInt();

		// int n=1;
		int sum=0;
		
		
		
		for(int j=1;j<=100;j++)
			
		{
				
		   for (int i=1;i<=j;i++)	
		   {
			   
			  if (j%i == 0  && j!=i) 
			  {
				  sum=sum+i;
			  }
		   }
		   
		   if( sum == j)
		   {
			   System.out.println(j + " is perfect number");
		   }
		   
		   
	}
		  
		sc.close();
	}

}