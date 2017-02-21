###Apa itu Interface?
Setelah mempeleajari istilah-istilah seperti object, class, dan method, kita bisa menyimpulkan bahwa object mendefinisikan interaksi mereka dengan dunia luar melalui method yang di panggil, sehingga method membentuk interface object dengan dunia luar.

Contohnya, sebuah tombol yang ada di televisi adalah interface antara kita dengan komponen-komponen listrik yang ada di dalam cassing televisi tersebut, saat kita menekan tombol On, makan teleivisi akan menyala.

Saya sudah membuat 2 contoh yang mungkin bisa memberikan gambaran tentang apa itu interface.

# Contoh1

```java
interface Band {
  public void genreBand();
}

class Rock  implements Band {
  public void genreBand() {
    System.out.println("Band beraliran rock");
  }
}

class Pop implements Band {
  public void genreBand() {
    System.out.println("Band berlaliran pop");
  }
}

public class Contoh1 {
  public static void main(String[] args) {
    Rock Boomerang = new Rock();
    Pop Peterpan = new Pop();

    Boomerang.genreBand();
    Peterpan.genreBand();
  }
}

```

###Pendeklarasian Interface

```java
interface Band {
  public void genreBand();
}
```
Kita menggunakan keyword "interface" untuk membuat interface di java, di contoh1 ini kita membuat interface bernama Band, dan didalam nya terdapat method yang bernama genre Band, method ini masih kosong dan nantinya ada class lain yang membutuhkan method ini sekaligus mendeklarasikan fungsi/tujuan method ini tergantung tujuan class nya juga.
Hampir mirip dengan konsep inheritance, yaitu pewarisan, namun tentu ada perbedaan-perbedaan antara inheritance dengan interface yang mungkin nanti akan dibahas pada materi pendalaman OOP di Java, insha Allah.

```java
class Rock  implements Band {
  public void genreBand() {
    System.out.println("Band beraliran rock");
  }
}

class Pop implements Band {
  public void genreBand() {
    System.out.println("Band berlaliran pop");
  }
}

public class Contoh1 {
  public static void main(String[] args) {
    Rock Boomerang = new Rock();
    Pop Peterpan = new Pop();

    Boomerang.genreBand();
    Peterpan.genreBand();
  }
}
```
Kode di atas adalah proses implementasi/penurunan interface ke class, dimana nantinya method pada interface tersebut di olah lagi sesuai tujuan class nya.

Jika kode di atas di jalankan, maka hasilnya akan seperti ini:
```sh
ryan@dmachine:~/belajar-java-basic/2.object-oriented-programming/4.interface/Contoh1$ java Contoh1
Band beraliran rock
Band berlaliran pop
```
