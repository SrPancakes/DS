public class Main{

    public static void main(String[] args){
        SalariedEmployee se = new SalariedEmployee("Rodrigo", "12-07-2020", 320000.25);
        SalariedEmployee se1 = new SalariedEmployee("Daniel", "12-07-2020", 320000.25);
        System.out.println(se.getName() + ", hired on " + se.getHireDate() + " has a salary of " + se.getPay() + " monthly.\n");
        if(se.samePay(se1)) System.out.println(se.getName() + " and " + se1.getName() + " have the same salary\n");
    }
}