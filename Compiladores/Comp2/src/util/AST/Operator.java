package util.AST;

public class Operator {
	private String spelling;
	
	public Operator(String spelling) {
		this.spelling = spelling;
	}
	
	public String toString() {
		return "<OP>" + spelling + "<OP>"+ "\n";
	}
}
