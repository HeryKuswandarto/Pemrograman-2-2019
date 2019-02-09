package id.ac.stmik;

public class Rectangle extends Shape{
    
    private float panjang;
    private float lebar;
    
    public Rectangle(){
        
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public String getName(){
        return "Persegi Panjang";
    }
    
    @Override
    public double getArea(){
        double area;
        area=this.panjang*this.lebar;
        return area;
    }

    
}
