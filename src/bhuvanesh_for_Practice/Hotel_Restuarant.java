package bhuvanesh_for_Practice;



public class Hotel_Restuarant {
	int amount = 1000;double percent=0.15;
	public Hotel_Restuarant(String name)
	{
		System.out.println("    Item 1 " +name);
		
	}
	public void secondHotel_Restuarant () {
		System.out.println("    Item 2"+ "     $20");
		
	}
	public void thirdHotel_Restuarant () {
		System.out.println("    Item 3"+ "     $70");
		
	}
	public void forthHotel_Restuarant () {
		System.out.println("    Item 4"+ "     $100");
		
	}

	public void fiveHotel_Restuarant () {
		System.out.println("    Item 5"+ "     $150");
		System.out.println("    Item 6"+ "     $300");
		System.out.println("    Item 7"+ "     $350");
		
	}
	int giveBackValue()
	{
		int a=2+3;
		return a;
	}
public void underline() {
	System.out.println("              _______");
	
}

	
	public double giveBackValuewithAmount(int amount,double percentage)
	{
		double discount= amount*percentage;
		return discount;
	}

	public double RedeemedValue (int amount, double percentage)
	{
		double DiscountAmount = amount-    giveBackValuewithAmount(amount,percentage);
		System.out.print("    Dis15%     $");
		System.out.println(DiscountAmount);
		return DiscountAmount;
	}
	public double givenValuewithAmount(int amount,double percentage)
	{
		double tax= amount*percentage;
		return tax;
	}

	public void total (int amount, double percent)
	{
		double Total = RedeemedValue(amount,percent)+givenValuewithAmount(amount,percent);
		
		System.out.println(Total);
		
	}
	public void increaseValue (int amount, double percent)
	{
		double taxAmount = givenValuewithAmount(amount,percent);
		System.out.print("    Tax12%     %");
		System.out.println(taxAmount);
	}
	public void under_line() {
		System.out.println("              _______");
			}
	public void aftertax() {
		System.out.println("    TotalAmt"+"   $970");
		System.out.println("    aftertax"+"  _______");
		System.out.println();
	}
	public void under_line1() {
		
		System.out.println("              _______");
		
	}
	public static void main(String[] args) {
	System.out.println("     Chennai Hotel");
	
	Hotel_Restuarant hr = new Hotel_Restuarant ("    $10");
	hr.secondHotel_Restuarant();
	hr.thirdHotel_Restuarant();
	hr.forthHotel_Restuarant();
	hr.fiveHotel_Restuarant();
	hr.underline();
	
	hr.RedeemedValue(1000,0.15);
	hr.increaseValue(1000,0.12);
	hr.under_line();
	hr.aftertax();
	hr.total(1,1 );
	hr.under_line1();
	
	}
	}
