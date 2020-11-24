public class RationalNumber extends RealNumber {
	private int numerator, denominator;
	
	public RationalNumber(int nume, int deno){
		super(0.0);
		if (deno == 0) {
			numerator = 0;
			denominator = 1;
		} else if (deno < 0) {
			numerator = -nume;
			denominator = -deno;
		} else {
			numerator = nume;
			denominator = deno;
		}
		reduce();
	}

	public double getValue(){
		return (double)numerator / denominator;
	}

	public int getNumerator(){
		return numerator;
	}

	public int getDenominator(){
		return denominator;
	}

	public RationalNumber reciprocal(){
		return new RationalNumber(denominator, numerator);
	}

	public boolean equals(RationalNumber other){
		return getValue() == other.getValue();
	}

	public String toString(){
		return getNumerator() + "/" + getDenominator();
	}

	private static int gcd(int a, int b){
		int remainder = b < a ? b : a;;
		int dividend = a > b ? a : b;
		int divisor = 0;
		while (remainder != 0){
			divisor = remainder;
			remainder = dividend % divisor;
			dividend = divisor;
		}
		return divisor;
	}

	private void reduce() {
		int newNum = numerator / gcd(numerator, denominator);
		int newDen = denominator / gcd(numerator, denominator);
		numerator = newNum;
		denominator = newDen;
	}
}
