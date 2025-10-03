package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Anna", "Hansen", "annah"));
        customers.add(new Customer("Peter", "Olsen", "petero"));

        printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers) {

        for (Customer customer : customers) {
            System.out.println(customer);
        }


    }

}
