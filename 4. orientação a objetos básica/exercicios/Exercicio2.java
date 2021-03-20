class Conta {
	Data dataDeAbertura = new Data();
	String titular, agencia;
	int numero;
	double saldo;

	boolean saca(double valor) {
		if (valor <= this.saldo){
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();

		return dados;

	}

}

class Data {
	int dia, mes, ano;

	String formatada() {

		String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;

		return dataFormatada;
	}
}

class Exercicio2 {
	public static void main(String args[]){
		Conta minhaConta = new Conta();

		minhaConta.deposita(200);

		minhaConta.recuperaDadosParaImpressao();

		minhaConta.saca(100);

		minhaConta.titular = "Luiz";

		minhaConta.numero = 19823719;

		minhaConta.dataDeAbertura.dia = 20;
		minhaConta.dataDeAbertura.mes = 03;
		minhaConta.dataDeAbertura.ano = 2021;

		System.out.println(minhaConta.recuperaDadosParaImpressao());
		
	}
}