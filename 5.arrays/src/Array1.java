package com.ryanrianto.belajararray.contoh1;

public class Array1 {
  public static void main(String[] args) {

    //mendeklarasikan sebuah array dengan nama contohArray dan bertipe integer
    int [] contohArray;

    //mengalokasikan memory/tempat untuk 10 index array integer
    contohArray = new int[10];

    //mendeklarasikan array
    contohArray[0] = 100;
    contohArray[1] = 200;
    contohArray[2] = 300;
    contohArray[3] = 400;
    contohArray[4] = 500;
    contohArray[5] = 600;
    contohArray[6] = 700;
    contohArray[7] = 800;
    contohArray[8] = 900;
    contohArray[9] = 900;
    System.out.println("Contoh Array Pertama");
    System.out.println("Element di index 0: "+contohArray[0]);
    System.out.println("Element di index 1: "+contohArray[1]);
    System.out.println("Element di index 2: "+contohArray[2]);
    System.out.println("Element di index 3: "+contohArray[3]);
    System.out.println("Element di index 4: "+contohArray[4]);
    System.out.println("Element di index 5: "+contohArray[5]);
    System.out.println("Element di index 6: "+contohArray[6]);
    System.out.println("Element di index 7: "+contohArray[7]);
    System.out.println("Element di index 8: "+contohArray[8]);
    System.out.println("Element di index 9: "+contohArray[9]);
    System.out.println("=====================================");

    int[] contohArray2 = {
      10,20,30
    };

    System.out.println("Contoh Array Ke 2");
    System.out.println("Element di index 0: "+contohArray2[0]);
    System.out.println("Element di index 1: "+contohArray2[1]);
    System.out.println("Element di index 2: "+contohArray2[2]);
    System.out.println("====================================");

    String[] contohArray3 = {
      "Abu Bakar", "Umar", "Utsman"
    };

    System.out.println("Contoh Array Ke 3");
    System.out.println("Element di index 0: "+contohArray3[0]);
    System.out.println("Element di index 1: "+contohArray3[1]);
    System.out.println("Element di index 2: "+contohArray3[2]);

  }
}
