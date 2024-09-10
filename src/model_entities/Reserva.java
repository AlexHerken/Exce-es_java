package model_entities;

import java.util.Date;

public class Reserva {

    private Integer numero;
    private Date dataEntrada;
    private Date dataSaida;

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



}
