package ex1;

public class StringUtilities {

    public static boolean isValidString(String s, String validCharacters, int maxLength){
        if(s == null || s.isEmpty()) return false;
        String str = s.replaceAll("[123456789]", "");
        for(char c : str.toCharArray())
            /*
                Miramos que cada caracter esté incluído en
                el conjunto de caracteres introducidos por parámetro
             */
            if(validCharacters.indexOf(c) == -1) return false;

        /*
            Comprobamos: Que no esté vacía,
            que la longitud sea igual o menor que el máximo y
             que se cumpla la condición de arriba
         */
        return s.length() >= maxLength;
    }

    public static String lowercaseFirst(String s){
        String res = "", aux = "";
        for(char c : s.toCharArray()){ //Separamos en dos Strings los caracteres en minúscula y los caracteres en mayúscula
            if(Character.isLowerCase(c)) res += c;
            else aux += c;
        }
        return res + aux; //Después los juntamos
    }

    public static boolean checkTextStats(String s, int lengthMin, int lengthMax){
        if(s == null || s.isEmpty() || lengthMin <= 0 || lengthMax <= 0) throw new IllegalArgumentException();

        int totalLength = 0, wordMaxLength = 0, totalWords = 0;

        for(String words : s.split(" ")){
            totalLength+=words.length();
            if(words.length() > wordMaxLength) wordMaxLength = words.length();
            totalWords++;
        }

        double lengthMed = (double) totalLength / totalWords;

        return (lengthMed) >= lengthMin
                && (lengthMed) <= lengthMax
                && wordMaxLength <= 2*(lengthMed);
    }

}
