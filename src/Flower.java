/*
track the amount of growth in a certain flower based on the amount of sunlight its exposed to (better description)
*/

class Flower { // corrected the name of class so the first letter is now uppercase
	String type;
	public double growRate;
	public float height;
	public int daysOfsunlight; //number of days exposed to sunlight


    public Flower(String type, double growRate, float height, int daysOfsunlight) {
        this.type = type;
        this.growRate = growRate;
        this.height = height;
        this.daysOfsunlight = daysOfsunlight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGrowRate() {
        return growRate;
    }

    public void setGrowRate(double growRate) {
        this.growRate = growRate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getDaysOfsunlight() {
        return daysOfsunlight;
    }

    public void setDaysOfsunlight(int daysOfsunlight) {
        if (daysOfsunlight ==0) {
            growRate = 0;

        }
        this.daysOfsunlight = daysOfsunlight;
    }
}