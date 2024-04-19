package practiceFitaProject;

public class DiscountAmount extends TotalAmount{
	
	double percentage = 0.25;
	public double Discount() {
		double discount =Total() *percentage;
		//System.out.println();
		System.out.println("discount Amt: "+ discount);
		return discount;
	}

	public double Discountamount() {
		double dis = Total()-Discount1();
		//System.out.println();
		System.out.println("Discount Amt : ₹"+dis);
		return dis;
	}
	
	//this method is called in another class
	public double Discount1() {
		double discount =Total() *percentage;
		//System.out.println();
		//System.out.println("discount : "+ discount);
		return discount;
	}
	
	public double Discountamount1() {
		double dis = Total()-Discount1();
		//System.out.println();
		//System.out.println("Discount Amount : "+dis);
		return dis;
	}

	public static void main(String[] args) {
		DiscountAmount da = new DiscountAmount();
		da.Discount();
		da.Discountamount();
		
		}
}
