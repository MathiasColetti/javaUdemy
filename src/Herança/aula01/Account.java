package Herança.aula01;

public class Account {
    public  Integer number;
    public String holder;
    public Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void withdraw(Double amout){
        this.balance-= amout;
    }
    public void deposit(Double amount){
        this.balance += amount;
    }

}
