package project01;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public Restaurant() {
        initEmployees();
        initProducts();
    }

    private void initEmployees(){
        addCook("Monica", 100);

        addWaiter("Ross");
        addWaiter("Phobe");
        addWaiter("Rachel");
    }

    private void initProducts(){
        products.add(new MainDish("Pizza", 6, 2, 2));
        products.add(new MainDish("Burger", 5, 1.5, 2));

        products.add(new Beverage("Coke", 2, 0.5));
        products.add(new Beverage("Lemonade", 2, 0.3));

        products.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new Dessert("Cake", 3, 0.5, 1));
        products.add(new Dessert("Ice Cream", 3, 0.5, 0.5));

        ArrayList<Product> HGproducts = new ArrayList<>();
        HGproducts.add(new MainDish("Pizza", 6, 2, 2));
        HGproducts.add(new Beverage("Coke", 2, 0.5));
        HGproducts.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new MenuProduct("Hunger Games Menu", HGproducts));

        ArrayList<Product> Kidsproducts = new ArrayList<>();
        Kidsproducts.add(new MainDish("Burger", 5, 1.5, 2));
        Kidsproducts.add(new Beverage("Lemonade", 2, 0.3));
        Kidsproducts.add(new Dessert("Ice Cream", 3, 0.5, 0.5));
        products.add(new MenuProduct("Kids Menu", Kidsproducts));
    }

    public void listEmployees(){
        for(int i=0;i<employees.size();i++){
            System.out.println("Employee " + employees.get(i));
        }
    }

    public void addCook(String name, double salary){
        employees.add(new Cook(employees.size()+1, name, salary));
    }

    public void addWaiter(String name){
        employees.add(new Waiter(employees.size()+1, name));
    }

    public Waiter assignWaiter(){
        Random random = new Random();
        int arrayListSize = employees.size();
        int randomIndex = random.nextInt(arrayListSize);
        if(employees.get(randomIndex) instanceof Waiter){
            return ((Waiter)employees.get(randomIndex));
        }else{
            return assignWaiter();
        }
    }

    public double calculateExpenses(){

        double sum1=0;
        for(int i=0;i<employees.size();i++){
            sum1 += employees.get(i).calculateExpense();
        }
        System.out.println("Employee expenses: "+ sum1);

        double sum2=0;
        for(int i=0;i<products.size();i++){
            sum2 += products.get(i).calculateExpense();
        }
        System.out.println("Order expenses: "+ sum2);

        return sum1+sum2;
    }

    public double calculateRevenue(){
        double sum=0;
        for(int i=0; i<products.size();i++){
            sum += products.get(i).getPurchasePrice();
        }
        return sum;
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }
}
