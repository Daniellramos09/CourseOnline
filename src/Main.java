


import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.print("How many student for course A?");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            int A = sc.nextInt();
            a.add(A);

        }

        System.out.print("How many student for course A?");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            int B = sc.nextInt();
            b.add(B);

        }

        System.out.print("How many student for course A?");
        int n3 = sc.nextInt();

        for (int i = 0; i < n3; i++) {
            int C = sc.nextInt();
            c.add(C);

        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());


    }
}