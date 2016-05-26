package util.AST;

public class GlobalVariableDeclaration extends DeclarationCommand{
	private Type type;
	private ID id;
	
	public GlobalVariableDeclaration(Type type, ID id) {
		this.type = type;
		this.id = id;
	}

	@Override
	public String toString() {
		return "<GlobalVariableDeclaration>" + type.toString() + id.toString() + "</GlobalVariableDeclaration>"+ "\n";
	}

	

}