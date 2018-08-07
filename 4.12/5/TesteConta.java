class TesteConta {
  public static void main(String args[]) {
    Conta c1 = new Conta();
    c1.titular = "Hugo";
    c1.saldo = 100;
    
    Conta c2 = c1;
    
    if (c1 == c2) {
      System.out.println("iguais");
    } else {
      System.out.println("diferentes");
    }
  }
}