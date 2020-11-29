public abstract class Number{
	public abstract double getValue();

	public boolean equals(Number other){
		if (getValue() == 0){
			return other.getValue() == 0;
		} else if (other.getValue() == 0) {
			return getValue() == 0;
		} else {
			return Math.round(getValue() * 100000) == Math.round(other.getValue() * 100000);
		}
	}

	public int compareTo(Number other){
		if (getValue() == other.getValue()){
			return 0;
		} else if (getValue() < other.getValue()){
			return -1;
		} else {
			return 1;
		}
	}
}
