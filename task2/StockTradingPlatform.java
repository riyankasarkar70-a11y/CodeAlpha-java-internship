import java.util.Scanner;

class Stock {
    String name;
    int quantity;
    double price;

    Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stock stock = new Stock("ABC Ltd", 0, 100.0);

        while (true) {
            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter quantity to buy: ");
                int qty = sc.nextInt();
                stock.quantity += qty;
                System.out.println("Stock purchased successfully.");
            } 
            else if (choice == 2) {
                System.out.print("Enter quantity to sell: ");
                int qty = sc.nextInt();
                if (qty <= stock.quantity) {
                    stock.quantity -= qty;
                    System.out.println("Stock sold successfully.");
                } else {
                    System.out.println("Not enough stock to sell.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Stock Name: " + stock.name);
                System.out.println("Quantity: " + stock.quantity);
                System.out.println("Total Value: $" + (stock.quantity * stock.price));
            } 
            else {
                break;
            }
        }
    }
}

