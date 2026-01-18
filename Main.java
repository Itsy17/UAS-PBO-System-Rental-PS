//==CLASS MAIN==
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === START ===
        System.out.println("=== SISTEM RENTAL RUANG PS ===");

        // === INPUT DATA PELANGGAN ===
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String noHP = input.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama, noHP);

        // === SETUP BEBERAPA RUANG PS ===
        List<RuangPS> daftarRuang = new ArrayList<>();

        RuangPS ruang1 = new RuangPS();
        ruang1.setIDRuangan("R001");
        ruang1.tambahKonsol(new subclass.PS3("PS3-001", 5000));
        ruang1.tambahKonsol(new subclass.PS3("PS3-002", 5000));
        ruang1.tambahKonsol(new subclass.PS4("PS4-001", 7000));
        ruang1.tambahKonsol(new subclass.PS4("PS4-002", 7000));

        RuangPS ruang2 = new RuangPS();
        ruang2.setIDRuangan("R002");
        ruang2.tambahKonsol(new subclass.PS5("PS5-001", 10000));
        ruang2.tambahKonsol(new subclass.PS5("PS5-002", 10000));
        ruang2.tambahKonsol(new subclass.PS4("PS4-002", 7500));
        ruang2.tambahKonsol(new subclass.PS4("PS4-003", 7500));

        daftarRuang.add(ruang1);
        daftarRuang.add(ruang2);

        // === PILIH RUANGAN (loop sampai valid) ===
        RuangPS ruangDipilih = null;
        while (ruangDipilih == null) {
            System.out.println("Daftar Ruangan tersedia:");
            for (RuangPS r : daftarRuang) {
                System.out.println("- " + r.getIDRuangan());
            }

            System.out.print("Masukkan ID Ruangan yang dipilih: ");
            String idRuangan = input.nextLine();

            for (RuangPS r : daftarRuang) {
                if (r.getIDRuangan().equalsIgnoreCase(idRuangan)) {
                    ruangDipilih = r;
                    break;
                }
            }

            if (ruangDipilih == null) {
                System.out.println("Ruangan tidak ditemukan. Silakan pilih ruangan lagi.\n");
            }
        }

        // === PILIH KONSOL (loop sampai valid & tersedia) ===
        Konsol konsolDipilih = null;
        while (konsolDipilih == null) {
            System.out.println("Daftar konsol di " + ruangDipilih.getIDRuangan() + ":");
            for (Konsol k : ruangDipilih.getDaftarKonsol()) {
                System.out.println("- " + k.getIDKonsol());
            }

            System.out.print("Masukkan ID Konsol yang dipilih: ");
            String idKonsol = input.nextLine();

            for (Konsol k : ruangDipilih.getDaftarKonsol()) {
                if (k.getIDKonsol().equalsIgnoreCase(idKonsol)) {
                    if (k.getStatusKonsol()) {
                        konsolDipilih = k;
                    } else {
                        System.out.println("Konsol sedang digunakan. Silakan pilih konsol lain.\n");
                    }
                    break;
                }
            }

            if (konsolDipilih == null) {
                System.out.println("Konsol tidak ditemukan. Silakan pilih konsol lagi.\n");
            }
        }

        // === INPUT DURASI JAM (loop sampai > 0) ===
        double durasi = 0;
        while (durasi <= 0) {
            System.out.print("Masukkan durasi sewa (jam): ");
            durasi = input.nextDouble();
            if (durasi <= 0) {
                System.out.println("Durasi harus lebih dari 0 jam. Silakan input lagi.\n");
            }
        }

        // === HITUNG TOTAL BIAYA ===
        double totalBiaya = konsolDipilih.hitungBiayaSewa(durasi);
        System.out.println("Total biaya sewa: Rp " + totalBiaya);

        // === NOMINAL UANG YANG DIBAYARKAN (tidak diulang) ===
        System.out.print("Masukkan nominal uang yang dibayarkan pelanggan: Rp ");
        double uangDibayar = input.nextDouble();

        System.out.println("Nominal yang harus dibayar: Rp " + totalBiaya);
        System.out.println("Nominal uang yang diberikan: Rp " + uangDibayar);

        if (uangDibayar > totalBiaya) {
            double kembalian = uangDibayar - totalBiaya;
            System.out.println("Kembalian: Rp " + kembalian);
        } else if (uangDibayar == totalBiaya) {
            System.out.println("Uang pas, tidak ada kembalian.");
        } else {
            double kurang = totalBiaya - uangDibayar;
            System.out.println("Uang tidak cukup. Kurang Rp " + kurang);
            System.out.println("Silahkan lakukan transaksi ulang");
            return; // transaksi gagal langsung keluar
        }

        // === BUAT PESANAN ===
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.setIDPemesanan("PM001");
        pemesanan.buatPemesanan(ruangDipilih.getIDRuangan(), konsolDipilih.getIDKonsol(), durasi);

        // === PROSES TRANSAKSI ===
        TransaksiRental transaksi = new TransaksiRental();
        transaksi.setIDTransaksi("TR001");
        transaksi.setTotalJam(durasi);
        transaksi.prosesTransaksi(konsolDipilih, durasi);

        konsolDipilih.setStatusKonsol(false); // tandai sebagai disewa
        System.out.println("Transaksi berhasil. Terima kasih!");

        // === END ===
        System.out.println("=== SELESAI ===");
        input.close();

// === PROSES TRANSAKSI ===
        TransaksiRental transaksiRental = new TransaksiRental();
        transaksi.setIDTransaksi("TR001");
        transaksi.setTotalJam(durasi);
        transaksi.prosesTransaksi(konsolDipilih, durasi);

        konsolDipilih.setStatusKonsol(false); // tandai sebagai disewa
        System.out.println("Transaksi berhasil. Terima kasih!");

// === CETAK STRUK ===
        LocalDateTime waktuTransaksi = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n=== STRUK TRANSAKSI RENTAL RUANG PS ===");
        System.out.println("Tanggal/Waktu   : " + waktuTransaksi.format(formatter));
        System.out.println("ID Transaksi    : " + transaksi.getIDTransaksi());
        System.out.println("ID Pemesanan    : " + pemesanan.getIDPemesanan());
        System.out.println("Nama Pelanggan  : " + pelanggan.getNama());
        System.out.println("No HP           : " + pelanggan.getNoHP());
        System.out.println("Ruangan         : " + ruangDipilih.getIDRuangan());
        System.out.println("Konsol          : " + konsolDipilih.getIDKonsol());
        System.out.println("Durasi          : " + durasi + " jam");
        System.out.println("Total Biaya     : Rp " + totalBiaya);
        System.out.println("Uang Dibayar    : Rp " + uangDibayar);
        if (uangDibayar > totalBiaya) {
            System.out.println("Kembalian       : Rp " + (uangDibayar - totalBiaya));
        } else {
            System.out.println("Kembalian       : Rp 0");
        }
        System.out.println("=======================================");
        System.out.println("Terima kasih telah menggunakan layanan kami!");
        System.out.println("=======================================\n");

// === END ===
        System.out.println("=== SELESAI ===");
        input.close();
    }
}
