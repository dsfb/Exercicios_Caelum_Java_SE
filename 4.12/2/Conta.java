class Conta {
  double saldo;
  String titular;
  int numero;
  String agencia;  
  String dataDeAbertura;
  
  void saca(double valor) {
    this.saldo -= valor;
  }
  
  void deposita(double valor) {
    this.saldo += valor;
  }
  
  double calculaRendimento() {
    return saldo * 0.1;
  }
}