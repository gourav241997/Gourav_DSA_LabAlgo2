package com.greatlearningpaymoney;

import java.util.Scanner;

public class TransactionCheck {
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int tranSize =sc.nextInt();
		
		System.out.println("Enter the value of array");
		int[] transactions =new int[tranSize];
		for (int i=0;i<tranSize;i++)
		{
			transactions[i] =sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetSize =sc.nextInt();
		for(int i=0;i<targetSize;i++)
		{
			int target =sc.nextInt();
			int result =getNoOfTransactionsForTarget(transactions,target);
			if(result >0)
			{
				System.out.println("Target achieved after"+result+"transactions");
			}
			else {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}
   private static int getNoOfTransactionsForTarget(int [] transactions , int target)
   {
	   int sum=0;
	   for (int i=0;i<transactions.length;i++)
	   {
		   sum =sum +transactions[i];
		   if(sum>=target)
		   {
			   return i+1;
		   }
	   }
	   return -1;
   }
}
