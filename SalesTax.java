public class SalesTax {
    public static void main(String[] args) {
        double cost = 50;
        final double INTEREST_RATE = .05;
        double salesTax = cost * INTEREST_RATE;
        double totalCost = salesTax + cost;


        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Total Cost: " + totalCost);

    }
}
