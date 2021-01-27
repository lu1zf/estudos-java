class Entrada {

  public static void main(String[] args) {
  
    int idade = 15;
    boolean amigoDoDono = false;
    
    if (idade < 18 && !amigoDoDono) {
      System.out.println("Você não pode entrar!");
    }  else {
      System.out.println("Você pode entrar");
    }
    
    int mes = 1;
    
    if (mes == 1) {
      System.out.println("Você deveria estar de férias!");
    }
    
    int i = 0;
    
    while (i < 10) {
        System.out.println(i);
        i = i + 1;
    }
    
    int x = 20;
    int y = 100;
    for (int j = x; j < y; j++) {
    
      if (j % 19 == 0) {
        System.out.println("Achei um número divisível por 19 entre x e y:" + j);
        break;
      }
      
    }
    
    for (int k = 0; k < 100; k++) {
    
      if (k > 50 && k < 60) {
        continue;
      }
      
      System.out.println(k);
    }
    
  }
}
