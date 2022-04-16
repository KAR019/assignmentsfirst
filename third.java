
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=5;
double rate;
double deposit=500000;
double TotalDeposit;
double InterestAmount;
double FinalAmount;

System.out.println("CHASE BANK PVT LTD.");
System.out.println("===================");

TotalDeposit=deposit*year;
System.out.println("Total amount deposited by Mr Sarath in 5 years: $"+ TotalDeposit);

rate=6.8/100;
System.out.println("rate of interest:"+ rate);

InterestAmount=TotalDeposit*year*rate;
System.out.println("Total interest in 5 years:$ "+ InterestAmount);

FinalAmount=TotalDeposit+InterestAmount;
System.out.println("The final amount including rate of interest for Mr.Sharat after 5 years: $"+ FinalAmount);

	}

}
