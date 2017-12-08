public class MenuItem {
	private String name;
	private double price;
	
	public MenuItem(String n, double p) {
		setName(n);
		setPrice(p);
	}
	
	public MenuItem() {
		this(" ", 0.0);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double p){
		price = p;
	}
	
	public String toString() {
		return (getName() + " " + getPrice());
	}
}