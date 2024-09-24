import esercizi.For;
import esercizi.If;
import esercizi.Switch;
import esercizi.While;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------esercizio if/else-------------------------");

        If.stringaPariDispari("ciaoo");
        If.annoBisestile(2024);


        System.out.println("---------------------------------------esercizio switch---------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = scanner.nextInt();
        String risultato = Switch.stampaNumeri(numero);
        System.out.println(risultato);



        System.out.println("---------------------------------------esercizio while----------------------------");

        Scanner scanner1 = new Scanner(System.in);
        String stringa = "";
        while (!stringa.equals(":q")){
            System.out.print("Inserisci una stringa o ':q' per uscire: ");
            stringa = scanner1.nextLine();

            if (!stringa.equals(":q")) {
                String risultatoConVirgola = While.splitString(stringa);
                System.out.println("Stringa suddivisa: " + risultatoConVirgola);
            }
        }


        System.out.println("---------------------------------------esercizio for------------------------------");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("inserisci un numero intero");
        int numberInt= scanner2.nextInt();
        For.ContoAllaRovescia(numberInt);
        scanner2.close();
    }
}