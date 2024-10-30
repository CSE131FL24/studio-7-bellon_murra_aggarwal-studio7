package studio7;

public class Die {
	private int side;
	public Die(int n) {
		side = n;
		this.side = n;
	}
	
	public int random () {
		return ((int)(Math.random()* this.side)) +1;
	}
	public String toString() {
		String result = "Sides: "+ this.side;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die num1 = new Die(6);
		System.out.println(num1);
		System.out.print(num1.random());

	}

}
