package bhuvanesh;

public class sub extends add{
	public void subraction(int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		sub s = new sub();
		s.subraction(10, 20, 30);
		s.addition(20, 30);
	}

}
