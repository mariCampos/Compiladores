package util.AST;

import java.util.ArrayList;

public class Program extends AST{
	private ArrayList<DeclarationCommand> declarations;
	private Command commands;
	private ID id;
	
	public Program(ID id, ArrayList<DeclarationCommand> declarations, Command commands) {
		this.declarations = declarations;
		this.commands = commands;
		this.id = id;
	}
	
	public String toString() {
		String str = "<Program>" + id.toString();
		
		for(int i=0; i<declarations.size(); i++)
			str +=  " " + declarations.get(i).toString();
		
		str += commands.toString();
		
		
		return str += "</Program>"+ "\n";
	}
	
	

}