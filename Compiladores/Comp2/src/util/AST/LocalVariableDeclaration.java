package util.AST;

public class LocalVariableDeclaration extends Command{
	private VariableDeclaration vd;
	
	public LocalVariableDeclaration(Type type, ID id) {
		vd = new VariableDeclaration(type,id);
	}
	public String toString() {
		String str = "<LocalVariableDeclaration>" + vd.toString()+ "</LocalVariableDeclaration>"+ "\n";
		return str;
	}
}
