package com.ryanrianto.operators.contoh1;

public class Aritmatika {
  public static void main(String[] args) {

    int hasil = 1+2;
    System.out.println("1 + 2 = "+hasil);
    int hasil_original = hasil;

    hasil = hasil-1;
    System.out.println(hasil_original+" - 1 = " + hasil);
    hasil_original = hasil;

    hasil = hasil * 2;
    System.out.println(hasil_original+" * 2 = " +hasil);
    hasil_original = hasil;

    hasil = hasil / 2;
    System.out.println(hasil_original+" / 2 = "+hasil);
    hasil_original = hasil;

    hasil = hasil + 8;
    System.out.println(hasil_original+" + 8 = "+hasil);
    hasil_original = hasil;

    hasil = hasil % 7;
    System.out.println(hasil_original+" % 7 = "+hasil);


  }
}
