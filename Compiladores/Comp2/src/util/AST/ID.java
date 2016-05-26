package util.AST;

public class ID extends AST{
	private String spelling;
	
	public ID(String spelling) {
		this.spelling = spelling;
	}

	@Override
	public String toString() {
		return "<ID>" + spelling+ "</ID>"+ "\n";
	}
	

}
