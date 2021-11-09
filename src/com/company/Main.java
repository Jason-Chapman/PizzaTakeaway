package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pizzaSize = "";
        double sizeCost = 0.00;
        boolean correctSize = false;

        while (!correctSize) {

            System.out.println("Small, Medium or Large?");
            pizzaSize = input.next();

            if (pizzaSize.equals("Small") || pizzaSize.equals("small")) {
                sizeCost = 7.99;
                correctSize = true;
            } else if (pizzaSize.equals("Medium") || pizzaSize.equals("medium")) {
                sizeCost = 10.99;
                correctSize = true;
            } else if (pizzaSize.equals("Large") || pizzaSize.equals("large")) {
                sizeCost = 13.99;
                correctSize = true;
            } else {
                System.out.println("That is not a pizza size.");
            }
        }
        System.out.println("You can choose 2 free toppings.");

        ArrayList<String> toppings = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Choose your free topping: ");
                String topping = input.next();
                toppings.add(topping);

                System.out.println("Your current toppings are:");
                for (int j = 0; j < toppings.size(); j++) {
                    System.out.println(toppings.get(j));
                }

            } catch (InputMismatchException e) {
                System.out.println("Exception Thrown: " + e);
                System.out.println("Invalid Input Type.");
                input.next();
            }
        }

        System.out.println("You may now select extra toppings for 1.99 each. type 'End' to exit and receive final cost.");

        double cost = sizeCost;

        while (true) {
            System.out.println("");
            System.out.println("Choose your topping: ");
            String topping = input.next();

            if (topping.equals("end") || topping.equals("End")) {
                System.out.println("");
                System.out.println("Your final cost is " + cost);
                System.exit(0);
            }

            toppings.add(topping);
            System.out.println("");
            System.out.println("Your current toppings are:");
            for (int j = 0; j < toppings.size(); j++) {
                System.out.println(toppings.get(j));
            }

            cost = cost + 1.99;
        }
    }
}
