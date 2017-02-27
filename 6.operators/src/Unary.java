package com.ryanrianto.operators.contoh3;

public class Unary {
  public static void main(String[] args) {
    int hasil = +1;
    System.out.println(hasil);

    hasil--;
    System.out.println(hasil);

    hasil++;
    System.out.println(hasil);

    hasil = -hasil;
    System.out.println(hasil);

    boolean berhasil = false;
    System.out.println(berhasil);
    System.out.println(!berhasil);
  }
}
