public class Personagem {
  String nome;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;


  //sobrecarga de construtores (overload)
  //construtor padrão

  Personagem(String nome, int energia, int fome, int sono) {
    this(energia,fome,sono);
    this.nome = nome;
  }

  personagem(String nome) {
    this();
    this.nome = nome;



  }





  Personagem () {
    energia = 10
    fome= 0;
    sono = 0;
  }

  Personagem(int energia, int fome, int sono) {
    if (energia >=0 && energia <=10) {
      this.energia = energia;

    }
    if (fome >=0 && fome <=10) {
      this.fome = fome;

    }
    if(!(sono < 0 || sono > 10)) {
      this.sono = sono; 

    }
    
    

  }

  
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
    fome = Math.min(fome + 1,10);
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
      else {
        System.out.print(nome + " sem sono....\n");
      }
    }
    
  }

  @Override
  public String toString() {
    return String.format("e: %d, f: %d, s: %d",energia,fome,sono);
  }

}
