
public class Car implements Valuable {
	String name;
	double price;
	
	public Car(String n, double p){
		name = n;
		price = p;
	}
	
	public double estimateValue(int month){
		return price*0.8*Math.pow(0.99, month);
	}
	
	public String toString(){
		return String.format("Car name : %s\n", name);
	}
}
