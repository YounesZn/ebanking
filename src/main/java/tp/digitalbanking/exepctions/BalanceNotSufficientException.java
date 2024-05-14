package tp.digitalbanking.exepctions;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String insufficientFunds) {
        super(insufficientFunds);
    }
}
