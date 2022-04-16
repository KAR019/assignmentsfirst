
public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double BasicSalary= 85000;
double ta;
double da;
double hra;
double pf;
double tax;
double GrossAmount;
double NetAmount;

System.out.println("Hima basic salary: $"+ BasicSalary);

ta=BasicSalary/100*15;
da=BasicSalary/100*20;
hra=BasicSalary/100*18;
pf=BasicSalary/100*20;
tax=BasicSalary/100*25;

GrossAmount=BasicSalary+ta+da+hra;
System.out.println("The Gross amount of Hima is: $" + GrossAmount);

NetAmount=GrossAmount-(pf+tax);
System.out.println("NetAmount of Hima is: $"+ NetAmount);

   }

}
