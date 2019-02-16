package id.ac.stmik;

import java.util.Scanner;

public class Lingkaran {
    Scanner scan = new Scanner(System.in);
    double r1, x1, y1;
    double r2, x2, y2;
    double jarakantarpusatlingkaran;
    boolean lanjut=true;
    String result;
    
    public Lingkaran(){
        while (lanjut) {
            input();
            proses();
            output();
            lanjutYesNo();
        }
    }
          
    public void input(){
        System.out.println ("Mencari hubungan antara dua lingkaran C1 dan C2");
        System.out.println ("===============================================");
        System.out.print ("Jari-jari 1  : ");
        r1 = Double.parseDouble(scan.nextLine());
        System.out.print ("Koordinat x1 : ");
        x1 = Double.parseDouble(scan.nextLine());
        System.out.print ("Koordinat y1 : ");
        y1 = Double.parseDouble(scan.nextLine());
        System.out.print ("Jari-jari 2  : ");
        r2 = Double.parseDouble(scan.nextLine());
        System.out.print ("Koordinat x2 : ");
        x2 = Double.parseDouble(scan.nextLine());
        System.out.print ("Koordinat y2 : ");
        y2 = Double.parseDouble(scan.nextLine());
    }
    
    public void proses(){
        //hitung jarak antara titik pusat lingkaran
        jarakantarpusatlingkaran=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-x1),2)));
        double mumet;
        mumet=jarakantarpusatlingkaran-(r1+r2);
        if (mumet>0){
            result="C1 dan C2 saling lepas";
        }
        if (mumet==0){
            result="C1 dan C2 bersinggungan";
        }
        if (mumet<0){
            double selisihjarijari;
            double mumet1;
            selisihjarijari=Math.abs(r1-r2);
            mumet1=selisihjarijari-jarakantarpusatlingkaran;
            if (jarakantarpusatlingkaran>selisihjarijari){
                result=("C1 dan C2 beririsan");                
            } else {
                if ((r1==r2)&&(x1==x2)&&(y1==y2)){
                    result=("C1 dan C2 berhimpit saling tindih");
                }else {
                    if (r1>r2){
                        result=("C2 ada di dalam C1");

                    } else {
                        result=("C1 ada di dalam C2");
                    }
                }
            }
            
        }     
    }
    
    public void output(){
        System.out.println();
        System.out.println(result);
        System.out.println();
    }
    
    public void lanjutYesNo(){
        System.out.print ("Lanjut [Y/N] ? ");
        String tmp = scan.nextLine();
        if (tmp.equalsIgnoreCase("Y")){
            lanjut=true;
        } else {
            lanjut=false;
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        new Lingkaran();
    }

}
