package util.AST;

public class FatorBoolean extends Fator {
	private Logic n;
	
	public FatorBoolean(Logic n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "<Logic>" + n.toString() + "</Logic>"+ "\n";
	}

	
}
