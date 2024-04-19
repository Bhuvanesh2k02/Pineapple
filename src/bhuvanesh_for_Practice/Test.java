package bhuvanesh_for_Practice;

public class Test {
	public void idle(String item, String sambar, boolean Idle ) {
		if (item.equals("puri")) {
			System.out.println("sorry idle gets over");
		}
		else if (item.equals("idle")) {
			if (sambar.equals("sambar")&& Idle==true) {
			System.out.println("Idle is Available");	
			}
			else{
				System.out.println("sorry idle gets over you can choose puri ");
			}
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.idle("idle", "sambar", true);
	}

}
