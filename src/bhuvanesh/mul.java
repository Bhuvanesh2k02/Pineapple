package bhuvanesh;

public class mul extends sub{
public void multiple (int a ,int b,int c, int d) {
	int e= a*b*c*d;
	System.out.println(e);
}
	public static void main(String[] args) {
		mul m = new mul();
		m.multiple(2,4,5,6);
		m.addition(20, 30);
		m.subraction(10, 20, 30);
	

	}

}
