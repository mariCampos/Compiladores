package util.AST;

import java.util.ArrayList;

public class Termo extends AST{
	private ArrayList<Fator> fatList;
	private Operator op;
	
	public Termo(ArrayList<Fator> fatList, Operator op) {
		this.fatList = fatList;
		this.op = op;
	}

	@Override
	public String toString() {
		String str = "<Termo>" ;
		if(op != null) {
			str+= op.toString() ;
		}

		if(fatList.size() > 0){
			for(int i=0;i<fatList.size(); i++){
				if(fatList.get(i) != null){
					str +=  " " + fatList.get(i).toString();
				}
			}
		}
		str+= "<Termo>"+ "\n";
		return str;
	}

	

}