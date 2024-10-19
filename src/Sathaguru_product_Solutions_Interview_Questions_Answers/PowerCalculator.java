package Sathaguru_product_Solutions_Interview_Questions_Answers;

import java.util.Scanner;

public class PowerCalculator {
public static int  power(int base,int exponent)
{
	int result=1;
	for(int i=0;i<exponent;i++)
	{
		result*=base;
	}
	return result;
}
public static void main(String[] args)
{
	int base=5;
	int exponent=3;
//	Scanner sc=new Scanner(System.in);
//	int base=sc.nextInt();
//	System.out.println("Enter the base value: "+base);
//	int exponent=sc.nextInt();
//	System.out.println("Enter the exponent value: "+exponent);
	
	System.out.println("power: "+power(base,exponent));
}
}