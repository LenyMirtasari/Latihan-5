/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutamu1;

import java.util.Scanner;

public class mainbukutamu1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuTamu1[] BT;
        System.out.print("Jumlah Nama Yang Akan Ditambah  : ");
        int jumlah = in.nextInt();
        BT = new BukuTamu1[jumlah];
        for (int x = 0; x < BT.length; x++) {
            System.out.println("");
            System.out.println("Anda termasuk kelas " + BukuTamu1.kelastamu);
            System.out.print("Masukkan  Nama  : ");
            String nama = in.next();
            System.out.print("Masukkan Alamat : ");
            String alamat = in.next();
            System.out.print("Masukkan Telepon: ");
            String notel = in.next();
            System.out.print("Masukkan E-Mail : ");
            String email = in.next();
            System.out.println("");
            BukuTamu1 Buku = new BukuTamu1(nama, alamat, notel, email);
            Buku.Display();
            System.out.println("jumlah tamu " + BukuTamu1.jmlhtamu());
        }
    }
}
