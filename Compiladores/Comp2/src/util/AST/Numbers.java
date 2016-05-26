package util.AST;

public class Numbers {
	private String spelling;
	public Numbers(String spelling) {
		this.spelling = spelling;
	}
	
	public String toString() {
		return "<NUMBERS>" + spelling + "</NUMBERS>"+ "\n";
	}

}
