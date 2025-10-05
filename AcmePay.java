/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class AcmePay
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double noHoursWorked = 0.0;
		double OTPay = 0.0;
		double hourlyRate = 0.0;
		double regularPay = 0.0;
		double grossPay = 0.0;
		double retirementPlanDeduction = 0.0;
		double netPay = 0.0;
		double OTRate = 0.0;
		int shift = 0;
		int answer = 0;
		boolean participateInRetirementPlan = false;

		System.out.print("Enter number of hours worked: ");
		noHoursWorked = input.nextDouble();
		
		System.out.println("Enter shift: ");
		System.out.println("Press 1 for first shift.");
		System.out.println("Press 2 for second shift.");
		System.out.println("Press 3 for third shift.");
		shift = input.nextInt();
		
		if (shift == 2 || shift == 3) {
			System.out.println("Do you want to participate in retirement plan?");
			System.out.println("Press [1] for Yes");
			System.out.println("Press [0] for No");
			answer = input.nextInt();

			if (answer == 0) {
				participateInRetirementPlan = false;
			} else {
				participateInRetirementPlan = true;
			}
		}
		
		if (shift == 1) {
			hourlyRate = 17.0;
		} else if (shift == 2) {
			hourlyRate = 18.50;
		} else if (shift == 3) {
			hourlyRate = 22.0;
		}

        if (noHoursWorked > 40) {
            regularPay = 40 * hourlyRate;
            OTRate = hourlyRate * 1.5;
			OTPay =  (noHoursWorked - 40) * OTRate;
        } else {
            regularPay = noHoursWorked * hourlyRate;
        }
        
		grossPay = regularPay + OTPay;
		netPay = grossPay;

		if(participateInRetirementPlan) {
			retirementPlanDeduction = grossPay * 0.03;
			netPay = grossPay - retirementPlanDeduction;
		}
		System.out.println("=============Applicant Information:=============");
		System.out.println("Chosen Shift: " + shift);
		System.out.println("Hours Worked: " +noHoursWorked);
		System.out.println("Shift : " +shift);
		
		System.out.println("==================Pay:==================");
		System.out.println("Hourly Pay Rate: " +hourlyRate);
		System.out.println("Regular Pay: " +regularPay);
		System.out.println("Overtime Pay: " +OTPay);
		System.out.println("Gross Pay: " +grossPay);
		System.out.println("Retirement Plan Deduction: " +retirementPlanDeduction);
		System.out.println("Net Pay: " +netPay);
	}
}
