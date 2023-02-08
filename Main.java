import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tas;
        String kagıt;
        String makas;
        int randomNumber;
        String oyun;
        int t = 6;
        do {
        Random random = new Random();
        randomNumber = random.nextInt(3) + 1;
        System.out.println(randomNumber);
        System.out.println("---------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("LÜTFEN BİRİNİ SECİNİZ...1 = TAS, 2 = KAGIT, 3 = MAKAS...");
        int A = sc.nextInt();
            if (randomNumber == 1) {
                if (A == 1) {
                    System.out.println("Berabere");
                } else if (A == 2) {
                    System.out.println("Kazandın kardeşş");
                } else if (A == 3) {
                    System.out.println("Kaybettin kardeşş");
                }
            } else if (randomNumber == 2) {
                if (A == 2) {
                    System.out.println("Berabere");
                }
                if (A == 3) {
                    System.out.println("kazandın kardeşş");
                }
                if (A == 1) {
                    System.out.println("Kaybettin kardeşş");
                }
            } else if (randomNumber == 3) {
                if (A == 3) {
                    System.out.println("Berabere");
                }
                if (A == 1) {
                    System.out.println("Kazandın kardeşş");
                }
                if (A == 2) {
                    System.out.println("Kaybettim kardeşş");
                }
            }


        }while (t==6);
    }
}

