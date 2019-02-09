package id.ac.stmik;

public class Circle extends Shape{
    
    private float radius;

    public Circle(){
        
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
 
    
    
    @Override
    public String getName(){
        return "Lingkaran";
    }
    
    @Override
    public double getArea(){
        double area;
        area=this.radius*this.radius*3.14;
        return area;
    }
    
}
