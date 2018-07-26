public class BalancoTrimestral {
  public static void main(String[] args) {
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000, gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    int mediaMensal = gastosTrimestre / 3;
    System.out.println("gastos no trimestre = " + gastosTrimestre);
    System.out.println("Valor da média mensal = " + mediaMensal);
  }
}