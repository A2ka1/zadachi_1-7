import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
/*public class Taylor {
    public static int factorial(int number) {
        int result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}*/

public class Main {
        public static void main(String[] args) {
        // Задание 1
        //System.out.println("Hello world!");

        //Задание 2
        /*Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double m, M, sum;
        sum = a + b + c;
        System.out.println(a * b * c);
        System.out.println((sum) / 3);
        if (a > b){
            if (a > c) {
                M = a;
            }
            else{
               M = c;
            }
        }
        else{
            if (b > c){
                M = b;
            }
            else{
                M = c;
            }
        }
        if (a < b){
            if (a < c){
                m = a;
            }
            else{
                m = c;
            }
        }
        else{
            if (b < c){
                m = b;
            }
            else{
                m = c;
            }
        }
        System.out.println(m + " " + (sum - m - M) + " " + M);*/

        //задание 3
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int m, M, sum;
        double cred;
        sum = a + b + c;
        cred = sum / 3.;
        System.out.println(a * b * c);
        System.out.println(cred);
        if (a > b){
            if (a > c) {
                M = a;
            }
            else{
                M = c;
            }
        }
        else{
            if (b > c){
                M = b;
            }
            else{
                M = c;
            }
        }
        if (a < b){
            if (a < c){
                m = a;
            }
            else{
                m = c;
            }
        }
        else{
            if (b < c){
                m = b;
            }
            else{
                m = c;
            }
        }
        System.out.println(m + " " + (sum - m - M) + " " + M);*/

        //задание 4
       /* Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double x1 = 0, x2 = 0, D;
        int kol;

        if (a != 0){
            D = b * b - 4 * a * c;
            if (D > 0){
                x1 = ((-b - sqrt(D)) / 2 / a);
                x2 = ((-b + sqrt(D)) / 2 / a);
                System.out.println("kol: 2");
                System.out.println("x1:" + x1 + " x2:" + x2);
            }
            else if (D == 0){
                if (b == 0){
                    x1 = 0;
                    System.out.println("kol: 1");
                    System.out.println("x:" + x1);
                }
                else {
                    x1 = -b / 2 / a;
                    System.out.println("kol: 1 ");
                    System.out.println("x:" + x1);
                }
            }
            else {
                System.out.println("kol: 0");
                System.out.println("нет решения");
            }
        }
        else{
            if(a == 0 && b == 0 && c == 0){
                System.out.println("x - любое");
            }
            else if(b == 0){
                System.out.println("нет корней");
            }
            else if(c == 0) {
                System.out.println("kol: 1");
                System.out.println("x: 0");
            }
            else {
                x1 = -c / b;
                System.out.println("kol: 1");
                System.out.println("x: " + x1);
            }
        }*/

        //задание 5
        /*Scanner sc = new Scanner(System.in);
        double left = sc.nextDouble();
        double right = sc.nextDouble();
        double step = sc.nextDouble();
        for (double arg = left; arg <= right; arg += step) {
            System.out.println("sin(" + arg + ") = " + Math.sin(arg));
        }*/

        //задание 6
        /*System.out.println("ax + by = m");
        System.out.println("cx + dy = n");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double m = in.nextDouble();
        double n = in.nextDouble();
        double x = 0;
        double y = 0;
        if (a == 0 && b == 0 || c == 0 && d == 0 || a * d == c * b) {
            System.out.println("нет решения");
        }
        else if (m == 0 && n == 0){
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        else if (a == 0){
            y = m / b;
            x = (n * b - d * m)/(c * b);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        else if (b == 0){
            x = m / a;
            y = (a * n - c * m)/(a * d);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        else if (c == 0){
            y = n / d;
            x = (d * m - b * n) / (a * d);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        else if (d == 0){
            x = n / c;
            y = (c * m - a * n) / (c * b);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        else if (a != 0 && a*d != c*b){
            y = (n * a - c * m) / (a * d - c * b);
            x = (m - b * y) / a;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }*/

        //задание 7
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double precision = sc.nextDouble();
        double term = 1;
        double result = term;
        int n = 1;
        while (Math.abs(term) >= precision) {
            term *= a/n;
            result += term;
            n++;
        }
        System.out.println(result);
        System.out.println(Math.E);
    }

}