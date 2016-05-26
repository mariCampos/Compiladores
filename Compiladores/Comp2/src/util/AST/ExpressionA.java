package util.AST;

import java.util.ArrayList;


public class ExpressionA extends AST{
	private ArrayList<Termo> arrayTermo;
	private Operator op;
	
	public ExpressionA(ArrayList<Termo> arrayTermo, Operator op) {
		this.arrayTermo = arrayTermo;
		this.op = op;
	}

	@Override
	public String toString() {
		String str = "<ExpressionA>";
		
		if(arrayTermo.size() > 0){
			for(int i=0; i<arrayTermo.size(); i++){
				if(arrayTermo.get(i) != null){
					str = " " + arrayTermo.get(i).toString();
				}
			}
		}
		
		if(op != null) {
			str+=  "<Operador>" +  op.toString() + "</Operador>";
		}
		
		str += "</ExpressionA>"+ "\n";
		return str;
	}

}