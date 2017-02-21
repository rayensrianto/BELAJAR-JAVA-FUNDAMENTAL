**Apa itu Class?**

Di dunia nyata, kita akan menemukan banyak object dengan jenis yang sama, misal botol, ada botol kecap, botol kerdus, botol plastik. Sama juga hal nya dengan sepeda, ada ribuan sepeda yang sama fungsi dan bahan nya. Setiap sepeda di buat dengan blueprint atau contekan dari sepeda sebelum nya, misal sepeda gunung, dibuat nya menggunakan blueprint atau contekan dengan sepeda standar, yaitu memiliki roda dua, jok, setang dll.

Contoh code di repo ini menggunakan sepeda sebagai object dari benda dunia nyata.

**Syarat**

 - Sudah menguasai materi membuat ritual hellowolrd pada tutorial 1.helloworld
 - Memahami fungsi main method pada java
 - Memahmi esensi object yang sudah di jelaskan pada 1.apa-itu-object?

```java
class Sepeda {

  int iramaPedal = 0;
  int kecepatan = 0;
  int gigi = 1;

  void gantiIramaPedal(int newValue) {
    iramaPedal = newValue;
  }

  void gantiGigi(int newValue) {
    gigi = newValue;
  }

  void tambahKecepatan(int penambahan) {
    kecepatan = kecepatan + penambahan;
  }

  void ngerem(int pengurangan) {
    kecepatan = kecepatan - pengurangan;
  }

  void cetakState() {
    System.out.println("Irama Pedal:"+iramaPedal+" kecepatan:"+kecepatan+" gigi:"+gigi);
  }

}

class DemoSepeda {
  public static void main(String args[]) {

    //kita coba buat dua buah object
    Sepeda sepedaRyan = new Sepeda();
    Sepeda sepedaAndri = new Sepeda();

    sepedaRyan.gantiIramaPedal(50);
    sepedaRyan.gantiGigi(2);
    sepedaRyan.tambahKecepatan(10);
    sepedaRyan.cetakState();

    sepedaAndri.gantiIramaPedal(80);
    sepedaAndri.gantiGigi(3);
    sepedaAndri.tambahKecepatan(20);
    sepedaAndri.cetakState();


  }
}

```

**Pejelasan Tentang Code di Atas**

Disitu ada dua class, yaitu class Sepeda dan class DemoSepeda. Class Sepeda ini adalah bluprint/cetekan/contekan untuk object nanti nya.
Pendeklarasian class ada pada code
```java
class Sepeda {
	//isi class
}
class DemoSepeda {
	public static void main(String args[]) {
		//isi method
	}
}
```
Di dalam class Sepeda nantinya akan berisi code-code yang mendefinisikan state dan method tentang sepeda. Sementara pada class DemoSepeda berisi main method yang akan menjalankan program, yang berisi object-object yang dibuat berdasarkan class Sepeda.

Isi class Sepeda
```java
  int iramaPedal = 0;
  int kecepatan = 0;
  int gigi = 1;

  void gantiIramaPedal(int newValue) {
    iramaPedal = newValue;
  }

  void gantiGigi(int newValue) {
    gigi = newValue;
  }

  void tambahKecepatan(int penambahan) {
    kecepatan = kecepatan + penambahan;
  }

  void ngerem(int pengurangan) {
    kecepatan = kecepatan - pengurangan;
  }

  void cetakState() {
    System.out.println("Irama Pedal:"+iramaPedal+" kecepatan:"+kecepatan+" gigi:"+gigi);
  }
```
Pertama kita memberikan nilai pada state sepeda, yaitu gantiIramaPedal, tambahKecepatan dan gantiGigi. Lalu kita membuat method-method untuk mengolah state-state tersebut. Jadi object akan menggunakan sepeda berdasarkan method-method yang di jalankan dan nilai-nilai yang terkandung pada state.

State pada class Sepeda
```java
  int iramaPedal = 0;
  int kecepatan = 0;
  int gigi = 1;
```
Method pada class Sepeda
```java
void gantiIramaPedal(int newValue) {
    iramaPedal = newValue;
  }

  void gantiGigi(int newValue) {
    gigi = newValue;
  }

  void tambahKecepatan(int penambahan) {
    kecepatan = kecepatan + penambahan;
  }

  void ngerem(int pengurangan) {
    kecepatan = kecepatan - pengurangan;
  }

  void cetakState() {
    System.out.println("Irama Pedal:"+iramaPedal+" kecepatan:"+kecepatan+" gigi:"+gigi);
  }
```

Method gantiIramaPedal, tambahKecepatan dan gantiGigi memiliki parameter atau masukan yang akan merubah state masing-masing yang ada pada method itu sendiri. Misal mehtod gantiGigi, mempunyai parameter yang akan mengubah nilai state gigi dari 0 menjadi 1,2,3, atau 4 tergantung yang dimasukan object melalui parameter.

Pembuatan object ada pada class DemoSepeda.
```java
class DemoSepeda {
  public static void main(String args[]) {

    //kita coba buat dua buah object
    Sepeda sepedaRyan = new Sepeda();
    Sepeda sepedaAndri = new Sepeda();

    sepedaRyan.gantiIramaPedal(50);
    sepedaRyan.gantiGigi(2);
    sepedaRyan.tambahKecepatan(10);
    sepedaRyan.cetakState();

    sepedaAndri.gantiIramaPedal(80);
    sepedaAndri.gantiGigi(3);
    sepedaAndri.tambahKecepatan(20);
    sepedaAndri.cetakState();


  }
}

```

Sepeda sepedaRyan = new Sepeda();
Sepeda sepedaAndri = new Sepeda();
Kode ini artinya, kita membuat object baru yang bernama sepedaRyan dan sepedaAndri dengan mengambil class Sepeda sebagai acuannya. Dengan begini, maka object sepedaRyan dan sepedaAndri memiliki semua nilai yang ada pada class Sepeda. Hal ini sering disebut *instantiating*.

```java
    sepedaRyan.gantiIramaPedal(50);
    sepedaRyan.gantiGigi(2);
    sepedaRyan.tambahKecepatan(10);
    sepedaRyan.cetakState();

```
Setelah melakukan *instantiating*, dan object sepedaRyan sudah memiliki akses semua yang ada di class Sepeda. Kita bisa memanggil method dan memasukan perintah/parameter nya. Misal sepedaRyan.gantiGigi(2), itu berarti kita memanggil method gantGigi dengan memasukan nilai 2 kedalam parameter, sehingga method gantGigi pada class Sepeda mengubah nilai giigi yang tadi nya 0 menjadi 2.

Silahkan download atau tulis code di repo ini, dan jalankan program nya sembari mengamati apa yang terjadi sebenarnya. :D

Semoga bermanfaat.
