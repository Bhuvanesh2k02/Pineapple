package bhuvanesh_for_Practice;

public class Hotel {
int a = 50;
int b = 50;
double Dis = 0.10;
double Tax = 0.12;

public int Total()
{
	int e = a+b;
	return e;
}
public double Discount()
{
	double e = Total()*Dis;
	return e;
}
public double tax() {
	double taxamount = Total()*Tax;
	System.out.println("Tax12% : $"+taxamount);
	return taxamount;
}
public double discount()
{
	double discountamount = Total()-Discount();
	System.out.println("Dis10% : $"+discountamount);
	return discountamount;
	
}


public double total() {
	double t = discount()+tax();
	System.out.println("After tax Amount : $"+t);
	return t;
}


	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.tax();
		h.discount();
		//h.total();
}
}
		


	
		
	


	

