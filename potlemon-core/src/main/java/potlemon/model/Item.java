package potlemon.model;

public class Item {

	private String name;
	private String type;
	
	public Item(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName(){
		return this.name;
	}

}
