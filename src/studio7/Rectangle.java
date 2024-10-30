package studio7;

public class Rectangle {
	private int y;
	private int x; 
	private int length;
	private int width;
	
	public Rectangle(int width, int length ) {
		x = length;
		this.length = length;
		y = width;
		this.width = width;
	}
	public int area() {
		return x * y;
	}
	
	public int perimeter() {
		return (2*x) + (2*y);
	}
	public String toString() {
		String result = "Length: " + x + ", ";
		result += "Width: " + y;
		return result;
	}
	public boolean maxArea(Rectangle Other) {
		return this.area()>Other.area();
	}
	public boolean isSquare() {
		return this.length == this.width;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle num1 = new Rectangle(2,3);
		System.out.println(num1);
		System.out.println(num1.area());
		System.out.println(num1.perimeter());
		Rectangle num2 = new Rectangle(5,3);
		System.out.println(num1.maxArea(num2));
		System.out.println(num1.isSquare());
	}

}
