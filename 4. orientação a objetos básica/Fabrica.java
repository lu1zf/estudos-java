class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;

	void liga(){
		System.out.println("O carro ligou");
	}

	void acelera(double quantidade){
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	int getMarcha(){
		if (this.velocidadeAtual < 0){
			return -1;
		} else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
			return 1;
		} else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
			return 2;
		} else {
			return 3;
		}
	}
}

class Fabrica{
	public static void main (String[] args){
		Carro meuCarro = new Carro();

		meuCarro.cor = "Azul";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;

		meuCarro.liga();

		meuCarro.acelera(40);

		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.getMarcha());
	}
}