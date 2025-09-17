package com.app;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			for(int j=2;j<i;j++)
			{
				int count=0;
				if(i%j==0)
				{
					count++;
				}
				if(count==2)
				{
					System.out.println(i);
				}
				j++;
			}
			i++;
			System.out.println(i);
		}
	}
}
