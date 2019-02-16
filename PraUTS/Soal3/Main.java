package id.ac.stmik;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        
        
        staff1.setName("Nama Staff pertama");
        staff1.setAddress("Alamat staff pertama");
        staff1.setSalary(1000000);
        
        staff2.setName("Nama Staff kedua");
        staff2.setAddress("Alamat staff kedua");
        staff2.setSalary(2000000);

        manager.setName("Nama Manager");
        manager.setAddress("Address Manager");
        manager.setSalary(3000000);
        manager.setBonus(4000000);
        
        System.out.println ("Nama   : "+staff1.getName());
        System.out.println ("Alamat : "+staff1.getAddress());
        System.out.println ("Salary : "+staff1.getSalary());
        System.out.println();
        
        System.out.println ("Nama   : "+staff2.getName());
        System.out.println ("Alamat : "+staff2.getAddress());
        System.out.println ("Salary : "+staff2.getSalary());
        System.out.println();
        
        System.out.println ("Nama   : "+manager.getName());
        System.out.println ("Alamat : "+manager.getAddress());
        System.out.println ("Salary : "+manager.getSalary());
        System.out.println();

    }
    
}
