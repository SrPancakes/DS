public class HourlyEmployee extends Employee{

    private double wageRate;
    private int hours;

    public HourlyEmployee(String name, String hireDate, double wageRate, int hours){
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getPay(){
        return wageRate * hours;
    }
}