import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int a;
        int b;
        int c;
        char s; // знак операции

        Scanner kb = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        a = kb.nextInt();
        System.out.print("Введите операцию: ");
        s = kb.next().charAt(0);
        System.out.print("Введите 2 число: ");
        b = kb.nextInt();
        if (s == '+') {
           c=a+b;
        }
        else if (s == '-') {
            c=a-b;
        }
        else if (s == '*')  {
            c=a*b;
        }
        else if (s == '/')  {
            c=a/b;
        }
        else  {
            c= Integer.MIN_VALUE;
            System.out.println("Вы ошиблись с оператором");
        }
        System.out.printf("%d %c %d = %d", a, s, b, c);
        */
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String expression = kb.nextLine();

        String[] numbers= expression.split("[\\+\\-\\*\\/]");
        System.out.println("Expression:" + expression);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c;

        if (expression.indexOf('+') >0 ) {
            c=a+b;
            System.out.printf("%d + %d = %d", a,  b, c);
       }
        else if (expression.indexOf('-') >0 ) {
            c=a-b;
            System.out.printf("%d - %d = %d", a,  b, c);
          }
        else if (expression.indexOf('*') >0 )  {
            c=a*b;
            System.out.printf("%d * %d = %d", a,  b, c);
        }
          else if (expression.indexOf('/') >0 )  {
             c=a/b;
            System.out.printf("%d / %d = %d", a,  b, c);
         }
        else  {
            c= Integer.MIN_VALUE;
            System.out.println("Вы ошиблись с оператором");
        }
    }
}