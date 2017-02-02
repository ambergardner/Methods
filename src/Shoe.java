
class Shoe {


    String type;
    public boolean openToe;
    public double size; //she wears 8.5
    public float height; // heel height
    public boolean boot;


    public Shoe(String type, boolean openToe, double size, float height) {
        this.type = type;
        this.openToe = openToe;
        this.size = size;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOpenToe() {
        return openToe;
    }

    public void setOpenToe(boolean openToe) {
        if (openToe) {
            boot = false;
        }
        this.openToe = openToe;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isBoot() {
        return boot;
    }

    public void setBoot(boolean boot) {
        this.boot = boot;
    }
}