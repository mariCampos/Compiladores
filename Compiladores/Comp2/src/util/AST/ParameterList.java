package util.AST;

import java.util.ArrayList;


public class ParameterList extends AST{
	private ArrayList<VariableDeclaration> varDecList;
	
	public ParameterList(ArrayList<VariableDeclaration> varDeclarations) {
		this.varDecList = varDeclarations;
	}

	@Override
	public String toString() {
		String str = "<ParameterList>";
		
		for(int i=0; i < varDecList.size(); i++) 
			str += " " + varDecList.get(i).toString() + " ";
		
		str += "</ParameterList>"+ "\n";
		return str;
	}

}