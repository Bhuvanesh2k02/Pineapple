package bhuvanesh_Fita_Project;

import bhuvanesh_for_Practice.divi4;

public class ZomatoForTesting {

	int a = 100;int b=2;
	
public int Divition1 () {
	int c = a+b;
	System.out.println("divi1 "+c);
	return c;
}

	public static void main(String[] args) {
		divi4 d=new divi4();
		d.Addition();
		d.multiple(2,4,5,6);
		d.subraction();
		d.Divition();
		ZomatoForTesting zt = new ZomatoForTesting();
	    zt.Divition1();
}
}