package util.AST;

public class FactorExpression extends Fator {
	private Expression exp;
	
	public FactorExpression(Expression exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		String str = "<FactorExpression>";
		
		str += exp.toString() + "</FactorExpression>"+ "\n";
		
		return str;
	}
	
	
}
