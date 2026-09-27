import java.util.Random;
import java.util.Scanner;

public class Bank{
    
    String[] credenziali = new String[2];

    String iban;
    double saldo;

    public Bank(){}

    private String Create_iban(){

        Random rnd = new Random();
        
        String sequenza = "";

        for(int i = 1; i < 10 + 1; i++){

            int s = rnd.nextInt(i);

            sequenza += s; 
        }

        return iban = "IT " + sequenza;  
    }

    private String[] Crea_utente(){

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci id utente e password per creare l'account");
        credenziali[0] = input.nextLine(); credenziali[1] = input.nextLine();
        Main.clearConsole();

        return credenziali;
    }

    private double Aumenta_saldo(){
        
        Scanner input = new Scanner(System.in);
        String aumenta_saldo = "";

        System.out.print("\n \npremi x per aumentare il saldo di 10 e per fermarti premi s: ");
   
        do{
            aumenta_saldo = input.nextLine();
            saldo += 10;
            Main.clearConsole();
            System.out.println(saldo);          
        }
        while(!aumenta_saldo.equals("s"));  

        return saldo;
    }

    private void Get_informazioni_generali(){
       
        System.out.println("Iban: "+ iban + "\t" + "saldo: " + saldo + "\t" + "nome utente: " + credenziali[0] + "\t" + "password: " + credenziali[1]);
    }

    public void Avvia_banca(){

        Scanner input = new Scanner(System.in);
        String scelta = "";
        Create_iban();

        do {

            Main.clearConsole();

            System.out.println("========== BANCA ==========");
            System.out.println("1 - Crea account");
            System.out.println("2 - Aumenta conto");
            System.out.println("3 - Vedi le tue informazioni");
            System.out.println("4 - Esci");
            System.out.println("===========================");
            System.out.print("\nScelta: ");

            scelta = input.nextLine();

            System.out.println(); 

            switch (scelta) {

                case "1":
                    Crea_utente();
                    break;

                case "2":
                    Aumenta_saldo();
                    break;

                case "3":
                    Get_informazioni_generali();
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

            if (!scelta.equals("4")) {
                System.out.println("\nPremi INVIO per tornare al menu...");
                input.nextLine();
            }

            } while (!scelta.equals("4"));     
    }
}