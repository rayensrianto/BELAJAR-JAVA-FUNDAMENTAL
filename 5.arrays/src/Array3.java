package com.ryanrianto.belajararray.contoh3;

//coppy array

public class Array3 {
  public static void main(String[] args) {
    char[] master = {
      'd', 'e', 'b', 'e', 'l', 'a', 'j','a', 'r', 'a', 't', 'e', 'd'
    };

    char[] copy1 = new char[7];

    System.arraycopy(master, 2, copy1, 0, 7);
    System.out.println(new String(copy1));
  }
}
