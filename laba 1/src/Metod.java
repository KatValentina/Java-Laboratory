public class Metod {

    public int sumLastNums (int x){ //1.2 задание
        int c = x%100;
        return c % 10 + c / 10;
    }
    public boolean isPositive (int x){ //1.4 задание спросить на счёт проверки на целое число!!!
        return x > 0; // заменяет конструкцию  if (x > 0) else
    }

    public boolean isUpperCase (char x){ //1.6 задание
        return 'A'<=x && x<='Z';
    }

    public boolean isDivisor (int a, int b){ // 1.8 задание
        if(a!=0 && b!=0){
            return a%b==0 || b%a==0;
        }else if (a==0 && b==0){
            return false;
        }else{
            return true;
        }
    }

    public int lastNumSum(int a, int b){ //1.10 задание
        if (a<0){
            a=a*(-1)%10;
        }else{
            a=a%10;
        }
        if (b<0){
            b=b*(-1)%10;
        }else{
            b=b%10;
        }
        return a+b;
    }
}
