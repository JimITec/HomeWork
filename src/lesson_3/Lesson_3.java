package lesson_3;

import java.util.Scanner;


public class Lesson_3 {
    public static void main(String[] args) {


//        8
//        Работа светофора для пешеходов запрограммирована следующим образом:
//        в начале каждого часа в течение трех минут горит зелёный сигнал,
//                затем в течение одной минуты - жёлтый,
//                а потом в течение одной минуты - красный,
//                затем опять зелёный горит три минуты и т. д.
//                Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//        Определить, сигнал какого цвета горит для пешеходов в этот момент.
//        Результат вывести на экран в следующем виде:
//        "зелёный" - если горит зелёный цвет,
//                "жёлтый" - если горит жёлтый цвет,
//                "красный" - если горит красный цвет.
//
//                Пример для числа 2.5:
//        зелёный
//
//        Пример для числа 3:
//        жёлтый
//
//        Пример для числа 4:
//        красный
//
//        Пример для числа 5:
//        зелёный
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Напишите число");
//
//        float t = scanner.nextInt();
//
//        float time = t % 5;
//
//        if (time < 3){
//            System.out.println("зелёный");
//        } else if ( time == 3) {
//            System.out.println("жёлтый");
//        } else if (time == 4) {
//            System.out.println("красный");
//        }










//        7
//        Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
//        Определить возможность существования треугольника по сторонам.
//        Результат вывести на экран в следующем виде:
//        "Треугольник существует." - если треугольник с такими сторонами существует.
//                "Треугольник не существует." - если треугольник с такими сторонами не существует.
//
//        Подсказка:
//        Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
//        Требуется сравнить каждую сторону с суммой двух других.
//        Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
//        то треугольника с такими сторонами не существует.

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите стороны треугольника");
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if ((a + b > c) && (b + c > a) && (c + a > b)) {
//            System.out.println("Треугольник с такими сторонами существует");
//        } else {
//            System.out.println("Треугольник с такими сторонами не существует");
//        }




//        6
//        Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
//                , будет определять количество дней в году. Результат вывести на экран в следующем виде:
//        количество дней в этом году: x
//                , где
//        х - 366 для високосного года,
//                х - 365 для обычного года.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите год");
//
//        int x = scanner.nextInt();
//
//        if ((x % 400 == 0) || (x % 4 == 0) && (x % 100 !=0)) {
//            System.out.println(x + " - В этом году 366 дней: Год Высокосный");
//        } else {
//            System.out.println(x + " - В это году 365 дней: Год не Высокосный");
//        }




//        4
//        Написать программу, которая будет проверять число, которое мы подадим ей.
//                Если число положительное, то увеличить его в два раза.
//                Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат в консоль.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//
//        int a = scanner.nextInt();
//
//        if (a >= 1) {
//            System.out.println(a * 2);
//        } else if (a == 0) {
//            System.out.println(0);
//        } else if (a <= -1) {
//            System.out.println(a + 1);
//        }




//    System system = new System(System.in)


        //boolean isIwillgotowalk;
//
//        int temperature = 25;
//        boolean isweekend = true;
//
//        isIwillgotowalk = isweekend && temperature >= 25;
//
//        System.out.println(isIwillgotowalk);
//
//        boolean isIwillgotowalk1;
//
//        int temperature1 = 23;
//        boolean isweekend1 = true;
//
//        isIwillgotowalk1 = isweekend1 && temperature1 >= 25;
//
//        if (isIwillgotowalk1) {
//            System.out.println("Я пойду гулять!");
//        } else {
//            System.out.println("I will not go!");
//        }
//
//
//
//
//        boolean isIwillgotowalk2;
//
//        int temperature2 = 25;
//        boolean isweekend2 = false;
//
//        isIwillgotowalk2 = isweekend2 || temperature2 >= 25;
//
//        System.out.println(isIwillgotowalk2);
//
//
//
//        boolean c = 250 > 1000;
//
//        System.out.println(!c);

//        1 Написать программу, чтобы она:
//        - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
//                - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
//                - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
//        int number = 3;
//
//        if (number == 5) {
//            System.out.println("Число равно 5");
//        } else if (number > 5) {
//            System.out.println("Число больше 5");
//        } else {
//            System.out.println("Число меньше 5");
//        }

//        2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
//        в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//        "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
//                Пример для числа 112:
//        Число 112 не содержится в интервале.
//                Пример для числа 60:
//        Число 60 содержится в интервале.
//        int a = 60;
//
//        if (a > 50 && a < 100) {
//            System.out.println("Число содержится в интервале");
//        } else {
//            System.out.println("Число не содержится в нитервале");
//        }

//        3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
//
//        Пример для номера месяца 2:
//        зима
//
//        Пример для номера месяца 5:
//        весна
//        int month = 1;
//
//        switch (month) {
//            case (1) :
//                System.out.println("Зима");
//                break;
//            case (2) :
//                System.out.println("Зима");
//                break;
//            case (3) :
//                System.out.println("Весна");
//                break;
//            case (4) :
//                System.out.println("Весна");
//                break;
//            case (5) :
//                System.out.println("Весна");
//                break;
//            case (6) :
//                System.out.println("Лето");
//                break;
//            case (7) :
//                System.out.println("Лето");
//                break;
//            case (8) :
//                System.out.println("Лето");
//                break;
//            case (9) :
//                System.out.println("Осень");
//                break;
//            case (10) :
//                System.out.println("Осень");
//                break;
//            case (11) :
//                System.out.println("Осень");
//                break;
//            case (12) :
//                System.out.println("Зима");
//                break;
//            default:
//                System.out.println("Такого месяца не существует!");
//                break;
//        }
//          Scanner scanner = new Scanner(System.in);
//          System.out.println("Введите номер месяца:");
//
//          int month = scanner.nextInt();
//          if (month == 1 ||  month == 2 || month == 12) {
//            System.out.println("Зима");
//          } else if (month == 3 || month == 4 || month == 5) {
//            System.out.println("Весна");
//          } else if (month == 6 || month == 7 || month == 8) {
//            System.out.println("Лето");
//          } else if (month == 9 || month == 10 || month == 11) {
//            System.out.println("Осень");
//          } else {
//            System.out.println("Такого месяца нет");
//         }


    }
}
