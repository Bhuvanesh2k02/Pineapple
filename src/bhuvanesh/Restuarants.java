package bhuvanesh;

public class Restuarants {
public void restuarant(String hotel,String table ,boolean chennai_Hotel) {
if (hotel.equals("Madurai Hotel")) {
	System.out.println("sorry this is madurai Hotel");
}	
else if (hotel.equals("Chennai Hotel")) {
	if (table.equals("Dinning") && chennai_Hotel==true ) {
		System.out.print("    ");
		System.out.println("Chennai Hotel");
		
	}
	else {
		System.out.println("You are in wrong place");
	}
}
}

public static int item1=60;
public static int item2=10;
public static int item3=25;
public static int item4=10;
public static int item5=35;



public void item1(int dosa) {
	this.item1=dosa;
}
public int item1(){
	System.out.println();
	System.out.println("no. "+"Item"+"       "+"Rate");
	System.out.println();
	System.out.println("1.  "+"Dosa"+"       "+"$"+item1);
	return item1;
}

public void item2(int idle) {
	this.item2=idle;
}
public int item2() {
	System.out.println("2.  "+"Idle"+"       "+"$"+item2);
	return item2;
}
public void item3(int vadai) {
	this.item3=vadai;
}
public int item3() {
	System.out.println("3.  "+"vadai"+"      "+"$"+item3);
	return item3;
}
public void item4(int puri) {
	this.item4=puri;
}
public int item4() {
	System.out.println("4.  "+"puri"+"       "+"$"+item4);
	return item4;
}
public void item5(int pongal) {
	this.item5=pongal;
}
public int item5() {
	System.out.println("5.  "+"pongal"+"     "+"$"+item5);
	return item5;
}

public static int total() {
	int total = item1+item2+item3+item4+item5;
	System.out.println("   "+"-------"+"    "+"------");
	//System.out.println("               "+"$"+total);
	
	return total;
	
}
public static int total1() {
	int total1 = item1+item2+item3+item4+item5;
	
	return total1;
	
}
public double Discount(int amount,double percentage)
{
	double discount= amount*percentage;
	return discount;
}

public void decreaseValue (int amount, double percent)
{
	double DiscountAmount = amount-Discount(amount,percent);
	System.out.print("    Dis15%     $");
	System.out.println(DiscountAmount);
	
}
public double tax(int amount,double percentage)
{
	double tax= amount*percentage;
	return tax;
}

public void increaseValue (int amount, double percent)
{
	double taxAmount = tax(amount,percent);
	System.out.print("    Tax12%     $");
	System.out.println(taxAmount);
}
/*public double total2(int DiscountAmount,int taxAmount) {
	int total2= DiscountAmount+taxAmount;
	System.out.println(total2);
	return total2;
}*/
public static void main(String[] args) {
	Restuarants rt = new Restuarants() ;
		rt.restuarant("Chennai Hotel","Dinning",true);
		rt.item1();
		rt.item2();
		rt.item3();
		rt.item4();
		rt.item5();
		rt.decreaseValue(total(),0.15);
		rt.increaseValue(total1(),0.12);
		//rt.total2(DiscountAmount, taxAmount);
}
}

