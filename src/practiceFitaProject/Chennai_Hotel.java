package practiceFitaProject;

public class Chennai_Hotel extends TaxAmount{
	
	String hotel = "Smoke Hub Barbique" ;
	
	public void Array(String Zomato, String Restuarant ) {
	if (Zomato.equals("Product Delivery Platform")) {
		if (Restuarant.equals("Chennai Hotel"))
		System.out.println("Chennai Hotel is fake Hotel");
	}
	else if (Zomato.equals("Food Delivery platform")) {
		if (Restuarant.equals("Food Available"))
		System.out.println(hotel);
		System.out.println();
	}
	else {
		System.out.println("Smoke Hub Barbique is not Available");
	}
	}

	
	String[] item = new String[6];
	String[] Food = {"idle","dosa","pongal","puri","vadai","chapathi"};
	//public static String item = "item";
	public void Fooditem1() {
		System.out.println("fooditem1 :");
		if (item.equals(item))
			for(String item : Food ) {
				System.out.println(item);
				
			}
				System.out.println();
	}
	public void Fooditem(String item1, String item2,String item3,String item4,String item5,String item6) {
		item[0]=item1;
		item[1]=item2;
		item[2]=item3;
		item[3]=item4;
		item[4]=item5;
		item[5]=item6;
		
		
		System.out.println("fooditem :");
		for(String FoodItem : item  ) {
			
		
				System.out.println(FoodItem );
		}
			
			System.out.println();
		}

	public void FoodOrdered () {
		System.out.println("FoodOrdered :");
		item1(50);
		System.out.println("Dosa : ₹" + dosa);
		item2(35);
		System.out.println("Idle : ₹"+idle);
		item3(30);
		System.out.println("ButterNaan : ₹"+butternaan);
		item4(40);
		System.out.println("PaneerbutterMasala : ₹"+PaneerbutterMasala);
		item5(50);
		System.out.println("Rasamalai : ₹"+rasamalai);
		item6(60);
		System.out.println("GrilledChicken : ₹"+grilledchicken);
		System.out.println(); 
	}

			public void BillAmount() {
				System.out.println("BillAmount :");
				Total2();
				Discountamount();
				tax();
				Totalamount ();
			}

	public static void main(String[] args) {
		Chennai_Hotel ch =new Chennai_Hotel();
		ch.Array("Food Delivery platform", "Food Available");
		ch.Fooditem1();
		ch.Fooditem("idle","dosa","pongal","puri","vadai","chapathi");
        ch.FoodOrdered();
		ch.BillAmount();
		}

}
/*used for loop but not use "break condition"
 * used arrays- single dimension
 * used oops concepts-> inheritance=> multilevel
 * used if,nested if,if else if,else
 * used variables- static, local
 * used types of values- integer, string
 * used access modifier from child classes
 * used return type, this/super, called one method to another method
 * used override method
 * used Abstraction concepts
 * used interface concepts
 * not use while loop,do while loop
 * not use variables- global(private)
 * not use types of values- boolean,long,float,shot
 * not use switch condition
 * not use keyword- try, catch, finally, throw, throws
 * not use exception handling- 3 types=> checked, unchecked, error
 * """"""not use arrays- two dimension""""""
 * not use inheritance- hierarchical, multiple,hybrid
 * not use oops concepts-> Polymorphism, encapsulation
 */
