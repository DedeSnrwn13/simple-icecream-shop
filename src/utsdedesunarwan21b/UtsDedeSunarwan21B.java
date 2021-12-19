/* PENAMBAHAN KODE
 *
 * Pesan Berapa Eskrim / Porsi dan perkalian jumlah harga
 * Penambahan opsi jika tidak mau pakai topping di Eskrimnya
 * Potongan harga 
 * Uang dari User dikurangi total harga yang harus dibayar
 * Penambahan variable
 * Penambahan perulangan do while
 */
package utsdedesunarwan21b;
import java.util.Scanner;

/**
 *
 * @author Dede Sunarwan
 */
public class UtsDedeSunarwan21B 
{
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            int cup = 3000;
            int corong = 5000;
            int roti = 7000;
            int box = 10000;
            int topping_kue = 5000;
            int topping_keju = 3000;
            int jumlah_porsi = 0;
            int es_krim = 0;
            int totalHarga = 0;
            int uangPelanggan = 0;
            boolean kondisi = true;
            String pesan;
            
            System.out.println("Selamat Datang di Toko Es Krim");
            
            do {
                System.out.println("===== Jenis Es krim =====");
                System.out.println("1. Cup    = Rp. " + cup);
                System.out.println("2. Corong = Rp. " + corong);
                System.out.println("3. Roti   = Rp. " + roti);
                System.out.println("4. Box    = Rp. " + box);
                System.out.println("Pilih Jenis Eskrim Berdasarkan Angka :");
                
                es_krim = input.nextInt();
                
                int harga_awal = 0;
                
                switch (es_krim) {
                    case 1:
                        System.out.println("===== Mau pesan berapa? Inputkan dengan Angka =====");
                        jumlah_porsi = input.nextInt();
                        
                        harga_awal = jumlah_porsi;
                        
                        System.out.println("===== Pilih Topping Es Krim Anda =====");
                        System.out.println("1. Kue      = Rp. " + topping_kue);
                        System.out.println("2. Keju     = Rp. " + topping_keju);
                        System.out.println("3. Gak Usah");
                        System.out.println("Pilih Topping Berdasarkan Angka :");
                        
                        harga_awal = input.nextInt();
                        
                        switch (harga_awal) {
                            case 1:
                                totalHarga = (cup + topping_kue) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            case 2:
                                totalHarga = (cup + topping_keju) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            default:
                                totalHarga = cup * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar "+ totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                        }   break;
                    case 2:
                        System.out.println("===== Mau pesan berapa? Inputkan dengan Angka =====");
                        jumlah_porsi = input.nextInt();
                        
                        harga_awal = jumlah_porsi;
                        
                        System.out.println("===== Pilih Topping Es Krim Anda =====");
                        System.out.println("1. Kue      = Rp. " + topping_kue);
                        System.out.println("2. Keju     = Rp. " + topping_keju);
                        System.out.println("3. Gak Usah");
                        System.out.println("Pilih Topping Berdasarkan Angka :");
                        
                        harga_awal = input.nextInt();
                        
                        switch (harga_awal) {
                            case 1:
                                totalHarga = (corong + topping_kue) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            case 2:
                                totalHarga = (corong + topping_kue) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            default:
                                totalHarga = corong * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar "+ totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                        }   break;
                    case 3:
                        System.out.println("===== Mau pesan berapa? Inputkan dengan Angka =====");
                        jumlah_porsi = input.nextInt();
                        
                        harga_awal = jumlah_porsi;
                        
                        System.out.println("===== Pilih Topping Es Krim Anda =====");
                        System.out.println("1. Kue      = Rp. " + topping_kue);
                        System.out.println("2. Keju     = Rp. " + topping_keju);
                        System.out.println("3. Gak Usah");
                        System.out.println("Pilih Topping Berdasarkan Angka :");
                        
                        harga_awal = input.nextInt();
                        
                        switch (harga_awal) {
                            case 1:
                                totalHarga = (roti + topping_kue) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            case 2:
                                totalHarga = (roti + topping_keju) * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            default:
                                totalHarga = roti * jumlah_porsi;
                                System.out.println("Jumlah yang harus dibayar "+ totalHarga);
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                        }   break;
                    case 4:
                        System.out.println("===== Mau pesan berapa? Inputkan dengan Angka =====");
                        jumlah_porsi = input.nextInt();
                        
                        harga_awal = jumlah_porsi;
                        int harga_sebelum_diskon = harga_awal;
                        
                        System.out.println("===== Pilih Topping Es Krim Anda =====");
                        System.out.println("1. Kue      = Rp. " + topping_kue);
                        System.out.println("2. Keju     = Rp. " + topping_keju);
                        System.out.println("3. Gak Usah");
                        System.out.println("Pilih Topping Berdasarkan Angka :");
                        
                        harga_awal = input.nextInt();
                        
                        switch (harga_awal) {
                            case 1:
                                if (harga_sebelum_diskon >= 2) {
                                    double diskon = 0.15;
                                    totalHarga = (int) (((box + topping_kue) * jumlah_porsi) - (((box + topping_kue) * jumlah_porsi) * diskon));
                                    System.out.println("Selamat! Anda mendapatkan Diskon "+ (diskon*100)+"%");
                                    System.out.println("Harga sebelum Diskon "+ ((box + topping_kue) * jumlah_porsi));
                                    System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                } else {
                                    totalHarga = (box + topping_kue) * jumlah_porsi;
                                    System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                }
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            case 2:
                                if (harga_sebelum_diskon >= 2) {
                                    double diskon = 0.15;
                                    totalHarga = (int) (((box + topping_keju) * jumlah_porsi) - (((box + topping_keju) * jumlah_porsi) * diskon));
                                    System.out.println("Selamat! Anda mendapatkan Diskon "+ (diskon*100)+"%");
                                    System.out.println("Harga sebelum Diskon "+ ((box + topping_keju) * jumlah_porsi));
                                    System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                } else {
                                    totalHarga = (box + topping_keju) * jumlah_porsi;
                                    System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                }
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                            default:
                                if (harga_sebelum_diskon >= 2) {
                                    double diskon = 0.15;
                                    totalHarga = (int) (box * jumlah_porsi - (box * jumlah_porsi * diskon));
                                    System.out.println("Selamat! Anda mendapatkan Diskon "+ (diskon*100)+"%");
                                    System.out.println("Harga sebelum Diskon "+ (box * jumlah_porsi));
                                    System.out.println("Jumlah yang harus dibayar = " + totalHarga);
                                } else {
                                    totalHarga = box * jumlah_porsi;
                                    System.out.println("Jumlah yang harus dibayar "+ totalHarga);
                                }
                                
                                System.out.println("Berapa Uang Anda??");
                                uangPelanggan = input.nextInt();
                                
                                if (uangPelanggan == totalHarga) {
                                    System.out.println("Terima Kasih, Uang Anda Pas");
                                } else if(uangPelanggan > totalHarga) {
                                    System.out.println("Ini kembaliannya " + (uangPelanggan - totalHarga));
                                } else {
                                    System.out.println("Maaf, Uang Anda Kurang");
                                }
                                
                                break;
                        }   break;
                    default:
                        System.out.println("Anda memasukkan pilihan yang salah!");
                        break;
                }
                
                System.out.println("=======================================");
                
                System.out.print("Apakah Anda ingin membeli lagi? ketik (Ya / Tidak) : ");
                pesan = input.next();
                
                System.out.println("=======================================");
                
                if (pesan.equalsIgnoreCase("tidak") || pesan.equalsIgnoreCase("TIDAK") || pesan.equalsIgnoreCase("t") || pesan.equalsIgnoreCase("T")){
                    kondisi = false;
                } else if (pesan.equalsIgnoreCase("Ya") || pesan.equalsIgnoreCase("y") || pesan.equalsIgnoreCase("Y") || pesan.equalsIgnoreCase("YA")) {
                    kondisi = true;
                } else {
                    kondisi = true;
                }
                
            } while (kondisi);
            
            if (uangPelanggan < totalHarga) {
                System.out.println("Mohon Maaf. Toko kami tidak menerima Kasbon!");
            } else {
                System.out.println("Terima kasih sudah Berbelanja");
            }
        }
    }
}
