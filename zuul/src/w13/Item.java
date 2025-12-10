package w13;

public class Item {
	private String name, description;
	private int weight;
	
	public Item(String name, String description, int weight) {
		this.name = name;
		this.description = description;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getLongDescription() {
		return name + " (" + weight + "Kg, " + description + ")";
	}
}
