public class Personagem {
  String nome;
  int energia;
  int fome;
  int sono;
  
  //metodo de efeito colateral
  //metodo de produção de valor 
  void cacar() {
    System.out.println("Caçando.. ");

  }
  void comer() {
    System.out.printf("Comendo...\n");
  }

  void dormir() {
    System.out.println("Dormindo...");
  }

}