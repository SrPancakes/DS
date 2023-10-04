public class SalariedEmployee extends Employee{
    
    private double salary;

    public SalariedEmployee(String name, String hireDate, double salary){
        super(name, hireDate);
        this.salary = salary;
    }

    public double getPay(){
        return salary / 12;
    }

}