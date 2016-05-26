package util.AST;

import java.util.ArrayList;

public class BeginCommand extends Command{
	private ArrayList<Command> commands;
	
	public BeginCommand(ArrayList<Command> commands) {
		this.commands = commands;
	}

	@Override
	public String toString() {
		String str = "<BeginCommand>" ;
		
		if(commands.size() > 0){
			for(int i = 0; i< commands.size(); i++){
				if(commands.get(i) != null)
					str += " " + commands.get(i).toString() ; 
			}
		}
		str += "</BeginCommand>"+ "\n";
		return str;
	}

}
