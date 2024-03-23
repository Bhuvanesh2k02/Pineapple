package bhuvanesh;

public class Basic_Condition {
public static void main(String[] args) {
	int no1 = 50, no2 = 24, no3 = 0, no4 = 100;
	if (no1>no4) {
		System.out.println("Passed");
	}
	else if(no2<no3) {
		System.out.println("Failed");
	}
	else if (no3>no2) {
		System.out.println("Reapear");
	}
	else if (no4>no1) {
		System.out.println("Centum");
	}
	else {
		System.out.println("Try again");
	}
}
}

