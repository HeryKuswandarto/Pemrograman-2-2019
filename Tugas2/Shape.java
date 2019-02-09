package id.ac.stmik;

public abstract class Shape {
    
    private String name;
    private double area;
    
    public Shape(){
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

        
    public abstract String getName();
    
    public abstract double getArea();
}
