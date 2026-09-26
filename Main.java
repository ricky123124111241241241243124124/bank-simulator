public class Main{

  public static void clearConsole() {
        try {
            new ProcessBuilder("clear")
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Bank banca = new Bank();

        //String iban = banca.Create_iban();
        //System.out.println(iban);

        String[] credenziali = banca.Crea_utente();

        for (String value : credenziali){
            System.out.print(value);
        }
    }
}