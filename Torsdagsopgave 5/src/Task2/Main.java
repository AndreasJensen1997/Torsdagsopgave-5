package Task2;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();
        // peger  vores menu til coffeeMenu
        ArrayList<String> menu = cafe.getCoffeeMenu();

        for (String coffee : menu) {
            System.out.println(coffee);
        }

    }


}

