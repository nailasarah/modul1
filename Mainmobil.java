package modul1;

import java.util.Scanner;

public class Mainmobil {
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in);

        //instan objek bernama m1 
        Mobil m1 = new Mobil(); 

        System.out.println("=== Input Data Mobil 1 ===");
        System.out.println("Masukkan kecepatan mobil 1 (km/jam): ");
        m1.setKecepatan(scn.nextInt());
        scn.nextLine();             // membersihkan newline

        System.out.println("Masukkan manufaktur mobil 1: ");
        m1.setManufaktur(scn.nextLine());

        System.out.println("Masukkan nomor plat mobil 1: ");
        m1.setNoPlat(scn.nextLine());

        System.out.println("Masukkan warna mobil 1: ");
        m1.setWarna(scn.nextLine());

        System.out.println("Masukkan waktu yang ditempuh (jam): ");
        m1.setWaktu(scn.nextDouble());

        m1.displayMessage(); 
        System.out.println("================"); 

        //instan objek baru bernama m2 
        Mobil m2 = new Mobil();
        
        System.out.println("=== Input Data Mobil 2 ===");
        System.out.println("Masukkan kecepatan mobil 2 (km/jam): ");
        m2.setKecepatan(scn.nextInt());
        scn.nextLine(); 

        System.out.println("Masukkan manufaktur mobil 2: ");
        m2.setManufaktur(scn.nextLine());

        System.out.println("Masukkan nomor plat mobil 2: ");
        m2.setNoPlat(scn.nextLine());

        System.out.println("Masukkan warna mobil 2: ");
        m2.setWarna(scn.nextLine());

        System.out.println("Masukkan waktu yang ditempuh (jam): ");
        m2.setWaktu(scn.nextDouble());

        m2.displayMessage(); 
        System.out.println("================"); 

        //merubah warna dari objek m1 
        System.out.println("Masukkan warna baru untuk mobil pada objek m1: "); 
        String newWarna = scn.nextLine();
        m1.setWarna(newWarna);

        //menampilkan hasil perubahan 
        m1.displayMessage(); 

        scn.close();
    } 
}