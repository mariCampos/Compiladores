package util.AST;

import java.util.ArrayList;

public class ElseCommand extends Command {
	private ArrayList<Command> commandselse;
	public ElseCommand(ArrayList<Command> commandselse) {
		this.commandselse = commandselse;
	}

	@Override
	public String toString() {
		String str = "<ELSE>";
		if (commandselse.size() > 0) {		
			for(int i=0; i<commandselse.size(); i++)
				str += " " + commandselse.get(i).toString();		
		}
		str += "</ELSE>"+ "\n";
		return str;
	}

}
