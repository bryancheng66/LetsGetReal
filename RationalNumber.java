public class RationalNumber extends Number{
	private int numerator, denominator;
	
	public RationalNumber(int nume, int deno){
		if (deno == 0) {
			numerator = 0;
			denominator = 1;
		} else if (deno < 0) {
			numerator = -1 * nume;
			denominator = -1 * deno;
		} else if (nume == 0) {
			numerator = 0;
			denominator = 1;			
		} else {
			numerator = nume;
			denominator = deno;
		}
		reduce();
	}

	public double getValue(){
		return (double)numerator / denominator;
	}

	public double equals(RationalNumber other){
		return getNumerator == other.getNumerator() && getDenominator == other.getDenominator() 
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

	public String toString(){
		if (getNumerator() == 0){
			return "0";
		} else if (getDenominator() == 1){
			return getNumerator();
		} else {
			return getNumerator() + "/" + getDenominator();
		}
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
		int gcdivisor = gcd(Math.abs(numerator), Math.abs(denominator));
		int newNum = numerator / (gcdivisor == 0 ? 1 : gcdivisor);
		int newDen = denominator / (gcdivisor == 0 ? 1 : gcdivisor); 
		numerator = newNum;
		denominator = newDen;
	}

	public RationalNumber multiply(RationalNumber other){
		return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());		
	}

	public RationalNumber divide(RationalNumber other){
		return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());		
	}
	
	public RationalNumber add(RationalNumber other){
		return new RationalNumber(
				numerator * other.getDenominator() + other.getNumerator() * denominator,
				denominator * other.getDenominator()
		);
	}
	
	public RationalNumber subtract(RationalNumber other){
		return new RationalNumber(
				numerator * other.getDenominator() - other.getNumerator() * denominator,
				denominator * other.getDenominator()
		);
	}
}
