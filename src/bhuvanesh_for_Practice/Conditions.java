package bhuvanesh_for_Practice;

public class Conditions {

	/*
	 *  if condition /statement
	 *  switch condition
	 *
	 *  if condition:
	 *   if condition
	 *   if-else condition
	 *   if-else if condition(ladder)
	 *   nested if condition
	 */

	public void trafficSignal(String color, String vehicletype, boolean patient)
	{
		/*	syntax
		 * if(condition)
		{

		}*/
		if(color.equals("Green"))
		{
			System.out.println("You are good to go");
		}
		else if(color.equals("Red"))
		{
			if(vehicletype.equals("Ambulance") && patient==true)
			{
				/*if(patient==true)
				{*/
				System.out.println("Please give a way for me !! I am ambulance");
				/*}
				else
				{
					System.out.println("Please stop your vehicle");

				}*/
			}
			else
			{
				System.out.println("Please stop your vehicle");
			}
		}
		else if(color.equals("Orange"))
		{
			System.out.println("You are about to stop / Ready to go");
		}
		else
		{
			System.out.println("You have given incorrect color");
		}
	}

	public void switchConditions(String value)
	{
		/*
		 * switch(expression)
		 * {
		 * 	case:
		 * }
		 */
		switch(value)
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are FeMale");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("its not a valid code");
			break;

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c = new Conditions();
		c.trafficSignal("Red","Ambulance",true);
		c.switchConditions("A");
	}

}

