public class Main {
  public static void main(String[] args) {
      Time timeA = new Time("Kansas City Chiefs");
      
      Quarterback quarterback1 = new Quarterback("Patrick Mahomes", 28);
      RunningBack runningBack1 = new RunningBack("Isiah Pacheco", 24);
      WideReceiver wideReceiver1 = new WideReceiver("Kadarius Toney", 24);
      
      timeA.adicionarJogador(quarterback1);
      timeA.adicionarJogador(runningBack1);
      timeA.adicionarJogador(wideReceiver1);
      
      timeA.realizarTreinamento();
      
      quarterback1.lançarPasse();
      runningBack1.correrJardas(20);
      wideReceiver1.receberPasse();
  }
}
