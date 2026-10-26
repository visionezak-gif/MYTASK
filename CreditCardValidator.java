
import java.util.Scanner;

public class CreditCardValidator {

    public static String validateCardNumber() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String visaCardNumber = input.nextLine();

        if (visaCardNumber.length() > 0 && visaCardNumber.charAt(0) == '4') {

            if (visaCardNumber.length() >= 13 && visaCardNumber.length() <= 16) {

                return visaCardNumber;
            }
        }

        return "Invalid card number";
    }
    
    
    
    

    public static void main(String[] args) {

        System.out.println(validateCardNumber());
    }
}








