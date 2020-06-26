import java.util.ArrayList;

public abstract class Cake {
	protected String name;
	protected double rate;
	protected ArrayList<Cake> cakes = new ArrayList<Cake>();

	public Cake(String n, double r) {
		name = n;
		rate = r;
	}

	public abstract double calcPrice();

	public String toString() {
            return name + "\t" + rate;
        }
	
}
