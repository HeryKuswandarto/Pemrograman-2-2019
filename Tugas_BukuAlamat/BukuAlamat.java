package bukualamat;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BukuAlamat {

    
    public static void information(){
        System.out.println ("Menu :");
        System.out.println ("1. Input data");
        System.out.println ("2. Update data");
        System.out.println ("3. Delete data");
        System.out.println ("4. Display all data");
        System.out.println ("5. Quit");       
    }

    
    public static void main (String[] args){
        List<EntryBukuAlamat> BukuAlamat = new ArrayList<EntryBukuAlamat>();
        Boolean lanjut=true;
        Scanner scan = new Scanner(System.in);
        while (lanjut) {
            information();
            System.out.print ("Choose menu : ");
            String menuchoosen = scan.nextLine();
            if (menuchoosen.matches("1")){
                if (BukuAlamat.size()<100) {
                    System.out.print ("Nama     : ");
                    EntryBukuAlamat TmpBukuAlamat = new EntryBukuAlamat();
                    TmpBukuAlamat.setNama(scan.nextLine());
                    System.out.print ("Alamat   : ");
                    TmpBukuAlamat.setAlamat(scan.nextLine());
                    System.out.print ("No. Telp : ");
                    TmpBukuAlamat.setNotelp(scan.nextLine());
                    System.out.print ("Email    : ");
                    TmpBukuAlamat.setEmail(scan.nextLine());
                    BukuAlamat.add(TmpBukuAlamat);
                    System.out.println ("Kontak sudah disimpan");
                    System.out.println();
                } else {
                    System.out.println ("Data penuh");
                }  
            } else if (menuchoosen.matches("2")) {
                EntryBukuAlamat TmpBukuAlamat = new EntryBukuAlamat();
                System.out.print ("Masukkan index kontak yang akan diupdate : ");
                int indexkontak=Integer.parseInt(scan.nextLine());
                TmpBukuAlamat=BukuAlamat.get(indexkontak-1);
                System.out.println("Nama     : "+TmpBukuAlamat.getNama());
                System.out.println("Alamat   : "+TmpBukuAlamat.getAlamat());
                System.out.println("No. Telp : "+TmpBukuAlamat.getNotelp());
                System.out.println("Email    : "+TmpBukuAlamat.getEmail());
                System.out.println("Enter update");
                System.out.print ("Nama baru     : ");
                TmpBukuAlamat.setNama(scan.nextLine());
                System.out.print ("Alamat baru   : ");
                TmpBukuAlamat.setAlamat(scan.nextLine());
                System.out.print ("No. Telp baru : ");
                TmpBukuAlamat.setNotelp(scan.nextLine());
                System.out.print ("Email baru    : ");
                TmpBukuAlamat.setEmail(scan.nextLine());
                BukuAlamat.set(indexkontak-1, TmpBukuAlamat);
                System.out.println ("Kontak sudah diupdate");
                System.out.println();
            } else if (menuchoosen.matches("3")) {
                EntryBukuAlamat TmpBukuAlamat = new EntryBukuAlamat();
                System.out.print ("Masukkan index kontak yang akan dihapus : ");
                int indexkontak=Integer.parseInt(scan.nextLine());
                TmpBukuAlamat=BukuAlamat.get(indexkontak-1);
                System.out.println("Nama     : "+TmpBukuAlamat.getNama());
                System.out.println("Alamat   : "+TmpBukuAlamat.getAlamat());
                System.out.println("No. Telp : "+TmpBukuAlamat.getNotelp());
                System.out.println("Email    : "+TmpBukuAlamat.getEmail());
                System.out.print ("Yakin akan dihapus (Y/N)");
                String temphapus=scan.nextLine();
                if (temphapus.matches("Y") || temphapus.matches("y")) {
                    BukuAlamat.remove (indexkontak-1);
                    System.out.println ("Kontak sudah dihapus");
                } else {
                    System.out.println ("Kontak batal dihapus");
                }
                System.out.println();
            } else if (menuchoosen.matches("4")) {
                EntryBukuAlamat TmpBukuAlamat = new EntryBukuAlamat();
                System.out.println ("Daftar kontak:");
                for (int i=0; i<BukuAlamat.size();i++){
                    System.out.print(i+1);
                    System.out.print(". ");
                    System.out.print (BukuAlamat.get(i).getNama()+", ");
                    System.out.print (BukuAlamat.get(i).getAlamat()+", ");
                    System.out.print (BukuAlamat.get(i).getNotelp()+", ");
                    System.out.print (BukuAlamat.get(i).getEmail()+", ");
                    System.out.println();
                }
                System.out.println();
            } else if (menuchoosen.matches("5")) {
                lanjut=false;
            } else {
                System.out.println ("Pilihan salah");
                System.out.println();
            }
            
        }
    }     
}
