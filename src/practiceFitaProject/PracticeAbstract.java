package practiceFitaProject;

abstract class Shape{
abstract void Measurement();
	}

class Square extends Shape{
	static int a = 10;
	
	@Override
	void Measurement() {
		int a1=2;
		int a2=2;
		int b=a1+a2;
		//System.out.println(b);
		//System.out.println(a);
		System.out.println("hi");
	}
}

class Triangle extends Shape implements practiceinterface, Practiceinterface3{
	
	@Override
	void Measurement() {
		System.out.println("Measurement");
		}
	@Override
	public void interface1() {
		System.out.println("interface 1");
	}
	@Override
	public void interface2() {
		System.out.println("interface 2");
	}
	@Override
	public void interfaceA() {
		System.out.println("interfaceA");
	}
	@Override
	public void interfaceB() {
		System.out.println("interfaceB");
	}
	@Override
	public void interfaceA1() {
		System.out.println("interfaceA1");
	}
	@Override
	public void interfaceA2() {
		System.out.println("interfaceA2");
	}
}

public class  PracticeAbstract {
	 public static void main(String[] args) {
		 Shape hp=new Square();
		 //hp.Measurement();
		 Shape hp1 =new Triangle();
		 //hp1.Measurement();
		 Shape[] s = new Shape[4];
		 s[0] = new Square();
		 s[1] = new Square();
		 s[2]= new Triangle();
		 s[3]= new Triangle();
		 
		 
		 for(Shape s1 : s) {
			 s1.Measurement();
		 }
		 practiceinterface p1=new Triangle();
		 p1.interface1();
		 p1.interface2();
		 p1.interfaceA();
		 p1.interfaceB();
		 Practiceinterface3 p3=new Triangle();
		 p3.interfaceA1();
		 p3.interfaceA2();
	}
 }