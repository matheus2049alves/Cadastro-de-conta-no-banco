package entities;

public class BusinessAccount extends Banco {
    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(String name, int number, double initialValue, Double loanLimit) {
        super(name, number, initialValue);
        this.loanLimit = loanLimit;
    }
    public void loan (double amount){
        if (amount <= loanLimit) {
            balance += amount - 10;

        }
    }
}

