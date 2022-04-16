
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int price=300;
int discount;
int totalprice;

System.out.println("Welcome to Domino Pizza");
System.out.println("***********************");

System.out.println("The price of Pizza: "+ price);

discount=price/100*20;
System.out.println("20% discount allowed: "+ discount);

totalprice=price-discount;
System.out.println("The total price after 20% discount: "+ totalprice);
	}

}
