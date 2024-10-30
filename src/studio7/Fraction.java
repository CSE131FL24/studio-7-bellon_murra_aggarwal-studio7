package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int deno) {
		numerator = num;
		this.numerator = num;
		denominator = deno;
		this.denominator = deno;
	}
	
	public Fraction addFraction(Fraction Other) {
		int newNumerator = (this.numerator * Other.denominator)+ (Other.numerator * this.denominator);
		int newDenominator = Other.denominator * this.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
