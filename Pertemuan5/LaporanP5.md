# LAPORAN PRAKTIKUM 5

## Percobaan 1: Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

Kode Program:
<img src = "image-2.png">

Hasil Running Program:
<img src = "image-1.png">

Pertanyaan:
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

Jawaban:
1. penggunaan if dalam kode tersebut adalah sebagai batas dari perulangan rekursif, dan penggunaan else dalam kode tersebut adalah sebagai pengguna metode rekursif
2. masih bisa dengan menggunakan metode while
<img src = "image-6.png">

3. 
- fakto *= i; adalah perkalian sederhana yang nantinya fakto akan dikalikan dengan nilai i.
- fakto = n * faktorialDC(n-1); adalah perkalian yang menggunakan metode rekursif yang dilakukan hingga mencapai batas berhenti.


## Percobaan 2: Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

Kode Program:
<img src = "image-3.png">

Hasil Running Program:
<img src = "image-4.png">

Pertanyaan: 
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!

Jawaban:
1. 
- PangkatBF() adalah suatu metode yang mengalikan basis sebanyak eksponen kali secara langsung.
- PangkatDC() adalah suatu metode yang membagi masalah menjadi submasalah yang lebih kecil dan menggunakan rekursif untuk mengatasi perhitungan dengan lebih efisien.
2. Tidak, karena dalam penggunaan metode devide conquer yang dilakukan hanyalah pembagian angka pangkat.
<img src = "image-9.png">

3. 
<img src = "image-10.png">

4. 
<img src = "image-11.png">


## Percobaan 3:  Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

Kode Program;
<img src = "image-7.png">

Hasil Running Program:
<img src = "image-8.png">

Pertanyaan:
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
<img src = "image-5.png">

2. Kenapa dibutuhkan variable mid pada method TotalDC()?
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!

Jawaban:
1. Karena return tersebut berfungsi untuk menjumlahkan masing-masing nilai yang telah dimasukkan menjadi total akhir dari keuntungan perusahaan.
2. Karena variable tersebut berguna sebagai nilai tengah dan membagi submasalah menjadi 2 bagian yang sama besar.
3. 
<img src = "image-12.png">

## Latihan Praktikum
1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini
<img src = "image-13.png">

Tentukan:

a) top_acceleration tertinggi menggunakan Divide and Conquer!

b) top_acceleration terendah menggunakan Divide and Conquer!

c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force!

Jawaban:

a) <img src = "image-14.png">

b) <img src = "image-15.png">

c) <img src = "image-16.png">
