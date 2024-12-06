package UKL;

import java.util.Scanner;

public class Mudah2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("---Bilangan Prima---");
        System.out.println("Masukkan bilangan: ");
        int bilangan = c.nextInt();
        boolean prima = false;
        if (bilangan <= 1) {
            prima = false;  
        }

        for (int i = 2; i < bilangan ; i++) {
            if (bilangan % i == 0) {
                prima = false;
            } else {
                prima = true;
            }
        }

    

        if (prima) {
            System.out.println( bilangan + " adalah bilangan prima");
        } else {
            System.out.println( bilangan + " bukan bilangan prima");
        }
        c.close();
    }
}

