package practiceFitaProject;

public class TaxAmount  extends DiscountAmount{

	double taxpercentage = 0.05;
	public double tax1()
	{
		double tax= Discountamount1()*taxpercentage;
		//System.out.println();
		//System.out.println("Tax Amount : "+tax);
		return tax;
	}
	
	public double tax()
	{
		double tax= Discountamount1()*taxpercentage;
		//System.out.println();
		System.out.println("Tax Amt : ₹"+tax);
		return tax;
	}
	

	
	public void Totalamount ()
	{
		double tax = Discountamount1() + tax1();
		
		//System.out.println();
		System.out.println("Total Amt : ₹"+tax);
	}
	
	public static void main(String[] args) {
		TaxAmount ta = new TaxAmount();
		ta.tax();
		ta.Totalamount();
	}
}
