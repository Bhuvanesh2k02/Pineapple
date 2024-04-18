package practiceFitaProject;

public class TotalAmount extends Dosa{

	public int Total() {
		int a = idle+dosa+grilledchicken+butternaan+rasamalai+PaneerbutterMasala;
		//System.out.println("Total : "+a);
		return a;
	}
	public int Total2() {
		int a = idle+dosa+grilledchicken+butternaan+rasamalai+PaneerbutterMasala;
		System.out.println("Total : "+a);
		return a;
	}
	public static void main(String[] args) {
		TotalAmount ta = new TotalAmount();
		ta.Total2();
	}
}
