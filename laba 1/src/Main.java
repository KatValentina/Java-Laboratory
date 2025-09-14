import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number;
        System.out.print("Номер задания: ");
        Scanner scanner = new Scanner(System.in);
        number= scanner.nextInt();
        switch (number) {
            case 1: {
                int num;
                System.out.print("Номер подзадания: ");
                num= scanner.nextInt();
                switch (num){
                    case 2: {
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        if (x>=10) {
                            Metod t = new Metod();
                            int sum;
                            sum = t.sumLastNums (x);
                            System.out.print("Сумма двух последних цифр числа x: "+sum);
                        } else {
                            System.out.println("Число x должно быть не менее 10");
                        }
                        break;
                    }
                    case 4: {
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
                        System.out.print("Введите символ x: ");
                        x = scanner.next().charAt(0);
                        Metod t = new Metod();
                        boolean answer;
                        answer = t.isUpperCase (x);
                        System.out.println("Если вы ввели маленькую букву или другой символ, " +
                                "то на экран будет выведено false.");
                        System.out.println(answer);
                        break;
                    }
                    case 8: {
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
                    case 10: {
                        int a,b;
                        System.out.print("Введите число a: ");
                        a = scanner.nextInt();
                        System.out.print("Введите число b: ");
                        b = scanner.nextInt();
                        Metod t = new Metod();
                        a=t.lastNumSum(a,b);
                        for (int i=0;i<3;i++) {
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
            case 2: {
                int num;
                System.out.print("Номер подзадания: ");
                num= scanner.nextInt();
                switch (num) {
                    case 2: {
                        int x,y;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        y = scanner.nextInt();
                        Metod t = new Metod();
                        double answer;
                        answer = t.safeDiv(x,y);
                        System.out.println("Результат деления x на y: "+answer);
                        break;
                    }
                    case 4: {
                        int x,y;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        y = scanner.nextInt();
                        Metod t = new Metod();
                        String answer;
                        answer = t.makeDecision(x,y);
                        System.out.println("Результат сравнения x и y: "+answer);
                        break;
                    }
                    case 6: {
                        int x,y,z;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        y = scanner.nextInt();
                        System.out.print("Введите число z: ");
                        z = scanner.nextInt();
                        Metod t = new Metod();
                        boolean answer;
                        answer = t.sum3(x,y,z);
                        System.out.println("Можно ли два любых числа из трех принятых сложить так, \n"+
                                        "чтобы получить третье? : "+answer);
                        break;
                    }
                    case 8: {
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        if (x<=0) {
                            System.out.println("Нет отрицательного и равного 0 кол-ва лет");
                        } else {
                            Metod t = new Metod();
                            String answer;
                            answer = t.age(x);
                            System.out.println(answer);
                        }
                        break;
                    }
                    case 10: {
                        String weekday;
                        System.out.print("Введите день недели с маленькой буквы, " +
                                "иначе он не будет считан: ");
                        weekday = scanner.next(); // использывала только next(), т.к он дожидается ввода кокого-либо
                        Metod t = new Metod(); // символа, а также не считывает остальные символы после пробела
                        System.out.println("Дни недели: ");
                        t.printDays(weekday);
                        break;
                    }
                    default: System.out.println("Нет такого подзадания"); break;
                }
                break;
            }
            case 3: {
                int num;
                System.out.print("Номер подзадания: ");
                num = scanner.nextInt();
                switch (num) {
                    case 2: {
                        int x;
                        System.out.print("Введите число: ");
                        x = scanner.nextInt();
                        if (x<0) {
                            System.out.print("Неправильный ввод!");
                        } else {
                            Metod t = new Metod();
                            String answer = t.reverseListNums(x);
                            System.out.print("Обратный отсчёт: "+answer);
                        }
                        break;
                    }
                    case 4: {
                        int x,y;
                        System.out.print("Введите число х: ");
                        x = scanner.nextInt();
                        System.out.print("Введите степень числа x (только положительную): ");
                        y = scanner.nextInt();
                        if (y<0) {
                            System.out.println("Неверные данные");
                        } else {
                            int answer;
                            Metod t = new Metod();
                            answer = t.pow(x,y);
                            System.out.print("Число "+x+" в степени "+y+" равно: "+answer);
                        }
                        break;
                    }
                    case 6: {
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        boolean answer;
                        Metod t = new Metod();
                        answer = t.equalNum(x);
                        System.out.print("Все знаки числа одинаковы? "+answer);
                        break;
                    }
                    case 8: {
                        int x;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        if (x <= 0) {
                            System.out.println("Неверные данные");
                        } else {
                            Metod t = new Metod();
                            t.leftTriangle(x);
                        }
                        break;
                    }
                    case 10: {
                        Metod t = new Metod();
                        t.guessGame();
                        break;
                    }
                }
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