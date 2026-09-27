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

        banca.Avvia_banca();

    }
}