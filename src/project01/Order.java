package project01;

import java.util.ArrayList;

public class Order extends Waiter{
    private ArrayList<Product> orderedProducts = Main.restaurant.getProducts();

    public Order(){
        super();
    }

    public void addProduct(Product product){
        orderedProducts.add(product);
    }

    public void listOrder(){
        for(int i=0;i<orderedProducts.size();i++){
            System.out.println(i+1 + ": " + orderedProducts.get(i));
        }
    }

    public ArrayList<Product> getOrderedProducts(){
        return orderedProducts;
    }

    public double calculateTotalPrice(){
        double sum=0;
        for(int i=0;i<orderedProducts.size();i++){
            sum += orderedProducts.get(i).getSellingPrice();
        }
        return sum;
    }



}
