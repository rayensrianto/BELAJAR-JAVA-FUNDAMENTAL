class Kendaraan {
  String warna;
  int kecepatan;
  int berat;

  void cetakSpekKendaraan() {
    System.out.println("Warna: "+warna);
    System.out.println("Kecepatan: "+kecepatan+" kmh");
    System.out.println("Ukuran: "+berat+" kg");
  }
}

class Mobil extends Kendaraan {
  int cc;
  int gears;

  void cetakSpekMobil() {
    System.out.println("Warna Mobil : "+warna);
    System.out.println("Kecepatan Mobil : "+kecepatan+" kmh");
    System.out.println("Ukuran Mobil: "+berat+" kg");
    System.out.println("CC Mobil: "+cc);
    System.out.println("Gigi Mobil: "+gears);
  }
}

class ContohInheritance {
  public static void main(String [] args) {
    Mobil avanza = new Mobil();
    avanza.warna = "Putih";
    avanza.kecepatan = 150;
    avanza.berat = 540;
    avanza.cc = 180;
    avanza.gears = 6;
    avanza.cetakSpekMobil();

  }
}
