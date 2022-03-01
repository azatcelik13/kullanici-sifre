package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz=");
        String userName = in.nextLine();
        System.out.print("Kullanıcı şifrenizi giriniz=");
        String Pasword = in.nextLine();

        if (userName.equals("azatcelik13") && Pasword.equals("123456")) {
            System.out.println("Giriş yaptınız");

        } else {
            System.out.println("yanlış şifre girdiniz şifre değiştirmek istermisiniz= \n1-Evet \n 2-Hayır");
            int secim = in.nextInt();
            switch (secim) {
                case 1:

                    System.out.println("lütfen yeni şifreyi giriniz" + in.nextLine());
                    String yenisifre = in.nextLine();
                    if (yenisifre.equals("123456")) {
                        System.out.println("Eski şifre ile aynı olamaz");

                    } else {
                        System.out.println("afferin yanlış şifre girme bi daha");
                    }
                    break;
                case 2:
                    System.out.println("demek şifreyi hatırlayacan hadi bakalım");
                    break;
            }


        }
    }}
