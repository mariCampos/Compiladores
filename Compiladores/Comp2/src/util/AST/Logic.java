package util.AST;

public class Logic {
	private String spelling;
	
	public Logic(String spelling) {
		this.spelling = spelling;
	}
	
	public String toString() {
		return  "<LOGIC>" + spelling + "</LOGIC>"+ "\n";
	}
}
