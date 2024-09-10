package model_entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numero;
    private Date dataEntrada;
    private Date dataSaida;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numero, Date dataEntrada, Date dataSaida) {
        this.numero = numero;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public long duracao() {
        long diferenca = dataSaida.getTime()  - dataEntrada.getTime();

        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); // converte milissegundos em dias
    }

    public void atualizaData(Date dataEntrada, Date dataSaida){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString(){
        return String.format("Quarto "
                + numero
                + ", Entrada: "
                + getDataEntrada()
                + "Saida: "
                + sdf.format(dataSaida)
                + ", "
                + duracao()
                + " noites");
    }

}
