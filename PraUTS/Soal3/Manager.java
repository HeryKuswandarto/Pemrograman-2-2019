package id.ac.stmik;

public class Manager extends Employee{
    private int bonus;
    
    public Manager(){
        
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public Integer getSalary() {
        int totalsalary;
        totalsalary=this.bonus+super.getSalary();
        return totalsalary;
    }
    
}
