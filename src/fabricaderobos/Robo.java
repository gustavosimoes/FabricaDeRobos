package fabricaderobos;

import java.util.Date;

public class Robo {

    private static long serialNumberGenerator;
    private long serialNumber = 1;
    private final Date dataCriacao;
    Corpo corpo = new Corpo();
    Processador processador;

    public Robo(boolean temProcessador) {
        if (temProcessador) {
            processador = new Processador();
        }
        this.serialNumber = serialNumberGenerator;
        this.serialNumberGenerator++;
        Date data = new Date();
        this.dataCriacao = data;

    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Corpo getCorpo() {
        return corpo;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }

    public void mostraConfigRobo() {
        System.out.println(
                "\nSerial Number: " + serialNumber
                + "\nData de Criação: " + dataCriacao
                + "\nCorpo com: " + corpo.getTipo()
                + "\nCor: " + corpo.getCor());
        
        if (processador != null) {
           System.out.println(
                    "Processador: " + processador.getMarca()
                    + "\nFrequencia de Processamento: " + processador.getFrequenciaProcessamento() + "MHz"
            );
        }
        else System.out.println("Sem Processador");

    }

}
