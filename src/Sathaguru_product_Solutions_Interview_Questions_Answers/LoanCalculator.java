package Sathaguru_product_Solutions_Interview_Questions_Answers;

public class LoanCalculator {
public static double calculateTotalAmount(double saleValue,double adminCharges,double interestRate,int years)
{
	double productAmount=saleValue+(saleValue*adminCharges/100);
	double totalInterest=productAmount*(interestRate/100)*years;
	return productAmount+totalInterest;
}
public static void main(String[] args) {
	double saleValue=10000;
	double adminCharges=3;
	double interestRate=20;
	int years=1;
	double  totalAmount=calculateTotalAmount(saleValue,adminCharges,interestRate,years);
	System.out.println("saleValue will be: Rs."+saleValue);
	System.out.println("adminCharges will be: Rs."+adminCharges);
	System.out.println("interestRate will be: Rs."+interestRate);
	System.out.println("years will be: Rs."+years);
	System.out.println("Total Loan Amount will be: Rs."+totalAmount);
}
}