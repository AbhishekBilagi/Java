package Collection;

public class MobileObject {
	
	private String name;
	private int cost;
	public MobileObject(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
   public String toString() {
	return name+" "+cost;
}

}
