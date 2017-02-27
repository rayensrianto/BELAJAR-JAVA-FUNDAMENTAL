package com.ryanrianto.belajararray.contoh2;

//array multidimensi

public class Array2 {
  public static void main(String[] args) {

    String [][] nama = {
      {"Bapak ", "Ibu ", "Saudara "},
      {"Abdullah", "Ali", "Aminah"}
    };

    System.out.println(nama[0][0] + nama[1][0]);
    System.out.println(nama[0][1] + nama[1][2]);
    System.out.println(nama[0][2] + nama[1][1]);

    //printout
    //Bapak Abdullah
    //Ibu Aminah
    //Saudara Ali

  }
}
