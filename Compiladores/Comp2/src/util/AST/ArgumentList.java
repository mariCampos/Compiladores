package util.AST;

import java.util.ArrayList;


public class ArgumentList extends AST{
	ArrayList<Expression> exps;

	@Override
	public String toString() {
		
		return "<Argument List>" + exps.toString() + "</Argument List>" + "\n";
	}
	public ArgumentList(ArrayList<Expression> expressions){
		this.exps = expressions;
	}
	
	
	
	
	
}