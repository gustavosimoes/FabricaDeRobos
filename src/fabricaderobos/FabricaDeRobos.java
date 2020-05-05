package fabricaderobos;

public class FabricaDeRobos {

    public static void main(String[] args) {

        Robo r1 = new Robo(true);

        r1.corpo.setTipo("Pernas");
        r1.corpo.setCor("Azul");
        r1.processador.setMarca("Intel");
        r1.processador.setFrequenciaProcessamento(750);

        System.out.println("\nRobo r1");
        r1.mostraConfigRobo();

        Robo r2 = new Robo(true);

        r2.corpo.setTipo("Rodas");
        r2.corpo.setCor("Verde");
        r2.processador.setMarca("AMD");
        r2.processador.setFrequenciaProcessamento(500);

        System.out.println("\nRobo r2");
        r2.mostraConfigRobo();

        Robo r3 = new Robo(false);

        r3.corpo.setTipo("Pernas");
        r3.corpo.setCor("Azul");

        System.out.println("\nRobo r3");
        r3.mostraConfigRobo();

    }

}
