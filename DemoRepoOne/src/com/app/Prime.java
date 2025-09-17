package com.app;

public class Prime {

	public static void main(String[] args) {
		
		for(int i=2;i<20;i++)
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
