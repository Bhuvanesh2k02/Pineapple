package bhuvanesh_for_Practice;

public class If_Else_Condition {
	int a=6;
	int b=5;
	int c=8;
public void ifcondition1() {
	if(a>b && a>c) {
		System.out.println("'A' is the greatest num :"+a);
	}
	else if (a<b && a>c) {
		System.out.println("'A' is the second greatest num :"+a);
		}
	else if (a>b && a<c) {
	System.out.println("'A' is the second greatest num :"+a);
	}
	else if (a==b && b==c && a==c) {
	    System.out.println("All the number's are equal");
	}
	else if (a<b && a<c) {
		System.out.println("'A' is the lowest num :"+a);
	}
	else {
		System.out.println("gjhv");
	}
}

public void ifcondition2() {
	if (b>a && b>c) {
		System.out.println("'B' is the greatest num :"+b);
	}
	else if(b<a && b>a) {
	System.out.println("'B' is the greatest num :"+b);
	}
	else if (b<a && b>c) {
	    System.out.println("'B' is the second greatest num 1:"+b);
	    }
    else if(b>a && b<c) {
	    System.out.println("'B' is the second greatest num :"+b);
		}
	
	else if (b<c && b<a) {
		System.out.println("'B' is the lowest num :"+b);
	}
	else {
		System.out.println("ghgfkyug");
	}
}
	
public void ifcondition3() {
	if(c>a && c>b) {
		System.out.println("'C' is the greatest num :"+c);
	}
	else if (c<a && c>b) {
		System.out.println("'C' is the second greatest num :"+c);
		}
	else if (c<b && c>b) {
	System.out.println("'C' is the second greatest num :"+c);
	}
	else if(c>a && c<b) {
	    System.out.println("'B' is the second greatest num :"+c);
		}
	else if (c<a && c<b) {
		System.out.println("'C' is the lowest num :"+c);
	}
	
	else {
		System.out.println("hggff");
	}
}	
	
	public static void main(String[] args) {
		If_Else_Condition ic = new If_Else_Condition();
		ic.ifcondition1();
		ic.ifcondition2();
		ic.ifcondition3();
	}

}
