public class Metods {

    //проверка имени для задания 1.2
    boolean CorrectName(String s) {
        if (s.length()<2 || s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') {
            return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }


    //проверка имени на допустимые символы в задании 1.3
    boolean correctName(String s) {
        if (s==null) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }

        if (s.charAt(0)=='-' || s.charAt(s.length()-1)=='-') {
           return false;
        } else {
            for (char c : s.toCharArray()) {
                if (!((c>='А'&& c<='я')||(c=='-'))) {
                    return false;
                }
            }
            return true;
        }
    }
}
