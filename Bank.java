import java.util.Random;
import java.util.Scanner;

public class Bank{
    
    String[] credenziali = new String[2];

    String iban;
    double saldo;

    public Bank(){
    }

    public String Create_iban(){

        Random rnd = new Random();

        char[] caratteri = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String sequenza = "";

        for(int i = 1; i < caratteri.length + 1; i++){

            int s = rnd.nextInt(i);

            sequenza += s; 
        }

        return iban = "IT " + sequenza;  
    }

    public String[] Crea_utente(){

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci id utente e password per creare l'account");
        credenziali[0] = input.nextLine(); credenziali[1] = input.nextLine();
        Main.clearConsole();

        return credenziali;

    }
}