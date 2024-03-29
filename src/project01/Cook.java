package project01;

public class Cook extends Employee{
    private double salary;
    private double taxRate=0.18;

    public Cook(int id, String name, double salary){
        super(id,name);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getTaxRate(){
        return this.taxRate;
    }

    @Override
    public double calculateExpense() {
        return getSalary() + getSalary()*getTaxRate();
    }
}
