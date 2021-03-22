
public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private static int totalDeContas = 0;

	public Conta() {

		Conta.totalDeContas += 1;

		this.numero = Conta.totalDeContas;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Impossível sacar um valor maior que o saldo");
		} else {
			this.saldo -= valor;
		}
	}

	public String imprimeInfos() {
		String dados = "";

		dados += "Número da conta: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAgência: " + this.agencia;

		return dados;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
