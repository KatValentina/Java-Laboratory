public class Metods {

    //проверка имени на допустимые символы
    boolean correctName(String s) {
        //Комментируется для 1.3. Так как какое-то из полей может быть пусто
//        if (s.isEmpty()) {
//            return false;
//        }
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
}
