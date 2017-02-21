interface Remote {
  public void tombolOn();
  void tombolOff();
}

class RemoteTv implements Remote {
  public void tombolOn() {
    System.out.println("Tv menyala");
  }
  public void tombolOff() {
    System.out.println("Tv mati");
  }
}

class RemoteAc implements Remote {
  public void tombolOn() {
    System.out.println("AC menyala");
  }
  public void tombolOff() {
    System.out.println("AC mati");
  }
}

class Contoh2 {
  public static void main(String[] args) {
    RemoteTv Sharp = new RemoteTv();
    Sharp.tombolOn();

    RemoteAc LG = new RemoteAc();
    LG.tombolOff();
  }


}
