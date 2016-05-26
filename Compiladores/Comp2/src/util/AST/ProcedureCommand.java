package util.AST;

import java.util.ArrayList;

public class ProcedureCommand extends DeclarationCommand{
	private ID id;
	private ParameterList pl;
	private ArrayList<DeclarationCommand> declarations;
	private BeginCommand commands;
	
	public ProcedureCommand(ID id, ParameterList pl,
			ArrayList<DeclarationCommand> declarations, BeginCommand commands) {
		this.commands = commands;
		this.declarations = declarations;
		this.id = id;
		this.pl = pl;
	}

	@Override
	public String toString() {
		String str = "<ProcedureCmd>";
		
		str += id.toString();
		
		if (pl!=null){
			str = pl.toString();
		}
			
		
		str += commands.toString();
		
		if(declarations.size() < 0){
			for(int i = 0; i<declarations.size(); i++){
				if(declarations.get(i).toString() != null){
					str +=  " " + declarations.get(i).toString();
				}
			}
		}
		
		str+="</ProcedureCmd>"+ "\n";
		return str;
	}


}