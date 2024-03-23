package bhuvanesh;

public class BasicCondition {
public static void main(String[] args) {
	int no1 = 30, no2 = 30, no3 = 30;
	if (no1>no2 && no1>no3) {
		System.out.println(no1);
	}
	else if (no2>no1 && no2>no3) {
		System.out.println(no2);
	}
	else if (no3>no1 && no3>no2) {
		System.out.println(no3);
	}
	else {
		System.out.println("Try again");
	}
	
}
}
