public class Personagem {
  String nome;
  int energia = 10;
  int fome = 0;
  int sono = 0;

  
  //metodo de efeito colateral
  //metodo de produção de valor 
  void cacar() {
    if(energia >= 2) {
      System.out.println(nome + "Caçando...");
      energia -= 2; //energia = energia - 2;

    }
    else {
      System.out.println(nome + " senm energia para caçar...");

    }
    fome = Math.min(fome+1,10);
    sono = Math.min(sono + 1,10);
    
  }
  void comer() {
    if(fome>=1) {
      System.out.printf("%s Comendo...\n",nome);
      --fome;
      energia = energia < 10 ? energia + 1 : energia;

    }
    else {
      System.out.printf("%s sem fome..\n",nome);
    }
    
  }

  void dormir() {
    if (this.sono >= 1) {
      System.out.println(nome + "Dormindo...");
      sono -= 1;
      if (energia < 10) {
        energia++;
      }
    }
    
  }

}