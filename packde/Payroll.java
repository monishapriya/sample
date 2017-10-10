package packde;

import java.util.Scanner;

public class Payroll {
	
public static void main(String args[])
{
	System.out.println("enter basicsalary: ");
	Scanner sc=new Scanner(System.in);
	
	float a=sc.nextFloat();
	float hra=a*50/100;
	float sa=a*75/100;		
	float pf=a*12/100;
	float netsalary=hra+sa+a-pf;
	System.out.println("netsalary is "+netsalary);
	
	}
}
