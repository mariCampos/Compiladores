package util.AST;

public class AssignCommand extends Command {
	private ID id;
	private Expression exp;
	
	public AssignCommand(ID id, Expression exp) {
		this.id = id;
		this.exp = exp;
	}
	
	public String toString(){
		String assign = "<AssignCommand>" + id.toString() +  exp.toString() + "</AssignCommand>"+ "\n";
		return assign;
	}

}
