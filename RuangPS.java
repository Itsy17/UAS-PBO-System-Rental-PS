<html>
<head>
<title>RuangPS.java</title>
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
RuangPS.java</font>
</center></td></tr></table>
<pre><span class="s0">//==CLASS RUANGPS==</span>
<span class="s2">import </span><span class="s1">java</span><span class="s3">.</span><span class="s1">util</span><span class="s3">.</span><span class="s1">ArrayList</span><span class="s3">;</span>

<span class="s2">public class </span><span class="s1">RuangPS </span><span class="s3">{</span>
    <span class="s2">private </span><span class="s1">String IDRuangan</span><span class="s3">;</span>
    <span class="s2">private </span><span class="s1">ArrayList</span><span class="s3">&lt;</span><span class="s1">Konsol</span><span class="s3">&gt; </span><span class="s1">daftarKonsol </span><span class="s3">= </span><span class="s2">new </span><span class="s1">ArrayList</span><span class="s3">&lt;&gt;();</span>

    <span class="s2">public </span><span class="s1">String getIDRuangan</span><span class="s3">() {</span>
        <span class="s2">return </span><span class="s1">IDRuangan</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public void </span><span class="s1">setIDRuangan</span><span class="s3">(</span><span class="s1">String newIDRuangan</span><span class="s3">) {</span>
        <span class="s2">this</span><span class="s3">.</span><span class="s1">IDRuangan </span><span class="s3">= </span><span class="s1">newIDRuangan</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public void </span><span class="s1">tambahKonsol</span><span class="s3">(</span><span class="s1">Konsol konsol</span><span class="s3">) {</span>
        <span class="s1">daftarKonsol</span><span class="s3">.</span><span class="s1">add</span><span class="s3">(</span><span class="s1">konsol</span><span class="s3">);</span>
    <span class="s3">}</span>

    <span class="s2">public boolean </span><span class="s1">cekStatusKonsol</span><span class="s3">(</span><span class="s1">String IDKonsol</span><span class="s3">) {</span>
        <span class="s2">for </span><span class="s3">(</span><span class="s1">Konsol k </span><span class="s3">: </span><span class="s1">daftarKonsol</span><span class="s3">) {</span>
            <span class="s2">if </span><span class="s3">(</span><span class="s1">k</span><span class="s3">.</span><span class="s1">getIDKonsol</span><span class="s3">().</span><span class="s1">equals</span><span class="s3">(</span><span class="s1">IDKonsol</span><span class="s3">)) {</span>
                <span class="s2">return </span><span class="s1">k</span><span class="s3">.</span><span class="s1">getStatusKonsol</span><span class="s3">();</span>
            <span class="s3">}</span>
        <span class="s3">}</span>
        <span class="s2">return false</span><span class="s3">;</span>
    <span class="s3">}</span>

    <span class="s2">public </span><span class="s1">ArrayList</span><span class="s3">&lt;</span><span class="s1">Konsol</span><span class="s3">&gt; </span><span class="s1">getDaftarKonsol</span><span class="s3">() {</span>
        <span class="s2">return </span><span class="s1">daftarKonsol</span><span class="s3">;</span>
    <span class="s3">}</span>
<span class="s3">}</span>
</pre>
</body>
</html>