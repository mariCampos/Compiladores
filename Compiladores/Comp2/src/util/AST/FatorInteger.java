package util.AST;

public class FatorInteger extends Fator{
	private Numbers n;
	
	public FatorInteger(Numbers n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "<Numbers>" + n.toString() + "</Numbers>"+ "\n";
	}
	
	

}
