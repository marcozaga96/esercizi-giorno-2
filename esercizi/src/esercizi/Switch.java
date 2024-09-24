package esercizi;

public class Switch {
    public static String stampaNumeri(int numero){
        switch (numero){
            case 0:
                    return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return " non hai inserito un numero valido";
        }
    }
}
