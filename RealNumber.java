public class RealNumber extends Number {
	private double value;

	public RealNumber(double v){
		value = v;
	}

	public double getValue(){
		return value;
	}

	public String toString(){
		return ""+getValue();
	}

	public boolean equals(RealNumber other){
		if (getValue() == 0){
			return other.getValue() == 0;
		} else {
			return Math.round(getValue() * 100000) == Math.round(other.getValue() * 100000);
		}
	}

	public RealNumber add(RealNumber other){
		return new RealNumber(getValue() + other.getValue());
	}

	public RealNumber multiply(RealNumber other){
		return new RealNumber(getValue() * other.getValue());
	}

	public RealNumber divide(RealNumber other){
		return new RealNumber(getValue() / other.getValue());
	}

	public RealNumber subtract(RealNumber other){
		return new RealNumber(getValue() - other.getValue());
	}
}
