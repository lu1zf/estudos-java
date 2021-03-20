class Cliente {
	String nome;
	String sobrenome;
	String cpf;
}

class Conta {
	int numero;
	Cliente titular = new Cliente();
	double saldo;

	boolean saca(double valor) {
		
		if (this.saldo < valor){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transferePara(Conta destino, double valor){
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
		Conta minhaConta = new Conta();

		minhaConta.titular.nome = "Luiz";

		System.out.println(minhaConta.titular.nome);

	}
}