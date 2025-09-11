public class JogoV1 {
  static public void main(String... args) { //varargs
  //java 10+
  //operador de inferencia de tipo
    var p1 = new Personagem();
     
     p1.nome = "Charles";
     p1.cacar();
     p1.comer();
     p1.dormir();

  }



}