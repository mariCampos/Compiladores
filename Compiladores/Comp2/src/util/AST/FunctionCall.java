package util.AST;

public class FunctionCall extends Command {
	private ID id;
	private ArgumentList al;
	
	public FunctionCall(ID id, ArgumentList al) {
		this.al = al;
		this.id = id;
	}

	@Override
	public String toString() {
		return "<FunctionCall>" +id.toString() + al.toString() + "</FunctionCall>"+ "\n";
	}
	
	
}
