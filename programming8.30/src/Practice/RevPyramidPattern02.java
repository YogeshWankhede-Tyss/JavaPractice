package Practice;

import java.util.Scanner;

public class RevPyramidPattern02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter value : ");
		int n = sc.nextInt();
		for(int i =n; i>=1;i--) 
		{
			for(int j = n; j>i; j--)
			{
				System.out.print(" ");
					
			}
			for(int k = 1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
