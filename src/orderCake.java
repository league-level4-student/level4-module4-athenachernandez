
public class orderCake extends Cake {
	double weight;
	double rate;
	
	public orderCake(String n, double r, double w) {
		super(n, r);
		weight = w;
		rate = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		double price = rate * weight;
		// TODO Auto-generated method stub
		return price;
	}

}
