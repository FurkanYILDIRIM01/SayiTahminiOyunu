package Day02;

import java.util.Scanner;

public class ArrayOrnek {

    public void randomsayi(){
        double numb1 = Math.random() * 10;
        int number = (int)numb1;
        int hak = 3;
        System.out.println("makine üretti: " + number);

                while(hak>0) {
                    Scanner key = new Scanner(System.in);
                    System.out.println("bir sayı gir: ");
                    int girilensayi = key.nextInt();

                    if (girilensayi == number) {
                        System.out.println("tebrikler");
                        break;
                    } else {
                        if (girilensayi > number) {
                            System.out.println("daha küçük sayı gir");
                        } else {
                            System.out.println("lütfen daha büyük sayı gir");
                        }
                        hak--;
                        System.out.println("kalan hakkınız: " + hak);
                    }

                }
                if (hak==0){
                    System.out.println("doğru sayı: " + number);
                }

    }
}





