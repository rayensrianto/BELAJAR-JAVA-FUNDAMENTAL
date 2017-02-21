interface Band {
  public void genreBand();
}

class Rock  implements Band {
  public void genreBand() {
    System.out.println("Band beraliran rock");
  }
}

class Pop implements Band {
  public void genreBand() {
    System.out.println("Band berlaliran pop");
  }
}

public class Contoh1 {
  public static void main(String[] args) {
    Rock Boomerang = new Rock();
    Pop Peterpan = new Pop();

    Boomerang.genreBand();
    Peterpan.genreBand();
  }
}
