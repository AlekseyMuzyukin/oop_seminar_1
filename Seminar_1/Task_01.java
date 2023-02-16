package Seminar_1;

import java.util.ArrayList;

public class Task_01 {

    public static void main(String[] args) {
        VendingMachine firstMachine = new VendingMachine("first machine");
        Product first = new Product("орешки", 100);
        Product second = new Product("шоколад", 150);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
        
        Drink firstDrink = new Drink("кола", 100);
        firstDrink.setVolume(100);
        Drink secondDrink = new Drink("квас", 150);
        secondDrink.setVolume(150);
        
        HotDrinkVendingMachine secondMachine = new HotDrinkVendingMachine("second machine");
        HotDrink firstHotDrink = new HotDrink("кофе", 200);
        firstHotDrink.setVolume(100);
        firstHotDrink.setTemperature(90);
        secondMachine.addProduct(firstHotDrink);
        HotDrink secondHotDrink = new HotDrink("какао", 180);
        secondHotDrink.setVolume(100);
        secondHotDrink.setTemperature(85);
        secondMachine.addProduct(secondHotDrink);
        System.out.println(secondHotDrink.getName() + ", цена: " + secondMachine.getProduct("какао", 100, 85).getPrice());
        
        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(firstHotDrink);
        products.add(secondHotDrink);
        for (Product el: products) {
            el.consume();
        }
    }
}