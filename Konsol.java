<html>
<head>
<title>Konsol.java</title>
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
Konsol.java</font>
</center></td></tr></table>
<pre><span class="s0">//==CLASS KONSOL==</span>
<span class="s2">public abstract class </span><span class="s1">Konsol </span><span class="s3">{</span>
        <span class="s2">protected </span><span class="s1">String IDKonsol</span><span class="s3">;</span>
        <span class="s2">protected boolean </span><span class="s1">statusKonsol</span><span class="s3">;</span>

        <span class="s2">public </span><span class="s1">String getIDKonsol</span><span class="s3">() {</span>
            <span class="s2">return </span><span class="s1">IDKonsol</span><span class="s3">;</span>
        <span class="s3">}</span>

        <span class="s2">public void </span><span class="s1">setIDKonsol</span><span class="s3">(</span><span class="s1">String newIDKonsol</span><span class="s3">) {</span>
            <span class="s2">this</span><span class="s3">.</span><span class="s1">IDKonsol </span><span class="s3">= </span><span class="s1">newIDKonsol</span><span class="s3">;</span>
        <span class="s3">}</span>

        <span class="s2">public boolean </span><span class="s1">getStatusKonsol</span><span class="s3">() {</span>
            <span class="s2">return </span><span class="s1">statusKonsol</span><span class="s3">;</span>
        <span class="s3">}</span>

        <span class="s2">public void </span><span class="s1">setStatusKonsol</span><span class="s3">(</span><span class="s2">boolean </span><span class="s1">newStatusKonsol</span><span class="s3">) {</span>
            <span class="s2">this</span><span class="s3">.</span><span class="s1">statusKonsol </span><span class="s3">= </span><span class="s1">newStatusKonsol</span><span class="s3">;</span>
        <span class="s3">}</span>

    <span class="s2">public abstract double </span><span class="s1">hitungBiayaSewa</span><span class="s3">(</span><span class="s2">double </span><span class="s1">durasiJam</span><span class="s3">);</span>
<span class="s3">}</span></pre>
</body>
</html>