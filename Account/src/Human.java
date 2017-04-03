
public class Human implements Valuable {
	String name;
	int age;
	
	public Human(String n, int a){
		name = n;
		age = a;
	}
	
	public double estimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	
	public String toString(){
		System.out.printf("Human name: %s\n", name);
		return String.format("registered age: %d\n", age);
	}
}
