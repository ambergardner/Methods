// Single serving pastry made with sugar


public class Dessert {
        String type;
	    int numOfcalories;
	    boolean glutenFree;
	    double price;

	public Dessert(String type, boolean glutenFree, double price) {
		this.type = type;
		this.glutenFree = glutenFree;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type.equals("honeybun")){
			numOfcalories = 600;
		}

		this.type = type;
	}

	public int getNumOfcalories() {
		return numOfcalories;
	}

	public void setNumOfcalories(int numOfcalories) {
		this.numOfcalories = numOfcalories;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
