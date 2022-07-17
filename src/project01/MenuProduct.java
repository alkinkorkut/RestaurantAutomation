package project01;

import java.util.ArrayList;

public class MenuProduct extends Product{
    private ArrayList<Product> individualProducts;

    public MenuProduct(String name, ArrayList<Product> individualProducts){
        super(name);
        this.individualProducts = individualProducts;
    }

    @Override
    public double calculateExpense() {
        double sum = 0;
        for(int i=0;i< individualProducts.size();i++){
            sum += individualProducts.get(i).calculateExpense();
        }
        return sum;
    }

    private double calculateSellingPrice(){
        double sum = 0;
        for(int i=0;i<individualProducts.size();i++){
            if(individualProducts.get(i) instanceof MainDish){
                sum += individualProducts.get(i).getSellingPrice() - individualProducts.get(i).getSellingPrice()*0.10;
            }else if(individualProducts.get(i) instanceof Dessert){
                sum += individualProducts.get(i).getSellingPrice() - individualProducts.get(i).getSellingPrice()*0.20;
            }else if(individualProducts.get(i) instanceof Beverage){
                sum += individualProducts.get(i).getSellingPrice() - individualProducts.get(i).getSellingPrice()*0.50;
            }else{
                sum += 0;
            }
        }
        return sum;
    }


}
