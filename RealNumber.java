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
		if (this.value == 0){
			return other.value == 0;
		} else {
			return Math.round(this.value * 100000) == Math.round(other.value * 100000);
		}	
	}

}
