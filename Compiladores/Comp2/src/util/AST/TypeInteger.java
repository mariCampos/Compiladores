package util.AST;

public class TypeInteger extends Type {
	private String s;
	
	public TypeInteger(String spelling) {
		this.s = spelling;
	}

	public String toString() {
		return "<TypeInteger>" +s + "</TypeInteger>"+ "\n";
	}
}
