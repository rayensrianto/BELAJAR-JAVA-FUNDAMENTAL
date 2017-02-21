###Apa Itu Inheritance?
Sebelum kita belajar tentang inheritance pada java, ada baik nya kita review dulu yang sudah kita pelajari sebelum nya.

####Review
- Aplikasi java adalah sekumpulan class-class yang saling terhubung dan berkomunikasi.
- Di kumpulan class tersebut, ada satu class yang berisi main method yang berfungsi meng-eksekusi code program yang ditulis.
- Object memiliki dua karakteristik yaitu state(saya sering menyebutnya kata sifat) dan behavior(saya sering menyebutnya kata kerja).
- State pada object disimpat dalam sebuah wadah yang disebut variabel, dan behavior akan menjalankan, mendefinisikan atau menampilkan state melalui method(fungsi) yang hasilnya tergantung olahan dari method itu sendiri terhadap state.
- Class adalah blueprint atau kerangka, masih bersifat umum misalnya: kendaraan, smartphone, laptop dan lain lain. Bisa juga disebut pembungkus state dan behavior.


####Lalu apa Inheritance?
Inheritance adalah konsep pewarisan atau turunan dari class induk. Sudah disinggung pada review di atas, bahwa class adalah sebuah kerangka atau blueprint yang masih bersifat umum, misal kita mempunyai class kendaraan yang berisi state(misal berisi: warna, kecepatan dan berat) dan behavior(misal berisi: menampilkan spek kendaraan), maka class kendaraan ini masih bersifat umum, kita masih bisa turunkan lagi dengan class mobil, motor atau pesawat.
Apa gunanya pewarian/penurunan ini? Di tutorial  2.apa-itu-class? kita sudah memahami bahwa di dunia nyata object memilik banyak kesamaan dan banyak jenis. Jadi class kendaraan belum cukup khusus atau details untuk mengambarkan sebuah object, contohnya seperti kasus class kendaraan tersebut.

Tidak usah bertele-tele, mari kita langsug coba implementasikan inheritance menggunakan bahasa pemograman java.
Silahkan download source code nya atau tulis code dibawah ini.
Di usahakan kode nya di tulis ya, kalo error terus baru di copy paste, kalo di copy pase error silahkan download folder nya aja, kalo masih error juga silahkan coba cek spion motor anda siapa tau kendor.

```java
class Kendaraan {
  String warna;
  int kecepatan;
  int berat;

  void cetakSpekKendaraan() {
    System.out.println("Warna: "+warna);
    System.out.println("Kecepatan: "+kecepatan+" kmh");
    System.out.println("Ukuran: "+berat+" kg");
  }
}

class Mobil extends Kendaraan {
  int cc;
  int gears;

  void cetakSpekMobil() {
    System.out.println("Warna Mobil : "+warna);
    System.out.println("Kecepatan Mobil : "+kecepatan+" kmh");
    System.out.println("Ukuran Mobil: "+berat+" kg");
    System.out.println("CC Mobil: "+cc);
    System.out.println("Gigi Mobil: "+gears);
  }
}

class ContohInheritance {
  public static void main(String [] args) {
    Mobil avanza = new Mobil();
    avanza.warna = "Putih";
    avanza.kecepatan = 150;
    avanza.berat = 540;
    avanza.cc = 180;
    avanza.gears = 6;
    avanza.cetakSpekMobil();

  }
}
```

####Penjelasan

#####1. Mendeklarasikan Class

```java
class Kendaraan {
	//isi class
}

class Mobil extends Kendaraan {
	//isi class
}
```
Kode diatas adalah membuat dua buah class, yaitu class Kendaraan yang nantinya akan menjadi class Induk, dan class Mobil sebagai class turunan dari class Kendaraan. Nantinya, sebuah object yang dibuat dari class Mobil, juga dapat mengakses isi class pada class Kendaraan.

> Formatnya : class nama_class_anak extends nama_class_induk

Untuk membuat inheritance kita menggunakan keyword extends.
```java
class Kendaraan {
  String warna;
  int kecepatan;
  int berat;

  void cetakSpekKendaraan() {
    System.out.println("Warna: "+warna);
    System.out.println("Kecepatan: "+kecepatan+" kmh");
    System.out.println("Ukuran: "+berat+" kg");
  }
}
```
Class Kendaraan berisi beberapa state, yaitu warna, kecepatan, berat dan memiliki behavior cetakSpekKendaraan. Dan isi class Kendaraan ini juga akan dimiliki oleh class yang di wariskan nya, pada contoh ini adalah class Mobil.
```java
class Mobil extends Kendaraan {
  int cc;
  int gears;

  void cetakSpekMobil() {
    System.out.println("Warna Mobil : "+warna);
    System.out.println("Kecepatan Mobil : "+kecepatan+" kmh");
    System.out.println("Ukuran Mobil: "+berat+" kg");
    System.out.println("CC Mobil: "+cc);
    System.out.println("Gigi Mobil: "+gears);
  }
}
```

Kita bisa lihat bahwa class Kendaraan hanya mempunyai dua state, yaitu cc dan gears. Lalu kenapa method cetakSpekMobil bisa mencetak warna, kecepatan dan berat? Padahal state warna, kecepatan dan berat berada pada class Kendaraan.

Iya bisa karena class Mobil adalah turunan dari class Kendaraan, jadi semua data yang dimiliki class Kendaraan diwariskan ke class Mobil.

#####3. Membuat Object
```java
class ContohInheritance {
  public static void main(String [] args) {
    Mobil avanza = new Mobil();
    avanza.warna = "Putih";
    avanza.kecepatan = 150;
    avanza.berat = 540;
    avanza.cc = 180;
    avanza.gears = 6;
    avanza.cetakSpekMobil();
  }
}
```
Terakhir, kita tinggal buat objectnya sekaligus mengeksekusi program di main method. Disitu kita membuat object bernama avanza dengan Mobil sebagai class nya. Setelah objectnya di buat, maka object sudah dapat memiliki/mengakses resource atau isi yang di class Mobil, dan secara otomatis object tersebut juga dapat memiliki/mengakses resource yang di class Kendaraan. Misalnya, kita memberi nilai warna Putih, dimana state warna ini ada pada class Kendaraan, dan memberikan nilai cc 180 dimana state cc ada pada class Mobil.

Setelah semuanya sudah siap, tinggal buka terminal dan compile lalu jalankan program nya.

```sh
ryan@dmachine:~/belajar-java-basic/2.object-oriented-programming/3.inheritance$ javac ContohInheritance.java
ryan@dmachine:~/belajar-java-basic/2.object-oriented-programming/3.inheritance$ java ContohInheritance
Warna Mobil : Putih
Kecepatan Mobil : 150 kmh
Ukuran Mobil: 540 kg
CC Mobil: 180
Gigi Mobil: 6
```


Semoga bermanfaat :)

rayen
