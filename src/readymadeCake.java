
public class readymadeCake extends Cake {
	int quantity;
	double rate;
	double price;
	
	public readymadeCake(String n, double r, int q) {
		super(n, r);
		rate = r;
		quantity = q;
	}

	@Override
	public double calcPrice() {
		price = rate * quantity;
		return price;
	}
	
}
