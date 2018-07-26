class Exercicio3141 {
  public static void main(String[] args) {
    long primeiro = 0, segundo = 1;
    int indice = 2;
    short vez = 1;
    
    while (indice <= 100) {
      indice++;
      if (vez == 1) {
        primeiro += segundo;
        System.out.println("indice: " + indice + " = " + primeiro);
        vez = 2;
      } else {
        segundo += primeiro;
        System.out.println("indice: " + indice + " = " + segundo);
        vez = 1;
      }      
    }
  }
}