package util.AST;

import java.util.ArrayList;

public class FunctionDeclaration extends DeclarationCommand{
	private ID id;
	private ParameterList pl;
	private Type type;
	private ArrayList<DeclarationCommand> declarations;
	private BeginCommand commands;
	
	public FunctionDeclaration(ID id, ParameterList pl, Type type,
			ArrayList<DeclarationCommand> declarations, BeginCommand commands) {
		this.commands = commands;
		this.declarations = declarations;
		this.id = id;
		this.pl = pl;
		this.type = type;
	}

	@Override
	public String toString() {
		String str = "<FunctioDeclaration>";
		

		str += id.toString();
		
		if (pl!=null){
			str +=  pl.toString() + type.toString();
		}
		
		if(commands!= null){
			str += commands.toString();
		}
		
		
		for(int i = 0; i<declarations.size(); i++){
			if(declarations.get(i).toString() != null){
				str +=  " " + declarations.get(i).toString();
			}
		}
		
		
		str+= "</FunctioDeclaration>"+ "\n";
		return str;
	}

}

