package practiceFitaProject;
import java.util.*;

public class List_Collection {

	public void arraylist () {
//List<String> array1 = new ArrayList<String>();
//List<String> array2 = new ArrayList<String>();
//List<String> array1 = new LinkedList<String>();
List<String> array2 = new LinkedList<String>();
PriorityQueue<String> array1 = new PriorityQueue<String>();
array1.add("idle");
array1.add("dosa");

array2.add("puri");
array2.add("pongal");
array2.add("vadai");
System.out.println(array1);
System.out.println(array2);

System.out.println();
System.out.println(array1.contains("dosa"));
System.out.println();

for(String eacharray : array2) {
	System.out.println(eacharray);
	if(eacharray.equals("pongal")) {
		
		System.out.println("it's available");
		break;
	}
	else if(eacharray.equals("puri")) {
		System.out.println("puri available");
		break;
	}
}
array1.add("bonda");
System.out.println(array1);
System.out.println(array1.poll());
	}
	public static void main(String[] args) {
		List_Collection a = new List_Collection();
		a.arraylist();
	}
}
