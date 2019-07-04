package iloveyouboss;

public enum Weight {
	MustMatch(Integer.MAX_VALUE),
	VeryImportant(5000),
	Important(1000),
	wouldPrefer(100),
	DontCare(0);
	
	private int value;
	
	Weight(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
