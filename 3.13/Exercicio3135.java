class Exercicio3135 {
  public static void main(String[] args) {
    long fatorial = 1;
    for (int n = 1; n <= 30; n++) {
      fatorial *= n;
      System.out.println(n + "! = " + fatorial);
    }
  }
}