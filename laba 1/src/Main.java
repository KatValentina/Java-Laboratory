import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int number;
        System.out.print("Номер задания: ");
        Scanner scanner = new Scanner(System.in);
        number= scanner.nextInt();
        switch(number){
            case 1:
            {
                int num;
                System.out.print("Номер подзадания: ");
                num= scanner.nextInt();
                switch(num){
                    case 2:{
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        if(x>=10){
                            Metod t = new Metod();
                            int sum;
                            sum = t.sumLastNums (x);
                            System.out.print("Сумма двух последних цифр числа x: "+sum);
                        }
                        else{
                            System.out.println("Число x должно быть не менее 10");
                        }
                        break;
                    }
                    case 4:{
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        Metod t = new Metod();
                        boolean answer;
                        answer = t.isPositive (x);
                        System.out.println("Если вы ввели 0, то выведет false. " +
                                "Т.к число 0 не является ни положительным, ни отрицательным.");
                        System.out.println(answer);
                        break;
                    }
                    case 6: {
                        char x;
                        scanner.nextLine();// "очищаем буфер", т.к при прошлом вызове scanner.nextInt() был перенос строки
                        System.out.print("Введите символ x: ");
                        x = scanner.nextLine().charAt(0); // считываем строку и считываем 1 символ
                        Metod t = new Metod();
                        boolean answer;
                        answer = t.isUpperCase (x);
                        System.out.println("Если вы ввели маленькую букву или другой символ, " +
                                "то на экран будет выведено false.");
                        System.out.println(answer);
                        break;
                    }
                    case 8:{
                        int a,b;
                        System.out.print("Введите число a: ");
                        a = scanner.nextInt();
                        System.out.print("Введите число b: ");
                        b = scanner.nextInt();
                        Metod t = new Metod();
                        boolean answer;
                        answer = t.isDivisor(a,b);
                        System.out.println("Если одно из чисел равняется 0, то при делении другого числа " +
                                "на 0 получается 0 => целое число. Тоесть true. Если же оба числа равны" +
                                " 0, то деление не возможно, поэтому false.");
                        System.out.println(answer);
                        break;
                    }
                    case 10:{
                        int a,b;
                        System.out.print("Введите число a: ");
                        a = scanner.nextInt();
                        System.out.print("Введите число b: ");
                        b = scanner.nextInt();
                        Metod t = new Metod();
                        a=t.lastNumSum(a,b);
                        for(int i=0;i<3;i++){
                            System.out.println("Число а(сумма последних цифр 2 чисел): "+a);
                            System.out.print("Введите число b: ");
                            b = scanner.nextInt();
                            a=t.lastNumSum(a,b);
                        }
                        System.out.println("Полученная сумма последних цифр: "+a);
                        break;
                    }
                    default: System.out.println("Нет такого подзадания"); break;
                }
            }
            case 2:
            {
                break;
            }
            case 3:
            {

                break;
            }
            case 4:
            {
                break;
            }
            default: System.out.println("Нет такого задания"); break;
        }
    }
}