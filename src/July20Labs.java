
public class July20Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Lab: Inheritance
		ActionFigure ironMan = new ActionFigure();
		ironMan.setName("Tony Stark");
		System.out.println(ironMan.getName());
		
		
		
		
		
		
		
	}

}


class Doll{
    
	protected String name;
    
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name; 
	}
}









class ActionFigure extends Doll {

}






