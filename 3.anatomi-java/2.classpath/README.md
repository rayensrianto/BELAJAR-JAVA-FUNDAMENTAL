Belajar helloworld dan classpath.

Buat Struktur folder:
-bin
-src

Foldser src untuk menaruh file.java, dan bin untuk menyimpan file.class (hasil compile).

Cara compile:
```sh
ryan@dmachine:~/belajar-java-endy/2.helloworld$ javac src/helloworld.java -d bin/
```
-d artinya destination

Cara run:

```sh
ryan@dmachine:~/belajar-java-endy/2.helloworld$ java helloworld
Error: Could not find or load main class bin.helloworld
```

hasilnya error, karna CLASSPATH default nya adalah:
- check di github Pak Endy Muhardin

jadi cara run dengan menggunakan command berikut:
```sh
ryan@dmachine:~/belajar-java-endy/2.helloworld$ java -cp bin helloworld
helloworld
ryan@dmachine:~/belajar-java-endy/2.helloworld$ java helloworld
Error: Could not find or load main class helloworld
```
tapi gak permanent, kalo di run dengan keyword java helloworld, hasilnya error lagi


atau carau ke dua:
```sh
ryan@dmachine:~/belajar-java-endy/2.helloworld$ export CLASSPATH=bin
ryan@dmachine:~/belajar-java-endy/2.helloworld$ java helloworld
helloworld
```
ini agak permanent, bisa di run dengan keyword java helloworld langsung bisa, tapi hanya untuk satu terminal
