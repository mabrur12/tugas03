package pbo.belajarClass;

public class Coffee {
    String type;
    boolean isInRack;
    boolean isRaw;

    public Coffee() {
        this.isInRack = true;
        this.isRaw = true;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void storeInRack() {
        this.isInRack = true;
    }

    public void takeItOffFromRack() {
        this.isInRack = false;
    }

    public void roast() {
        this.isRaw = false;
    }
}
