package entities;

public class Banco {
    private String name;
    private  int number;
    private double balance;

    public Banco(String name, int number, double initialValue){
        this.name = name;
        this.number = number;
        deposit(initialValue);
    }

    public Banco(String name, int number){
        this.name = name;
        this.number = number;
    }
    public Banco(){

    }

    public String getName() {return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }



    public void deposit(double value){
        this.balance += value;
    }
    public void withdraw(double value){this.balance -= value+5; }

    public String toString() {
        return "Account data:\n"+
                String.format("Account %d, holder: %s, Balance: %.2f",number,name,balance);

    }
}
