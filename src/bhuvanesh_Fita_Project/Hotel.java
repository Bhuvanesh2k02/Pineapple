package bhuvanesh_Fita_Project;

public class Hotel {

	public void Food_App (String chennai, String zomato, boolean vegAndnonveg ) {
		
		if(chennai.equals("swiggy")) {
		System.out.println("swiggy is not available");
		}
		else if(chennai.equals("zomato")) {
			if(zomato.equals("smokehub_barbique_restuarant") && vegAndnonveg==true) {
				System.out.println("Smokehub Barbique Restuarant");
		}
		}
	}
	public int Item1(String dosa) {
		return Item1;
	}
	public void item(String item1, String butter, boolean dosa) {
		
		if (item1.equals("idle")) {
			
		}
		else if (item1.equals("dosa")) {
			if (butter.equals("Butter dosa") && dosa==true);
			String item1 = Item1 ;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Hotel h= new Hotel();
		h.Food_App("zomato", "smokehub_barbique_restuarant", true);
	}

}
