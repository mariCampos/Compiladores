package util.AST;

public class ReturnCommand extends Command {
	private Expression exp;
	
	public ReturnCommand(Expression exp) {
		this.exp = exp;
	}

	public String toString() {
		String str = "<RETURN>" + exp.toString() + "</RETURN>"+ "\n";
		return str;
	}

}
