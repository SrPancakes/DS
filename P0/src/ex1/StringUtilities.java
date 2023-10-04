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
<<<<<<< HEAD
        StringBuilder res = new StringBuilder();
        StringBuilder aux = new StringBuilder();
=======
        StringBuilder res = new StringBuilder(), aux = new StringBuilder();
>>>>>>> 78b1d651b6c0ef95d1a5b7630ed14ca479735857
        for(char c : s.toCharArray()){ //Separamos en dos Strings los caracteres en minúscula y los caracteres en mayúscula
            if(Character.isLowerCase(c)) res.append(c);
            else aux.append(c);
        }
<<<<<<< HEAD
        return res.toString() + aux; //Después los juntamos
=======
        return res.append(aux).toString(); //Después los juntamos
>>>>>>> 78b1d651b6c0ef95d1a5b7630ed14ca479735857
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
