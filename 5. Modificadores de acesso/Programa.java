class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private static int totalDeContas = 1;

	Conta (String titular) {
		this.titular = titular;

		this.numero = Conta.totalDeContas;
		Conta.totalDeContas += 1;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo () {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public boolean saca(double valor) {
		
		if (this.saldo < valor){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void deposita(double quantidade) {
		if (quantidade > 0) {
			this.saldo += quantidade;
		} else {
			System.out.println("Impossível depositar um valor negativo.");
		}
	}

	public double getRendimento(){
		return this.saldo * 0.1;
	}

	public boolean transferePara(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false){
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

}

class Programa {
	public static void main(String[] args) {
		String titular = "Luiz";
		Conta minhaConta = new Conta(titular);

		System.out.println(minhaConta.titular);
	}
}