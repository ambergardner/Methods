// the height and weight of a child related to age.  (Name of class and comments changed)
class Child {


	String name; // childs name
	int age; //child age in number of years (changed per comments)
	double height;  // number of inches
	double weight;  // number of pounds


    public Child(String name, byte age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) throws Exception {
        if (age <0) {
            throw new Exception("invalid age");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
	
	
