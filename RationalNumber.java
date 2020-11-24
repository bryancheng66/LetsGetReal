public class RationalNumber extends RealNumber {
	private int numerator, denominator;
	
	public RationalNumber(int nume, int deno){
		super(0.0);
		if (deno == 0) {
			this.numerator = 0;
			this.denominator = 1;
		} else if (deno < 0) {
			this.numerator = -nume;
			this.denominator = -deno;
		} else {
			this.numerator = nume;
			this.denominator = deno;
		}
	}

	public double getValue(){
		return (double)this.numerator / this.denominator;
	}

	public int getNumerator(){
		return this.numerator;
	}

	public int getDenominator(){
		return this.denominator;
	}

	public RationalNumber reciprocal(){
		return new RationalNumber(this.denominator, this.numerator);
	}
}
