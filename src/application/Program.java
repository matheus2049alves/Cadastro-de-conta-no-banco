package application;

import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void  main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        Banco banco;

        System.out.println("Enter account number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Enter account holder: ");
        String name = input.nextLine();
        System.out.println("Is there a initial deposit (y/n)?");
        char response = input.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter initial deposit value:");
            double initialValue = input.nextDouble();
            banco = new Banco(name,number,initialValue);


        } else {
            banco = new Banco(name, number);
        }
        System.out.println(banco);
        System.out.println("Enter a deposit value: ");
        double deposit = input.nextDouble();;
        banco.deposit(deposit);
        System.out.println(banco);
        System.out.println("Enter a withdraw value: ");
        double retire = input.nextDouble();
        banco.withdraw(retire);
        System.out.println(banco);

        System.out.println("Luffy dick your mon");
        System.out.println("Init the branch");
    }
}
