package mobil;
public class Mobil {
    
    int kecMax;
    int kecAktual;
    int percepatan;
    boolean sudahdistart;
    
    public Mobil(){
        this.sudahdistart = false;
        this.kecAktual=0;
        this.percepatan=0;
        this.kecMax=120;        
    }
        
    public void start(){
       if (this.sudahdistart){
           System.out.println ("Mobil sudah distart");
       } else {
           this.sudahdistart=true;
           System.out.println("Mobil distart");
       }
       
    }
    
    public void stop(){
        if (this.sudahdistart==false){
            System.out.println ("Mobil sudah dalam keadaan stop");
        } else {
            this.sudahdistart=false;
            this.kecAktual=0;
            this.percepatan=0;
            this.sudahdistart=false;
        }
    }
    
    public void rem(){
        this.kecAktual=this.kecAktual-percepatan;
        if (this.kecAktual<0) {
            this.kecAktual=0; 
        }
        System.out.println("Kecepatan aktual = "+this.kecAktual);
    }
    
    public void gantigigi(int gigi){
        switch (gigi){
            case 0:
                this.percepatan=0;
                break;                
            case 1:
                this.percepatan=1;
                break;
            case 2:
                this.percepatan=5;
                break;
            case 3:
                this.percepatan=10;
                break;
            case 4:
                this.percepatan=15;
                break;
            default:
                System.out.println("Salah");               
        }
    }
    
    public void gas(){
        this.kecAktual=this.kecAktual+percepatan;
        if (this.kecAktual>this.kecMax){
            this.kecAktual=this.kecMax;
        }
        System.out.println("Kecepatan aktual = "+this.kecAktual);
    }
    
    public static void main(String[] args) {
        Mobil sedan = new Mobil();
        sedan.start();
        sedan.gantigigi(2);
        sedan.gas();
    }    
}
