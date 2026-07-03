/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package maria.paymentservice;

/**
 *
 * @author STUDENT
 */
public class PaymentService {
     private double balance;

    public PaymentService(double openingBalance) {
        this.balance = openingBalance;
    }

    /**
     * withdraw() DECLARES InsufficientFundsException with throws
     * because it is a CHECKED exception -- this code would simply
     * not compile without that declaration
     * @param amount
     * @throws maria.paymentservice.InsufficientFundsException
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(
                    "Cannot withdraw " + amount + "; balance is only " + balance,
                    shortfall);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService(100);
        try {
            service.withdraw(250); // will fail: balance is only 100
        } catch (InsufficientFundsException e) {
            System.out.println("Payment failed: " + e.getMessage()
                    + " (short by " + e.getShortfall() + ")");
        }
    }
}




    
