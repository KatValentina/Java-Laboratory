import java.util.Random;
import java.util.Scanner;

public class Metod {

    // 1.2 задание
    public int sumLastNums(int x) {
        int c = x%100;
        return c % 10 + c / 10;
    }

    // 1.4 задание
    public boolean isPositive(int x) {
        return x > 0; // заменяет конструкцию  if (x > 0) else
    }

    // 1.6 задание
    public boolean isUpperCase(char x) {
        return 'A'<=x && x<='Z';
    }

    // 1.8 задание
    public boolean isDivisor(int a, int b) {
        if (a!=0 && b!=0) {
            return a%b==0 || b%a==0;
        } else if (a==0 && b==0) {
            return false;
        } else {
            return true;
        }
    }

    // 1.10 задание
    public int lastNumSum(int a, int b) {
        if (a<0) {
            a=a*(-1)%10;
        } else {
            a=a%10;
        }
        if (b<0) {
            b=b*(-1)%10;
        } else {
            b=b%10;
        }
        return a+b;
    }

    // 2.2 задание
    public double safeDiv(int x, int y) {
        if (x==0 || y==0) {
            return 0;
        } else {
            return (double) x/y;
        }
    }

    // 2.4 задание
    public String makeDecision(int x, int y) {
        if (x!=y) {
            if (x>y) {
                return Integer.toString(x)+" > "+Integer.toString(y);
            } else {
                return Integer.toString(x)+" < "+Integer.toString(y);
            }
        } else {
            return Integer.toString(x)+" == "+Integer.toString(y);
        }
    }

    // 2.6 задание
    public boolean sum3(int x, int y, int z) {
        return (x+y==z || x+z==y || y+z==x);
    }

    // 2.8 задание
    public String age(int x) {
        int s = x%10;
        if (s>4 || (x>=11 && x<=14)) {
            return Integer.toString(x)+" лет";
        } else if (s>=2) {
            return Integer.toString(x)+" года";
        } else {
            return Integer.toString(x)+" год";
        }
    }

    // 2.10 задание
    public void printDays(String x) {
        switch (x) {
            case "понедельник": {
                System.out.print(x + "\nвторник" + "\nсреда" + "\nчетверг" + "\nпятница" +
                        "\nсуббота" + "\nвоскресенье");
                break;
            }
            case "вторник": {
                System.out.print(x + "\nсреда" + "\nчетверг" + "\nпятница" +
                        "\nсуббота" + "\nвоскресенье");
                break;
            }
            case "среда": {
                System.out.print(x + "\nчетверг" + "\nпятница" +
                        "\nсуббота" + "\nвоскресенье");
                break;
            }
            case "четверг": {
                System.out.print(x + "\nпятница" + "\nсуббота" + "\nвоскресенье");
                break;
            }
            case "пятница": {
                System.out.print(x + "\nсуббота" + "\nвоскресенье");
                break;
            }
            case "суббота": {
                System.out.print(x + "\nвоскресенье");
                break;
            }
            case "воскресенье": {
                System.out.print(x);
                break;
            }
            default: System.out.println("это не день недели"); break;
        }
    }

    // 3.2 задание
    public String reverseListNums(int x) {
        String s="";
        for (int i=x;i>=0;i--) {
            s = s + Integer.toString(i)+" ";
        }
        return s;
    }

    // 3.4 задание
    public int pow(int x, int y) {
        int p = 1;
        for (int i=0;i<y;i++) { //учитываем 0 степень, поэтому <
            p=p*x;
        }
        return p;
    }

    // 3.6 задание
    public boolean equalNum(int x) {
        if (x < 0) { // если пользыватель ввёл отриц. число
            x = -x;
        }
        int c = x%10; // находим последнее число
        while (x > 0) {
            if (x % 10 != c) {
                return false;
            }
            x = x/10;
        }
        return true;
    }

    // 3.8 задание
    public void leftTriangle(int x) {
        for (int i = 1;i <= x;i++) {
            int y = 1;
            while (y <= i) {
                System.out.print("*");
                y++;
            }
            System.out.println(); // переход на следующую строчку
        }
    }

    // 3.10 задание
    public void guessGame() {
        Random random = new Random();
        int comp = random.nextInt(0,10);
        int k = 1; // счётчик попыток
        int user; // под число пользывателя
        System.out.print("Введите число от 0 до 9: ");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextInt();

        while (comp != user) {
            k++;
            System.out.print("Вы не угадали, введите число от 0 до 9: ");
            user = scanner.nextInt();
        }
        System.out.println("Вы угадали!\n" +
                "Вы отгадали число за "+k+" колличества попыток.");
    }

    //доп метод для заполнения массива
    public int[] addArr(int n) {
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Надо заполнить массив числами.");
        int a;
        for (int i=0;i<n;i++) {
            System.out.print("Введите элемент массива: ");
            a = scanner.nextInt();
            arr[i] = a;
        }
        return arr;
    }

    //доп метод для вывода массива
    public void printArr(int[] arr) {
        System.out.print("Массив: [ ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }

    // 4.2 задание
    public int findLast(int[] arr, int x) {
        printArr(arr);
        for (int i= arr.length-1;i>=0;i--) {
            if (x==arr[i]) {
                return i;
            }
        }
        return -1;
    }

     //4.4 задание
    public int[]add(int[] arr, int x, int pos) {
        int[] arr1 = new int[arr.length+1];
        for (int i=0;i<pos;i++) { //идём до позиции
            arr1[i] = arr[i];
        }
        arr1[pos] = x; //вставляем новый символ на позицию
        for (int i=pos;i < arr.length;i++) { //идём дальше, не забывая символ, который был до этого
            arr1[i+1]=arr[i]; // в изначальном массиве
        }
        return arr1;
    }

    // 4.6 задание
    public void reverse(int[] arr) {
        int a,b;
        int step=1;//отступ от конца массива
        for(int i=0;i<(arr.length/2); i++) {
            a = arr[i];
            b = arr.length-step; //индекс изменяемого символа
            arr[i] = arr[b];
            arr[b] = a;
            step++;
        }
    }

    // 4.8 задание
    public int[] concat(int[] arr1,int[] arr2) {
        int len = arr1.length+arr2.length;
        int l1 = arr1.length;
        int[] arrNew = new int[len];
        for (int i = 0;i<l1;i++) { // заполняем значениями 1 массива
            arrNew[i] = arr1[i];
        }
        for (int i = len-1;i>=arr1.length;i--) { // заполняем значениями 2 массива
            arrNew[i] = arr2[i-l1];
        }
        return arrNew;
    }

    //4.10 задание
    public int[] deleteNegative(int[] arr) {
        int k = 0; // кол-во отриц. чисел в массиве
        for (int j=0;j<arr.length;j++) {
            if (arr[j] < 0) {
                k++;
            }
        }
        if (k==0) {
            return arr;
        } else {
            int len = arr.length - k; // размер нового массива без отриц. чисел
            if (len == 0) { // если весь массив был из отриц. чисел
                return new int[0];
            } else {
                int[] newArr = new int[len];
                int j = 0; // индексы заполнения нового массива
                for (int i=0;i<arr.length;i++) {
                    if (arr[i]>=0) {
                        newArr[j] = arr[i];
                        j++;
                    }
                }
                return newArr;
            }
        }
    }
}
