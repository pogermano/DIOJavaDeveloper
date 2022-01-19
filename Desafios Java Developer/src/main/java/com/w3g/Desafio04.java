package com.w3g;

import java.io.IOException;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) throws IOException {
        String evenOdd = null, posNegNull = null, stPrnt = null;
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
            int x = leitor.nextInt();

                if (x != 0) {
                    posNegNull = (x > 0) ? "POSITIVE" : "NEGATIVE";
                    evenOdd = (x % 2 == 0) ? "EVEN" : "ODD";
                } else {
                    posNegNull = "NULL";
                }
                stPrnt = (posNegNull == "NULL") ? posNegNull : evenOdd + " "+ posNegNull;

            System.out.println(stPrnt);

        }
        leitor.close();
    }

}

/*
* import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		//complete sua solução aqui.
    	}
	}

}
* */