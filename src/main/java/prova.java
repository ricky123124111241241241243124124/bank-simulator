import java.util.Random;

public class prova{
    public static void main(String[] args){
        char[] caratteri = {'a', 'b', 'c', 'd'};

        Random rnd = new Random(); 
        String iban = "";

        for(int i = 0; i < caratteri.length; i++){
            int ciao = rnd.nextInt(caratteri.length);

            iban += ciao;

        }

        System.out.println(iban);
        
    }
}
