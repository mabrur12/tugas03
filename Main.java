package pbo.belajarClass;
public class Main {
    public static void main(String[] args) {
        CoffeeStore warkopLumajang = new CoffeeStore();
        warkopLumajang.setNama("Warkop Lumajang");
        warkopLumajang.coffee1.setType("Arabica");
        warkopLumajang.coffee2.setType("Robusta");
        warkopLumajang.coffee3.setType("Gayo");
        warkopLumajang.coffee4.setType("Luwak");
        warkopLumajang.coffee5.setType("Toraja");

        System.out.println("Nama Warkop = " + warkopLumajang.getNama()+"\n");
        System.out.println("kopi yang tersedia :\n1. " + warkopLumajang.coffee1.getType()+"\n2. "+warkopLumajang.coffee2.getType()+"\n3. "+warkopLumajang.coffee3.getType()+"\n4. "+warkopLumajang.coffee4.getType()+"\n5. "+warkopLumajang.coffee5.getType());
        String kondisi;
        if (warkopLumajang.isOpen == true) {
            kondisi = "buka";
        } else {
            kondisi = "tutup";
        }
        System.out.println("\nwarung kopi sedang "+kondisi);
    }
}
