package util.AST;

import java.util.ArrayList;

public class Expression extends AST{
	private ArrayList<ExpressionA> expressionA;
	private Operator op;
	
	public Expression(ArrayList<ExpressionA> expressionsA, Operator op) {
		this.expressionA = expressionsA;
		this.op = op;
	}

	@Override
	public String toString() {
		String str = "<Expression>";
		
		if(expressionA.size() > 0){
			for(int i=0; i<expressionA.size(); i++){
				if(expressionA.get(i).toString() != null){
					str += " " + expressionA.get(i).toString();
				}
			}
		}
		
		if(op != null){ 
			str+=  "<Operador>" + this.op.toString() + "</Operador>";
		}
		
		str += "</Expression>"+ "\n";
		return str;
	}

}