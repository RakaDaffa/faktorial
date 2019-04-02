package com.company;

import java.util.Scanner;

public class Main {

    static void reverseFibonacci(int n)
    {
        int a[] = new int[n];

        // assigning first and second elements
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; i++)
        {

            // storing sum in the
            // preceding location
            a[i] = a[i - 2] + a[i - 1];
        }

        for (int i = n - 1; i >= 0; i--)
        {

            // printing array in
            // reverse order
            System.out.print(a[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int count = in.nextInt();
        reverseFibonacci(count);
    }
}
