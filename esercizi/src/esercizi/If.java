package esercizi;

public class If {
    public static boolean stringaPariDispari( String strings) {
        // blocco di istruzioni
        if(strings.length() % 2 == 0){
                    System.out.println("la stringa " + strings + " è pari");
            return true;
        } else {
                    System.out.println("la stringa " + strings + " è dispari");
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                System.out.println(anno + " è un anno bisestile.");
                return true;
            }
        } else {
            System.out.println(anno + " non è un anno bisestile.");
            return false;
        }
    }


}
