import java.util.Random;
public class JogoV2 {
  public static void main (String [] abc) throws Exceptions {
    var p1 = new Personagem(5,10,2);
    var p2 = new Personagem(1,3,10);
    var p3 = new Personagem();
    var gerador = new Random();
    p1.nome = "Cleython";
    p2.nome = "Jorge ";
    while(true) {
      //1: caçar, 2: comer, 3: dormir 
      //3 - 17 
      var acaoP1 = gerador.nextInt(3) + 1;
      //fall 
      switch(acaoP1) {
        case 1:
          p1.cacar();
          break;

        case 2:
          p1.comer();
          break;

        case 3:
          p1.dormir();
          break;
      }

      System.out.println(p1);
      System.out.println("*****************************");
      Thread.sleep(5000);
      
    }
}

}