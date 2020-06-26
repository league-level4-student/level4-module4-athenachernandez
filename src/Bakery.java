import java.util.ArrayList;

public class Bakery {
	static double total = 0.0;
	static ArrayList<Cake> cakes = new ArrayList<Cake>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			cakes.add(new orderCake("cake", 1.0, 5.5));
			cakes.add(new readymadeCake("cake", 1.0, 9));
		}
		for (int i = 0; i < cakes.size(); i++) {
			total += cakes.get(i).calcPrice();
		}
		System.out.println("The total is $" + total);
	}
}
