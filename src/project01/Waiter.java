package project01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Waiter extends Employee{
    private double orderRate=0.10;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Waiter(int id, String name){
        super(id,name);
    }

    public Waiter() {
        super();
    }

    @Override
    public double calculateExpense() {
        double sum = 0;
        for(int i=0;i<orders.size();i++){
            sum += orders.get(i).calculateExpense();
        }
        return sum;
    }

    public void createOrder(Order order){
        this.orders.add(order);
    }

    public ArrayList<Order> getOrdersRecieved(){
        return this.orders;
    }


}
