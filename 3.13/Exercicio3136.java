class Exercicio3136 {
  public static void main(String args[]) {
    long primeiro = 0, segundo = 1;
    long troca;
    int indice = 2;
    
    System.out.println("indice: 1 = " + primeiro);
    System.out.println("indice: 2 = " + segundo);
    while (indice <= 100) {
      troca = primeiro + segundo;
      indice++;
      System.out.println("indice: " + indice + " = " + troca);
      primeiro = segundo;
      segundo = troca;      
    }
  }
}