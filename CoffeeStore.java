package pbo.belajarClass;

public class CoffeeStore {
    String name;
    Coffee coffee1;
    Coffee coffee2;
    Coffee coffee3;
    Coffee coffee4;
    Coffee coffee5;
    boolean isOpen;

    public CoffeeStore() {
        this.coffee1 = new Coffee();
        this.coffee2 = new Coffee();
        this.coffee3 = new Coffee();
        this.coffee4 = new Coffee();
        this.coffee5 = new Coffee();
        this.isOpen = false;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public String getNama() {
        return this.name;
    }

    public void open() {
        this.isOpen = true;
        coffee1.takeItOffFromRack();
        coffee2.takeItOffFromRack();
        coffee3.takeItOffFromRack();
        coffee4.takeItOffFromRack();
        coffee5.takeItOffFromRack();
        coffee1.roast();
        coffee2.roast();
        coffee3.roast();
        coffee4.roast();
        coffee5.roast();
    }

    public void close() {
        this.isOpen = false;
        coffee1.storeInRack();
        coffee2.storeInRack();
        coffee3.storeInRack();
        coffee4.storeInRack();
        coffee5.storeInRack();
    }
}
