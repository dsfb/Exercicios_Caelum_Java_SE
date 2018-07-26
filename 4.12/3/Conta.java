class Conta {
  double saldo;
  // seus outros atributos e métodos
  String titular;
  int numero;
  String agencia;
  String dataDeAbertura;
  
  void saca(double valor) {
    // o que fazer aqui dentro?
    this.saldo -= valor;
  }  
  
  void deposita(double valor) {
    // o que fazer aqui dentro?
    this.saldo += valor;
  }
  
  double calculaRendimento() {
    // o que fazer aqui dentro?
    return this.saldo * 0.1;
  }
  
  String recuperaDadosParaImpressao() {
    String dados = "Titular: " + this.titular;
    dados += "\nNumero: " + this.numero;
    // imprimir aqui os outros atributos...
    // também pode imprimir this.calculaRendimento()
    dados += "\nAgencia: " + this.agencia;
    dados += "\nData de Abertura: " + this.dataDeAbertura;
    dados += "\nSaldo Atual: " + this.saldo;
    dados += "\nRendimento Mensal: " + this.calculaRendimento();
    return dados;
  }
}