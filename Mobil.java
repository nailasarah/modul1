package modul1;

public class Mobil {
    private String noPlat; 
    private String warna; 
    private String manufaktur; 
    private double kecepatan; 
    private double waktu; 
    private double waktuSecond; 
    private double lamaKecepatan; 

    public void setNoPlat(String s) { 
        noPlat = s; 
    } 

    public void setWarna(String s) { 
        warna = s; 
    } 

    public void setManufaktur(String s) { 
        manufaktur = s; 
    } 

    public void setKecepatan(double i) {
        kecepatan = i; 
        rubahKecepatan(i); // Mengubah kecepatan dari km/h ke m/s
    }

    private void rubahKecepatan(double kmh) {
        lamaKecepatan = kmh * (1000.0 / 3600.0); // Mengubah km/h ke m/s
    }

    public void setWaktu(double w) {
        waktu = w; 
        rubahSecond(w); // Mengubah waktu dari jam ke detik
    }

    private void rubahSecond(double jam) {
        waktuSecond = jam * 3600; // 1 jam = 3600 detik
    }

    public double hitungJarak() {
        return lamaKecepatan * waktuSecond; // Jarak = kecepatan (m/s) * waktu (detik)
    }

    public void displayMessage() { 
        System.out.println("Mobil anda adalah bermerek " + manufaktur); 
        System.out.println("Mempunyai nomor plat " + noPlat); 
        System.out.println("Serta memiliki warna " + warna); 
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam"); 
        System.out.println("Dan mampu menempuh kecepatan tersebut dengan waktu " + waktu + " jam");
        System.out.println("Dan Waktu dalam sekonnya " + waktuSecond + " detik");
        System.out.println("Jarak yang dapat ditempuh adalah " + (hitungJarak() / 1000) + " km"); // Mengubah m ke km
    } 
}