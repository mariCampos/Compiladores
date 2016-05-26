package util.AST;


public class TypeBool extends Type {
	private String s;
	
	public TypeBool(String spelling) {
		this.s = spelling;
	}

	public String toString() {
		return "<TypeBool>" +s + "</TypeBool>"+ "\n";
	}

}
