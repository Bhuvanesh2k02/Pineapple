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

	
	//String[] item = new String[6];
	String[] Food = {"idle","dosa","pongal","puri","vadai","chapathi"};
	public static String item = "item";
	
	public void Fooditem() {
		/*item[0]=itme1;
		item[1]=item2;
		item[2]=item3;
		item[3]=item4;
		item[4]=item5;
		item[5]=item6;*/
		
		if (item.equals(item))
		for(String item : Food ) {
			System.out.println(item);
			
		}
			System.out.println();
			
		/*for(String FoodItem : item  ) {
			
		
				System.out.println(FoodItem );
		}*/
			
			
		}
	
	public void FoodOrdered () {
		item1(10);
		System.out.println("Dosa : " + Dosa1());
		item2(20);
		System.out.println("Idle : "+Idle1());
		item3(30);
		System.out.println("ButterNaan : "+ButterNaan1());
		item4(40);
		System.out.println("PaneerbutterMasala : "+PaneerbutterMasala());
		item5(50);
		System.out.println("Rasamalai : "+Rasamalai1());
		item6(60);
		System.out.println("GrilledChicken : "+GrilledChicken1());
		System.out.println(); 
	}
	
			
	
	
	
	
	public static void main(String[] args) {
		Chennai_Hotel ch =new Chennai_Hotel();
		//ch.Array("Food Delivery platform", "Food Available");
		ch.Fooditem();
        ch.FoodOrdered();
		//ch.Total1();
		//ch.decreasevalue();
		//ch.increaseValue();
		
		
		
		
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
 * not use while loop,do while loop
 * not use variables- global(private)
 * not use types of values- boolean,long,float,shot
 * not use switch condition
 * not use keyword- try, catch, finally, throw, throws
 * not use exception handling- 3 types=> checked, unchecked, error
 * not use arrays- two dimension
 * not use inheritance- single, hierarchical, multiple,hybrid
 * not use oops concepts-> Polymorphism, abstraction, encapsulation
 */
