package util.AST;

public class FunctionCall2 extends Command {
	private ID id;
	public FunctionCall2(ID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "<FunctionCall>" +id.toString() + "</FunctionCall>"+ "\n";
	}

}
