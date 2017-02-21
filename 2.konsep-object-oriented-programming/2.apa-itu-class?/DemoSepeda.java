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
