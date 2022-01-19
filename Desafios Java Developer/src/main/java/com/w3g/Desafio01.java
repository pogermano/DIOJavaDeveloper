package com.w3g;

import java.util.Scanner;

public class Desafio01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double graos;

        for(int i=0 ; i<n ; i++) {
            long x = sc.nextInt();
            graos = 1D/1000D;
            for(long j=0 ; j<x ; j++){
                graos = graos*2;
            }
           long g = (long) graos;
            System.out.println(  (g/12)+" kg"               );   //Complete o código aqui.
        }
        sc.close();
    }
}


