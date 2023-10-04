public abstract class Employee{
    
    private String name;
    private String hireDate;

    public Employee(String name, String hireDate){
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName(){
        return name;
    }

    public String getHireDate(){
        return hireDate;
    }

    public abstract double getPay();

    public boolean samePay(Employee emp){
        return emp != null && getPay() == emp.getPay();
    }

}   