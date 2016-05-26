package util.AST;

public class WhileCommand extends Command {
	private Expression exp;
	private BeginCommand bc;
	public WhileCommand(Expression exp, BeginCommand bc) {
		this.exp = exp;
		this.bc = bc;
	}
	
	public String toString() {
		String str = "<WHILE>" + exp.toString()  + bc.toString() + "</WHILE>"+ "\n";
		return str;
	}

}
