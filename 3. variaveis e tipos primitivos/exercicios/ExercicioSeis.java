class ExercicioSeis {
	public static void main (String[] args){
		
		int proximo = 0;
		int anterior = 1;
		int atual = 0;
		
		while(proximo <= 100){
			proximo = atual + anterior;
			System.out.println(proximo+",");
			anterior = atual;
			atual = proximo;
		}

	}
}
