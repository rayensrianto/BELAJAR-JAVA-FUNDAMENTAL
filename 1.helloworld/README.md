# Belajar Hellowolrd Di Java

Yang harus sudah di persiapkan:

  - Menggunakan linux
  - Sudah terinstall java di komputer
  - Sudah terinstall atom sebagai editor


> untuk mempersiapkan tiga hal di atas adalah silahkan googling sendiri, ada banyak tutorial yang sangat membantu.
> mempersiapkan tiga hal di atas adalah demi kemudahan mengikuti tutorial
> Jika sempat, nanti saya akan update dengan mencantumkan link-link tutorial menginstall java di linux dan atom.

Jika semua sudah siap, langsung kita mulai belajar membuat helloworld menggunakan java. Buka terminal, dan ikuti langkah berikut:

```sh
ryan@dmachine:~$ mkdir belajar-java-basic
ryan@dmachine:~$ cd belajar-java-basic/
ryan@dmachine:~/belajar-java-basic$ mkdir 1.helloworld
ryan@dmachine:~/belajar-java-basic$ cd 1.helloworld/
ryan@dmachine:~/belajar-java-basic/1.helloworld$ touch HelloWorld.java
```
Sampai sini, kita sudah membuat folder belajar-java-basic dan di dalam folder tersebut kita juga membuat folder 1.helloworld. Setelah itu kita masuk ke dalam folder 1.helloworld dan membuat sebuah file HelloWorld.java. Di file ini lah kita akan menulis kode helloworld dengan java.

Selanjutnya, kita buka file HelloWolrd.java menggunakan atom.
```sh
ryan@dmachine:~/belajar-java-basic/1.helloworld$ atom HelloWorld.java
```
Lalu tulis kode dibawah  ini:
```sh
public class HelloWorld {
  public static void main(String args[]) {
    System.out.println("HelloWorld");
  }
}
```
Setelah itu, save.

**Penjelasan Sedikit tentang code yang di tulis**

Setahu saya, pada dasarnya pemograman java adalah kumpulan class class yang saling terhubung.
Nah, di file yang kita buat ini terdapat sebuah class yang bernama HelloWorld dan berisi "main method" atau method utama. Ini adalah class yang wajib di tulis dalam setiap aplikasi(dekstop) java karna berisi "main method"
Nama class HelloWorld ini harus sama dengan nama file nya, tadi kan kita buat file dengan nama Helloworld.java, jadi ya nama class nya juga Hellowolrd.
Kode yang mendeklarasikan class bernama HelloWolrd adalah yang ini:

 ```sh
public class HelloWorld {
    //isi class
}
```
Format penulisan class adalah, Access Modifier yaitu "public", lalu keyword "class", lalu nama class nya "HelloWorld".
Jangan pusingkan diri dulu tentang apa itu Access Modifier "public" nya, tujuan utama nya adalah melakukan ritual hellowolrd, nanti Insha Allah saya akan coba share penggunaan Accesss Modifier.

Class HelloWolrd ini saya sebut class wajib, karna nama class ini sama dengan nama file, di class wajib ini lah kita menempatkan "main method" java.
Class HelloWolrd berisi satu buah "main method" atau method utama, yang berisikan perintah mencetak tulisan string "HelloWorld".
Main method pada code di atas adalah yang ini:
 ```sh
 public static void main(String args[]) {
    System.out.println("HelloWorld");
  }
```
Yang sanggup saya jelaskan tentang "main method" ini adalah, sebuah fungsi yang bernama main, yang berguna untuk memproses atau menampilkan hasil code-code java yang kita tulis. Mungkin definisi ini nanti akan saya update, jika ilmu saya sudah update juga tentang java :D

Setelah itu, kita compile file HelloWorld.java nya dan kita jalan kan dengan terminal:
```sh
ryan@dmachine:~/belajar-java-basic/1.helloworld$ javac HelloWorld.java
ryan@dmachine:~/belajar-java-basic/1.helloworld$ java HelloWorld
HelloWorld
```
Jika code yang kita tulis sudah benar, maka saat mengcompile menggunakan keyword javac pada terminal, maka tidak ada pesan error. Dan ketika kita jalankan dengan keyword java pada terminal, muncul lah tulisan HelloWolrd nya yang kita buat di "main method" tadi. *hore~

Perlu di ketahui, setelah kita mengcompile dengan menuliskan "javac HelloWorld.java", maka secara otomatis akan ada file baru yang terbuat dengan nama HelloWolrd.class, jadi saat kita menjalankan perintah "java HelloWolrd", yang di panggil itu adalah file HelloWolrd.java.
```sh
ryan@dmachine:~/belajar-java-basic/1.helloworld$ ls
HelloWorld.class  HelloWorld.java
ryan@dmachine:~/belajar-java-basic/1.helloworld$
```

Demikian ilmu cemen yang bisa saya share tentang ritual helloworld di java.
Siapa tau bermanfaat bagi yang baru mulai belajar java.



rayen
