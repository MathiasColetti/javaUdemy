package Herança.aula01;

public class main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "MAthias", 0.01);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.00);

        Account account = bacc;
        System.out.println(account.getBalance());

    }
}
