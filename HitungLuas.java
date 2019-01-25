import java.util.Scanner;

public class HitungLuas {
    Scanner scan = new Scanner(System.in);
    
    public HitungLuas(){
        cariLuasPersegiPanjang();
        cariLuasLingkaran();    
    }
    
    public void cariLuasPersegiPanjang(){
        System.out.println ("Menghitung Luas Persegi Panjang");
        System.out.println ("-------------------------------");
        System.out.print ("Masukkan panjang : ");
        String inputpanjang = scan.nextLine();
        int panjang = Integer.parseInt(inputpanjang);
        System.out.print ("Masukkan lebar   : ");
        String inputlebar = scan.nextLine();
        int lebar = Integer.parseInt(inputlebar);
        int luaspersegipanjang = panjang*lebar;
        System.out.println ("Luas             : "+luaspersegipanjang);
        System.out.println();
    }

    public void cariLuasLingkaran(){
        System.out.println ("Menghitung Luas Lingkaran");
        System.out.println ("-------------------------");
        System.out.print ("Masukkan jari-jari : ");
        String inputradius = scan.nextLine();
        int radius = Integer.parseInt(inputradius);
        float luaslingkaran = (float)(22.0/7.0)*radius*radius;
        System.out.println("Luas lingkaran      : "+luaslingkaran);      
    }
    
    public static void main(String[] args) {
        new HitungLuas();
    }    
}
