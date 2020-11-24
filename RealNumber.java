public class RealNumber {
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
		if (this.getValue() == 0){
			return other.getValue() == 0;
		} else {
			return Math.round(this.getValue() * 100000) == Math.round(other.getValue() * 100000);
		}	
	}

	public RealNumber add(RealNumber other){
		return new RealNumber(this.value + other.getValue());
	}

}
