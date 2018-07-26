class Exercicio3141 {
  public static void main(String[] args) {
    long primeiro = 0, segundo = 1;
    int indice = 2;
    
    while (indice <= 100) {
      indice++;
      if (primeiro <= segundo) {
        primeiro += segundo;
        System.out.println("indice: " + indice + " = " + primeiro);
      } else {
        segundo += primeiro;
        System.out.println("indice: " + indice + " = " + segundo);
      }      
    }
  }
}