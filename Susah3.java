package UKL;

import java.util.Scanner;

public class Susah3 {

    public static void main(String[] args) {
        int[] array;

        System.out.println("---Elemen duplikat dan frekuensinya---");
        Scanner c = new Scanner(System.in);
        System.out.println("Masukkan panjang array: ");
        int panjang = c.nextInt();
        array = new int[panjang];
        for (int j = 0; j < array.length; j++) {
            System.out.println("Masukkan elemen ke-" + (j + 1) + ": ");
            array[j] = c.nextInt();
        }

        cekDuplikatDanFrekuensi(array);
    }

    public static void cekDuplikatDanFrekuensi(int[] array) {
        int frekMax = 0;
        int indks = 0;
        System.out.println("Elemen duplikat dan frekuensinya:");
        boolean adaDuplikat = false;

        for (int i = 0; i < array.length; i++) {
            int frekuensi = 0;
            boolean sudahDihitung = false;
        

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frekuensi++;
                }
            }

            if (frekuensi > frekMax) {
                frekMax = frekuensi;
                indks = i;
                adaDuplikat = true;
            }

        }

        if (adaDuplikat) {
            System.out.println("Elemen yang paling sering muncul adalah " + array[indks] + " sebanyak " + frekMax + " kali");
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen duplikat");
        }
    }
}