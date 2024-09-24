package esercizi;

public class While {
    public static String splitString(String stringa){
        StringBuilder result= new StringBuilder();
        int i =0;
        while (i< stringa.length()){
            result.append(stringa.charAt(i));
            if (i<stringa.length() - 1){
                result.append(",");
            }
            i++;
        }
        return result.toString();
    }
}
