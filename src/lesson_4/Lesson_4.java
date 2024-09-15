package lesson_4;
import java.io.*;
import java.util.*;

public class Lesson_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        String n = reader.readLine();
        int x = Integer.parseInt(m);
        int y = Integer.parseInt(n);
        for ( int i = 1;i<y;i++)
            System.out.print("8");
        for ( int a = 0;a<x;a++)
            System.out.println("8");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите два числа:");
//
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//
//        for (int i = 0; i == n ; i++)
//        {
//            n = n + 1;
//            System.out.println("8");
//        }




    }
}
