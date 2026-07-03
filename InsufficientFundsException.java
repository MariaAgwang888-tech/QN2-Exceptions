/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maria.paymentservice;

/**
 *
 * @author STUDENT
 */
public class InsufficientFundsException extends Exception {
       // Extra data: how much the withdrawal was short by, useful to
    // whoever catches this exception (e.g. to show "top up 50 UGX").
    private final double shortfall;

    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

