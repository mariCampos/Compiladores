package util.AST;

public class PrintCommand extends Command {
	private Expression exp;
	
	public PrintCommand(Expression exp) {
		this.exp = exp;
	}

	public String toString() {
		String str = "<PRINT>" + exp.toString() + "</PRINT>"+ "\n";
		return str;
	}

}
