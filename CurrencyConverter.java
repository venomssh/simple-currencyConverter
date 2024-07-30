import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. EUR to INR");
        System.out.println("2. USD to INR");
        System.out.println("3. GBP to INR");
        System.out.println("4. SAR to INR");
        System.out.println("5. CAD to INR");
        System.out.println("6. AUD to INR");
        System.out.println("7. INR to EUR");
        System.out.println("8. INR to USD");
        System.out.println("9. INR to GBP");
        System.out.println("10. INR to SAR");
        System.out.println("11. INR to CAD");
        System.out.println("12. INR to AUD");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double result = 0;
        
        scanner.close();
        switch (choice) {
            case 1:
                result = amount * 89.31; // 1 EUR = 89.31 INR
                System.out.println(amount + " EUR is equal to " + result + " INR");
                break;
            case 2:
                result = amount * 83.54; 
                System.out.println(amount + " USD is equal to " + result + " INR");
                break;
            case 3:
                result = amount * 105.62; 
                System.out.println(amount + " GBP is equal to " + result + " INR");
                break;
            case 4:
                result = amount * 22.26; 
                System.out.println(amount + " SAR is equal to " + result + " INR");
                break;
            case 5:
                result = amount * 60.96; 
                System.out.println(amount + " CAD is equal to " + result + " INR ");
                break;
            case 6:
                result = amount * 55.53; 
                System.out.println(amount + " AUD is equal to " + result + " INR");
                break;
            case 7:
                result = amount * 0.011; 
                System.out.println(amount + " INR is equal to " + result + " EUR");
                break;
            case 8:
                result = amount * 0.012; 
                System.out.println(amount + " INR is equal to " + result + " USD");
                break;
            case 9:
                result = amount * 0.0095; 
                System.out.println(amount + " INR is equal to " + result + " GBP");
                break;
            case 10:
                result = amount * 0.045; 
                System.out.println(amount + " INR is equal to " + result + " SAR");
                break;
            case 11:
                result = amount * 0.016; 
                System.out.println(amount + " INR is equal to " + result + " CAD ");
                break;
            case 12:
                result = amount * 0.018; 
                System.out.println(amount + " INR is equal to " + result + " AUD");
                break;    
            default:
                System.out.println("Invalid choice");
        }
        
    }
    
}