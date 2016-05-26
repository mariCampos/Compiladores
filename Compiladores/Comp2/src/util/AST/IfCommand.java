package util.AST;

import java.util.ArrayList;

public class IfCommand extends Command {
	private Expression exp;
	private ArrayList<Command> commands;
	
	
	
	public IfCommand(Expression exp, ArrayList<Command> commands) {
		this.exp = exp;
		this.commands = commands;
		
	}


	@Override
	public String toString() {
		String str = "<IF>" + exp.toString();
		
		if(commands.size() > 0){
			for(int i=0; i<commands.size(); i++)
				str += " " + commands.get(i).toString();
		}
		
		
		str += "</IF>"+ "\n";
		return str;
	}

}
