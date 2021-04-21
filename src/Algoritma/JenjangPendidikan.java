package Algoritma;

import java.util.Scanner;

public class JenjangPendidikan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nim : ");
        String n = scanner.next();

        String nim = n;
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjang());
    }
}
