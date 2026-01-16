<html>
<head>
<title>Pemesanan.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #7a7e85;}
.s1 { color: #bcbec4;}
.s2 { color: #cf8e6d;}
.s3 { color: #bcbec4;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Pemesanan.java</font>
</center></td></tr></table>
<pre><span class="s0">//==CLASS PEMESANAN==</span>
<span class="s2">public class </span><span class="s1">Pemesanan </span><span class="s3">{</span>
    <span class="s2">private </span><span class="s1">String IDPemesanan</span><span class="s3">;</span>
    <span class="s2">private double </span><span class="s1">durasiJam</span><span class="s3">;</span>
    <span class="s2">private </span><span class="s1">String IDRuangan</span><span class="s3">;</span>
    <span class="s2">private </span><span class="s1">String IDKonsol</span><span class="s3">;</span>

    <span class="s2">public </span><span class="s1">String getIDPemesanan</span><span class="s3">() {</span>
        <span class="s2">return </span><span class="s1">IDPemesanan</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public void </span><span class="s1">setIDPemesanan</span><span class="s3">(</span><span class="s1">String newIDPemesanan</span><span class="s3">) {</span>
        <span class="s2">this</span><span class="s3">.</span><span class="s1">IDPemesanan </span><span class="s3">= </span><span class="s1">newIDPemesanan</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public void </span><span class="s1">buatPemesanan</span><span class="s3">(</span><span class="s1">String IDRuangan</span><span class="s3">, </span><span class="s1">String IDKonsol</span><span class="s3">, </span><span class="s2">double </span><span class="s1">durasiJam</span><span class="s3">) {</span>
        <span class="s2">this</span><span class="s3">.</span><span class="s1">IDRuangan </span><span class="s3">= </span><span class="s1">IDRuangan</span><span class="s3">;</span>
        <span class="s2">this</span><span class="s3">.</span><span class="s1">IDKonsol </span><span class="s3">= </span><span class="s1">IDKonsol</span><span class="s3">;</span>
        <span class="s2">this</span><span class="s3">.</span><span class="s1">durasiJam </span><span class="s3">= </span><span class="s1">durasiJam</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public double </span><span class="s1">getDurasiJam</span><span class="s3">() {</span>
        <span class="s2">return </span><span class="s1">durasiJam</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public </span><span class="s1">String getIDKonsol</span><span class="s3">() {</span>
        <span class="s2">return </span><span class="s1">IDKonsol</span><span class="s3">;</span>
    <span class="s3">}</span>
<span class="s3">}</span>
</pre>
</body>
</html>