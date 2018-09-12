package latihankasir;

import java.util.Scanner;

public class LatihanKasir {

    public static void main(String[] args) {

        String namaPembeli, namaBarang, namaKasir;
        int jumlahBarang, j, c, kodeBarang;
        int hargaBarang, totalHarga, totalBayar, hargaJadi;
        Scanner scan = new Scanner(System.in);
        do {

            System.out.println("------------SELAMAT DATANG------------");
            System.out.println("---DI TOKO ALAT TULIS SUMBER MAKMUR---");
            System.out.println(" ");
            System.out.print("Nama Kasir         =  ");
            namaKasir = scan.next();
            System.out.print("Nama Pembeli       =  ");
            namaPembeli = scan.next();
            System.out.print("Nama Barang        =  ");
            namaBarang = scan.next();
            System.out.print("Kode Barang        =  ");
            kodeBarang = scan.nextInt();
            System.out.print("Jumlah Barang      = ");
            jumlahBarang = scan.nextInt();
            System.out.print("Harga Satu Barang  = Rp ");
            hargaBarang = scan.nextInt();
            totalHarga = jumlahBarang * hargaBarang;
            System.out.println("Total harga sementara = Rp " + totalHarga);
            System.out.println("------------------------------------------------ ");
            System.out.println("Ketik 1 jika pembelian lebih dari Rp 100000 ");
            System.out.println("Ketik 2 jika pembelian lebih dari Rp 200000 ");
            System.out.println("Ketik 3 jika pembelian lebih dari Rp 500000 ");
            System.out.println("Ketik 4 jika tidak ada syarat yang terpenuhi");
            System.out.print("Pilihan =  ");
            j = scan.nextInt();

            if (j == 1) {
                totalBayar = totalHarga - ((totalHarga * 10) / 100);
                System.out.println("------------------------------------------");
                System.out.println(" ,Harga setelah diskon = Rp " + totalBayar);
            }

            if (j == 2) {
                totalBayar = totalHarga - ((totalHarga * 20) / 100);
                System.out.println("------------------------------------------- ");
                System.out.println(" ,Harga setelah diskon = Rp " + totalBayar);
            }

            if (j == 3) {
                totalBayar = totalHarga - ((totalHarga * 50) / 100);
                System.out.println("-------------------------------- ");
                System.out.println(" ,Harga setelah diskon = Rp " + totalBayar);
            }
            if (j == 4) {
                System.out.println("---------------------------------");
                System.out.println(" ,Harga tetap = Rp " + totalHarga);
            }

            System.out.println("--------------------------------- ");
            System.out.println("--------------------------------- ");
            System.out.println("Apakah ingin mengulang lagi ? ");
            System.out.println("Jika YA ketik 1 , jika TIDAK ketik 2");
            c = scan.nextInt();
        } while (c == 1);
        System.out.println("----------------TERIMA KASIH--------------- ");
    }

}
