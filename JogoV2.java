import java.util.Random;
public class JogoV2 {
  public static void main (String [] abc) {
    var p1 = new Personagem();
    var p2 = new Personagem();
    var gerador = new Random();
    p1.nome = "Cleython";
    p2.nome = "Jorge ";
    while(true) {
      //1: caçar, 2: comer, 3: dormir 
      //3 - 17 
      var acaoP1 = gerador.nextInt(3) + 1;
      switch(acaoP1) {
        case 1:
          p1.cacar();

        case 2:
          p1.comer();

        case 3:
          p1.dormir();
      }
      
    }
}

}