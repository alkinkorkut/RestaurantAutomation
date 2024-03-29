package project01;

public abstract class Employee implements Expense {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee() {

    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return getId() + ": " + getName();
    }

}
