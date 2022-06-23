package FunctionalInterface;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "5637");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
        greetCustomerV2(maria,false);

    }
    static Consumer<Customer> greetCustomerConsumer =  customer ->
            System.out.println("hello " + customer.customerName +
                    " thanks for registering phoneNumber "+ customer.customerPhone);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =  (customer, showPhone) ->
            System.out.println("hello " + customer.customerName +
                    " thanks for registering phoneNumber "+ (showPhone ? customer.customerPhone : "***"));
    static void greetCustomer(Customer customer){
        System.out.println("hello " + customer.customerName +
                " thanks for registering phoneNumber "+ customer.customerPhone);
    }
    static void greetCustomerV2(Customer customer, boolean showPhone){
        System.out.println("hello " + customer.customerName +
                " thanks for registering phoneNumber "+ (showPhone ? customer.customerPhone:"****"));
    }
    static class Customer {
        private final String customerName;
        private final String customerPhone;
        Customer(String customerName, String customerPhone){
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }

    }
}
