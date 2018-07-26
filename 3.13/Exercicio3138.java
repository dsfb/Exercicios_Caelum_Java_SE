class Exercicio3138 {
  public static void main(String[] args) {
    int linha = 1;
    int coluna;
    
    while (linha < 5) {
      for (coluna = 1; coluna <= linha; coluna++) {
        System.out.print(linha * coluna);
        System.out.print(" ");
      }
      System.out.println();
      linha++;
    }
  }
}