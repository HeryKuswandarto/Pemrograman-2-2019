package id.ac.stmik;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BukuAlamatIO {
    public static void main(String[] args) {
        Boolean lanjut=true;
        Scanner scan = new Scanner(System.in);
        while (lanjut){
            printMenu();
            System.out.println();
            System.out.print ("Choose menu : ");
            String menuchoosen = scan.nextLine();
            if (menuchoosen.matches("1")){
                inputData();
            } else if (menuchoosen.matches("2")){
                displayData();
            } else if (menuchoosen.matches("3")){
                lanjut=false;
            } else {
                System.out.println();
                System.out.println("Menu yang anda pilih salah");
                System.out.println();
            }
        }
    }
    
    public static void printMenu(){
        System.out.println ("Menu :");
        System.out.println ("1. Input data");
        System.out.println ("2. Display all data");
        System.out.println ("3. Quit");       
    }
    
    public static void inputData(){
        EntryBukuAlamat bukualamat = new EntryBukuAlamat();
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print  ("Nama     : ");
        bukualamat.setNama(scan.nextLine());
        System.out.print  ("Alamat   : ");
        bukualamat.setAlamat(scan.nextLine());
        System.out.print  ("No. Telp : ");
        bukualamat.setNotelp(scan.nextLine());
        System.out.print  ("Email    : ");
        bukualamat.setEmail(scan.nextLine());
        
        Boolean fileexist;
        try {
            FileInputStream input = new FileInputStream("addressbook.dat");
            int nilai;
            nilai=input.read();
            input.close();
            fileexist=true;
            
        } catch (IOException e){
            fileexist=false;
        }

        if (fileexist){
            try {
                BufferedWriter writer = new BufferedWriter (new FileWriter ("addressbook.dat",true));                
                writer.write (bukualamat.getNama()+"\t");
                writer.write (bukualamat.getAlamat()+"\t");
                writer.write (bukualamat.getNotelp()+"\t");
                writer.write (bukualamat.getEmail()+"\t");
                writer.newLine();
                writer.close();
                System.out.println();
                System.out.println ("Entry saved");
                System.out.println();
            } catch (IOException e){
                e.printStackTrace();
            }        
        } else {
            try {
                BufferedWriter writer = new BufferedWriter (new FileWriter ("addressbook.dat"));                
                writer.write (bukualamat.getNama()+"\t");
                writer.write (bukualamat.getAlamat()+"\t");
                writer.write (bukualamat.getNotelp()+"\t");
                writer.write (bukualamat.getEmail()+"\t");
                writer.newLine();
                writer.close();
                System.out.println();
                System.out.println ("Entry saved");
                System.out.println();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void displayData(){
        EntryBukuAlamat bukualamat = new EntryBukuAlamat();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("addressbook.dat"));
            String baris = reader.readLine();
            int i=0;
            while (baris != null){
                i++;
                String tmp[] = baris.split("\\t");
                bukualamat.setNama(tmp[0]);
                bukualamat.setAlamat(tmp[1]);
                bukualamat.setNotelp(tmp[2]);
                bukualamat.setEmail(tmp[3]);
                System.out.println();
                System.out.println ("Data ke  : "+i);
                System.out.println ("Nama     : "+bukualamat.getNama());
                System.out.println ("Alamat   : "+bukualamat.getAlamat());
                System.out.println ("No. Telp : "+bukualamat.getNotelp());
                System.out.println ("Email    : "+bukualamat.getEmail());
                baris=reader.readLine();
            }
            System.out.println();
            reader.close();
        } catch (IOException e){
            System.out.println();
            System.out.println ("Belum ada entry data");
            System.out.println();
        }   
    }
}
