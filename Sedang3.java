package UKL;

import java.util.Random;
import java.util.Scanner;

public class Sedang3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Random r = new Random();
        boolean lanjut = true;
        int hasil = 0;

        System.out.println("----Kuis Matematika----");
        while (lanjut) {
            int bil1 = r.nextInt(100) + 1; //Bil pertama 
            int bil2 = r.nextInt(99) + 1; //Bil kedua 
            int operators = r.nextInt(3) + 1; 
            String operator = "";

            switch (operators) {
                case 1:
                    operator = "*";
                    hasil = bil1 * bil2;
                    break;            
                case 2:
                    operator = "/";
                    hasil = bil1 / bil2;
                    break;            
                case 3:
                    operator = "%";
                    hasil = bil1 % bil2;
                    break;            
                default:
                    break;
            }
            System.out.println("Soal : " + bil1 + " " + operator + " " + bil2 + " = ?");
            System.out.println("Masukkan Jawaban: ");
            int userAnswer = c.nextInt();
            
            if (userAnswer == hasil) {
                System.out.println("Jawaban Benar");
            } else {
                System.out.println(" Jawaban Salah. Jawaban benar adalah" + hasil);
            }
            lanjut = false;
            
            System.out.println("Apakah ingin melanjutkan quiz? (y/n) ");
            String respon = c.next();
            if (respon.equalsIgnoreCase("y")) {
                lanjut = true;
            }
        }
        System.out.println("----Terimakasih----");
        c.close();
    }
}
