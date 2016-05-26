package util.AST;

public class FatorFunctionCall extends Fator{
	private FunctionCall fc;
	
	public FatorFunctionCall(FunctionCall fc) {
		this.fc = fc;
	}

	@Override
	public String toString() {
		return "<FatorFunctionCall>" + fc.toString() + "</FatorFunctionCall>"+ "\n";
	}

	

}
