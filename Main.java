<html>
<head>
<title>Main.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #7a7e85;}
.s1 { color: #bcbec4;}
.s2 { color: #cf8e6d;}
.s3 { color: #bcbec4;}
.s4 { color: #6aab73;}
.s5 { color: #2aacb8;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Main.java</font>
</center></td></tr></table>
<pre><span class="s0">//==CLASS MAIN==</span>
<span class="s2">import </span><span class="s1">java</span><span class="s3">.</span><span class="s1">util</span><span class="s3">.*;</span>

<span class="s2">public class </span><span class="s1">Main </span><span class="s3">{</span>
    <span class="s2">public static void </span><span class="s1">main</span><span class="s3">(</span><span class="s1">String</span><span class="s3">[] </span><span class="s1">args</span><span class="s3">) {</span>
        <span class="s1">Scanner input </span><span class="s3">= </span><span class="s2">new </span><span class="s1">Scanner</span><span class="s3">(</span><span class="s1">System</span><span class="s3">.</span><span class="s1">in</span><span class="s3">);</span>

        <span class="s0">// === START ===</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;=== SISTEM RENTAL RUANG PS ===&quot;</span><span class="s3">);</span>

        <span class="s0">// === INPUT DATA PELANGGAN ===</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan nama pelanggan: &quot;</span><span class="s3">);</span>
        <span class="s1">String nama </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextLine</span><span class="s3">();</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan nomor HP: &quot;</span><span class="s3">);</span>
        <span class="s1">String noHP </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextLine</span><span class="s3">();</span>
        <span class="s1">Pelanggan pelanggan </span><span class="s3">= </span><span class="s2">new </span><span class="s1">Pelanggan</span><span class="s3">(</span><span class="s1">nama</span><span class="s3">, </span><span class="s1">noHP</span><span class="s3">);</span>

        <span class="s0">// === SETUP BEBERAPA RUANG PS ===</span>
        <span class="s1">List</span><span class="s3">&lt;</span><span class="s1">RuangPS</span><span class="s3">&gt; </span><span class="s1">daftarRuang </span><span class="s3">= </span><span class="s2">new </span><span class="s1">ArrayList</span><span class="s3">&lt;&gt;();</span>

        <span class="s1">RuangPS ruang1 </span><span class="s3">= </span><span class="s2">new </span><span class="s1">RuangPS</span><span class="s3">();</span>
        <span class="s1">ruang1</span><span class="s3">.</span><span class="s1">setIDRuangan</span><span class="s3">(</span><span class="s4">&quot;R001&quot;</span><span class="s3">);</span>
        <span class="s1">ruang1</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS3</span><span class="s3">(</span><span class="s4">&quot;PS3-001&quot;</span><span class="s3">, </span><span class="s5">5000</span><span class="s3">));</span>
        <span class="s1">ruang1</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS3</span><span class="s3">(</span><span class="s4">&quot;PS3-002&quot;</span><span class="s3">, </span><span class="s5">5000</span><span class="s3">));</span>
        <span class="s1">ruang1</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS4</span><span class="s3">(</span><span class="s4">&quot;PS4-001&quot;</span><span class="s3">, </span><span class="s5">7000</span><span class="s3">));</span>
        <span class="s1">ruang1</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS4</span><span class="s3">(</span><span class="s4">&quot;PS4-002&quot;</span><span class="s3">, </span><span class="s5">7000</span><span class="s3">));</span>

        <span class="s1">RuangPS ruang2 </span><span class="s3">= </span><span class="s2">new </span><span class="s1">RuangPS</span><span class="s3">();</span>
        <span class="s1">ruang2</span><span class="s3">.</span><span class="s1">setIDRuangan</span><span class="s3">(</span><span class="s4">&quot;R002&quot;</span><span class="s3">);</span>
        <span class="s1">ruang2</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS5</span><span class="s3">(</span><span class="s4">&quot;PS5-001&quot;</span><span class="s3">, </span><span class="s5">10000</span><span class="s3">));</span>
        <span class="s1">ruang2</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS5</span><span class="s3">(</span><span class="s4">&quot;PS5-002&quot;</span><span class="s3">, </span><span class="s5">10000</span><span class="s3">));</span>
        <span class="s1">ruang2</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS4</span><span class="s3">(</span><span class="s4">&quot;PS4-002&quot;</span><span class="s3">, </span><span class="s5">7500</span><span class="s3">));</span>
        <span class="s1">ruang2</span><span class="s3">.</span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s2">new </span><span class="s1">subclass</span><span class="s3">.</span><span class="s1">PS4</span><span class="s3">(</span><span class="s4">&quot;PS4-003&quot;</span><span class="s3">, </span><span class="s5">7500</span><span class="s3">));</span>

        <span class="s1">daftarRuang</span><span class="s3">.</span><span class="s1">add</span><span class="s3">(</span><span class="s1">ruang1</span><span class="s3">);</span>
        <span class="s1">daftarRuang</span><span class="s3">.</span><span class="s1">add</span><span class="s3">(</span><span class="s1">ruang2</span><span class="s3">);</span>

        <span class="s0">// === PILIH RUANGAN (loop sampai valid) ===</span>
        <span class="s1">RuangPS ruangDipilih </span><span class="s3">= </span><span class="s2">null</span><span class="s3">;</span>
        <span class="s2">while </span><span class="s3">(</span><span class="s1">ruangDipilih </span><span class="s3">== </span><span class="s2">null</span><span class="s3">) {</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Daftar Ruangan tersedia:&quot;</span><span class="s3">);</span>
            <span class="s2">for </span><span class="s3">(</span><span class="s1">RuangPS r </span><span class="s3">: </span><span class="s1">daftarRuang</span><span class="s3">) {</span>
                <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;- &quot; </span><span class="s3">+ </span><span class="s1">r</span><span class="s3">.</span><span class="s1">getIDRuangan</span><span class="s3">());</span>
            <span class="s3">}</span>

            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan ID Ruangan yang dipilih: &quot;</span><span class="s3">);</span>
            <span class="s1">String idRuangan </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextLine</span><span class="s3">();</span>

            <span class="s2">for </span><span class="s3">(</span><span class="s1">RuangPS r </span><span class="s3">: </span><span class="s1">daftarRuang</span><span class="s3">) {</span>
                <span class="s2">if </span><span class="s3">(</span><span class="s1">r</span><span class="s3">.</span><span class="s1">getIDRuangan</span><span class="s3">().</span><span class="s1">equalsIgnoreCase</span><span class="s3">(</span><span class="s1">idRuangan</span><span class="s3">)) {</span>
                    <span class="s1">ruangDipilih </span><span class="s3">= </span><span class="s1">r</span><span class="s3">;</span>
                    <span class="s2">break</span><span class="s3">;</span>
                <span class="s3">}</span>
            <span class="s3">}</span>

            <span class="s2">if </span><span class="s3">(</span><span class="s1">ruangDipilih </span><span class="s3">== </span><span class="s2">null</span><span class="s3">) {</span>
                <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Ruangan tidak ditemukan. Silakan pilih ruangan lagi.</span><span class="s2">\n</span><span class="s4">&quot;</span><span class="s3">);</span>
            <span class="s3">}</span>
        <span class="s3">}</span>

        <span class="s0">// === PILIH KONSOL (loop sampai valid &amp; tersedia) ===</span>
        <span class="s1">Konsol konsolDipilih </span><span class="s3">= </span><span class="s2">null</span><span class="s3">;</span>
        <span class="s2">while </span><span class="s3">(</span><span class="s1">konsolDipilih </span><span class="s3">== </span><span class="s2">null</span><span class="s3">) {</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Daftar konsol di &quot; </span><span class="s3">+ </span><span class="s1">ruangDipilih</span><span class="s3">.</span><span class="s1">getIDRuangan</span><span class="s3">() + </span><span class="s4">&quot;:&quot;</span><span class="s3">);</span>
            <span class="s2">for </span><span class="s3">(</span><span class="s1">Konsol k </span><span class="s3">: </span><span class="s1">ruangDipilih</span><span class="s3">.</span><span class="s1">getDaftarKonsol</span><span class="s3">()) {</span>
                <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;- &quot; </span><span class="s3">+ </span><span class="s1">k</span><span class="s3">.</span><span class="s1">getIDKonsol</span><span class="s3">());</span>
            <span class="s3">}</span>

            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan ID Konsol yang dipilih: &quot;</span><span class="s3">);</span>
            <span class="s1">String idKonsol </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextLine</span><span class="s3">();</span>

            <span class="s2">for </span><span class="s3">(</span><span class="s1">Konsol k </span><span class="s3">: </span><span class="s1">ruangDipilih</span><span class="s3">.</span><span class="s1">getDaftarKonsol</span><span class="s3">()) {</span>
                <span class="s2">if </span><span class="s3">(</span><span class="s1">k</span><span class="s3">.</span><span class="s1">getIDKonsol</span><span class="s3">().</span><span class="s1">equalsIgnoreCase</span><span class="s3">(</span><span class="s1">idKonsol</span><span class="s3">)) {</span>
                    <span class="s2">if </span><span class="s3">(</span><span class="s1">k</span><span class="s3">.</span><span class="s1">getStatusKonsol</span><span class="s3">()) {</span>
                        <span class="s1">konsolDipilih </span><span class="s3">= </span><span class="s1">k</span><span class="s3">;</span>
                    <span class="s3">} </span><span class="s2">else </span><span class="s3">{</span>
                        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Konsol sedang digunakan. Silakan pilih konsol lain.</span><span class="s2">\n</span><span class="s4">&quot;</span><span class="s3">);</span>
                    <span class="s3">}</span>
                    <span class="s2">break</span><span class="s3">;</span>
                <span class="s3">}</span>
            <span class="s3">}</span>

            <span class="s2">if </span><span class="s3">(</span><span class="s1">konsolDipilih </span><span class="s3">== </span><span class="s2">null</span><span class="s3">) {</span>
                <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Konsol tidak ditemukan. Silakan pilih konsol lagi.</span><span class="s2">\n</span><span class="s4">&quot;</span><span class="s3">);</span>
            <span class="s3">}</span>
        <span class="s3">}</span>

        <span class="s0">// === INPUT DURASI JAM (loop sampai &gt; 0) ===</span>
        <span class="s2">double </span><span class="s1">durasi </span><span class="s3">= </span><span class="s5">0</span><span class="s3">;</span>
        <span class="s2">while </span><span class="s3">(</span><span class="s1">durasi </span><span class="s3">&lt;= </span><span class="s5">0</span><span class="s3">) {</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan durasi sewa (jam): &quot;</span><span class="s3">);</span>
            <span class="s1">durasi </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextDouble</span><span class="s3">();</span>
            <span class="s2">if </span><span class="s3">(</span><span class="s1">durasi </span><span class="s3">&lt;= </span><span class="s5">0</span><span class="s3">) {</span>
                <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Durasi harus lebih dari 0 jam. Silakan input lagi.</span><span class="s2">\n</span><span class="s4">&quot;</span><span class="s3">);</span>
            <span class="s3">}</span>
        <span class="s3">}</span>

        <span class="s0">// === HITUNG TOTAL BIAYA ===</span>
        <span class="s2">double </span><span class="s1">totalBiaya </span><span class="s3">= </span><span class="s1">konsolDipilih</span><span class="s3">.</span><span class="s1">hitungBiayaSewa</span><span class="s3">(</span><span class="s1">durasi</span><span class="s3">);</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Total biaya sewa: Rp &quot; </span><span class="s3">+ </span><span class="s1">totalBiaya</span><span class="s3">);</span>

        <span class="s0">// === NOMINAL UANG YANG DIBAYARKAN (tidak diulang) ===</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s4">&quot;Masukkan nominal uang yang dibayarkan pelanggan: Rp &quot;</span><span class="s3">);</span>
        <span class="s2">double </span><span class="s1">uangDibayar </span><span class="s3">= </span><span class="s1">input</span><span class="s3">.</span><span class="s1">nextDouble</span><span class="s3">();</span>

        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Nominal yang harus dibayar: Rp &quot; </span><span class="s3">+ </span><span class="s1">totalBiaya</span><span class="s3">);</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Nominal uang yang diberikan: Rp &quot; </span><span class="s3">+ </span><span class="s1">uangDibayar</span><span class="s3">);</span>

        <span class="s2">if </span><span class="s3">(</span><span class="s1">uangDibayar </span><span class="s3">&gt; </span><span class="s1">totalBiaya</span><span class="s3">) {</span>
            <span class="s2">double </span><span class="s1">kembalian </span><span class="s3">= </span><span class="s1">uangDibayar </span><span class="s3">- </span><span class="s1">totalBiaya</span><span class="s3">;</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Kembalian: Rp &quot; </span><span class="s3">+ </span><span class="s1">kembalian</span><span class="s3">);</span>
        <span class="s3">} </span><span class="s2">else if </span><span class="s3">(</span><span class="s1">uangDibayar </span><span class="s3">== </span><span class="s1">totalBiaya</span><span class="s3">) {</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Uang pas, tidak ada kembalian.&quot;</span><span class="s3">);</span>
        <span class="s3">} </span><span class="s2">else </span><span class="s3">{</span>
            <span class="s2">double </span><span class="s1">kurang </span><span class="s3">= </span><span class="s1">totalBiaya </span><span class="s3">- </span><span class="s1">uangDibayar</span><span class="s3">;</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Uang tidak cukup. Kurang Rp &quot; </span><span class="s3">+ </span><span class="s1">kurang</span><span class="s3">);</span>
            <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Silahkan lakukan transaksi ulang&quot;</span><span class="s3">);</span>
            <span class="s2">return</span><span class="s3">; </span><span class="s0">// transaksi gagal langsung keluar</span>
        <span class="s3">}</span>

        <span class="s0">// === BUAT PESANAN ===</span>
        <span class="s1">Pemesanan pemesanan </span><span class="s3">= </span><span class="s2">new </span><span class="s1">Pemesanan</span><span class="s3">();</span>
        <span class="s1">pemesanan</span><span class="s3">.</span><span class="s1">setIDPemesanan</span><span class="s3">(</span><span class="s4">&quot;PM001&quot;</span><span class="s3">);</span>
        <span class="s1">pemesanan</span><span class="s3">.</span><span class="s1">buatPemesanan</span><span class="s3">(</span><span class="s1">ruangDipilih</span><span class="s3">.</span><span class="s1">getIDRuangan</span><span class="s3">(), </span><span class="s1">konsolDipilih</span><span class="s3">.</span><span class="s1">getIDKonsol</span><span class="s3">(), </span><span class="s1">durasi</span><span class="s3">);</span>

        <span class="s0">// === PROSES TRANSAKSI ===</span>
        <span class="s1">TransaksiRental transaksi </span><span class="s3">= </span><span class="s2">new </span><span class="s1">TransaksiRental</span><span class="s3">();</span>
        <span class="s1">transaksi</span><span class="s3">.</span><span class="s1">setIDTransaksi</span><span class="s3">(</span><span class="s4">&quot;TR001&quot;</span><span class="s3">);</span>
        <span class="s1">transaksi</span><span class="s3">.</span><span class="s1">setTotalJam</span><span class="s3">(</span><span class="s1">durasi</span><span class="s3">);</span>
        <span class="s1">transaksi</span><span class="s3">.</span><span class="s1">prosesTransaksi</span><span class="s3">(</span><span class="s1">konsolDipilih</span><span class="s3">, </span><span class="s1">durasi</span><span class="s3">);</span>

        <span class="s1">konsolDipilih</span><span class="s3">.</span><span class="s1">setStatusKonsol</span><span class="s3">(</span><span class="s2">false</span><span class="s3">); </span><span class="s0">// tandai sebagai disewa</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;Transaksi berhasil. Terima kasih!&quot;</span><span class="s3">);</span>

        <span class="s0">// === END ===</span>
        <span class="s1">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">println</span><span class="s3">(</span><span class="s4">&quot;=== SELESAI ===&quot;</span><span class="s3">);</span>
        <span class="s1">input</span><span class="s3">.</span><span class="s1">close</span><span class="s3">();</span>
    <span class="s3">}</span>
<span class="s3">}</span>
</pre>
</body>
</html>