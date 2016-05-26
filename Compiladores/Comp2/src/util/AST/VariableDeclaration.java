package util.AST;

public class VariableDeclaration extends AST{
	private Type type;
	private ID id;

	public VariableDeclaration(Type type, ID id) {
		this.type = type;
		this.id = id;
	}

	@Override
	public String toString() {
		String str = "<VariableDeclaration>" + type.toString();
		str += id.toString() + "</VariableDeclaration>"+ "\n";
		return str;
	}

}
