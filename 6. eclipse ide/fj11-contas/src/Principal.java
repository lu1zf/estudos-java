
public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100.0);

		conta.setTitular("Luiz");
		conta.setAgencia("nubank-0001");
		
		System.out.println(conta.imprimeInfos());
	}
}
