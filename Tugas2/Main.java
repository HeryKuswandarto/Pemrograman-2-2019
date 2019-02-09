package id.ac.stmik;

public class Main {

    public static void main(String[] args) {
        Circle lingkaran = new Circle();
        lingkaran.setRadius(5);
        System.out.println(lingkaran.getName());
        System.out.println ("Jari-jari : "+lingkaran.getRadius());
        System.out.println ("Luas      : "+lingkaran.getArea());
        System.out.println();
        Rectangle persegipanjang = new Rectangle();
        persegipanjang.setPanjang(3);
        persegipanjang.setLebar(4);
        System.out.println(persegipanjang.getName());
        System.out.println ("Panjang : "+persegipanjang.getPanjang());
        System.out.println ("Lebar   : "+persegipanjang.getLebar());
        System.out.println ("Luas    : "+persegipanjang.getArea());
        System.out.println();
                
    }
    
}
