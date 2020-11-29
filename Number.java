public abstract class Number{
	public abstract double getValue();

	public boolean equals(RealNumber other){
		if (getValue() == 0){
			return other.getValue() == 0;
		} else {
			return Math.round(getValue() * 100000) == Math.round(other.getValue() * 100000);
		}
	}

	public int compareTo(Number other){
		return getValue() - other.getValue();	
	}
}
