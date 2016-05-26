package util.AST;

public class FatorID extends Fator {
	private ID id;
	
	public FatorID(ID id) {
		this.id  = id;
	}

	@Override
	public String toString() {
		return "<FatorID>" + id.toString() + "</FatorID>"+ "\n";
	}
	
	

}
