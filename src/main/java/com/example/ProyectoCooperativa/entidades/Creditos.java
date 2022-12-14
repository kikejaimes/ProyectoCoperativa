package com.example.ProyectoCooperativa.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Creditos {
    @Id
    private int codigo_Linea;
    @Column(name="monto_prestado",nullable = false,length = 30)
    private int montoPrestado;
    @Column(name="plazo_prestado",nullable = false)
    private int plazoPrestado;
    @Column(name ="fecha_desembolso",nullable = false)
    private Date fechaDesembolso;

    @ManyToOne
    @JoinColumn(name = "documento_Cliente")
    Cliente cli;

    @ManyToOne
    @JoinColumn(name="codigo")
    LineasDeCredito lc;

    public Creditos(int codigo_Linea, int montoPrestado, int plazoPrestado, Date fechaDesembolso, Cliente cli, LineasDeCredito lc) {
        this.codigo_Linea = codigo_Linea;
        this.montoPrestado = montoPrestado;
        this.plazoPrestado = plazoPrestado;
        this.fechaDesembolso = fechaDesembolso;
        this.cli = cli;
        this.lc = lc;
    }

}
    public Creditos(){

    }

    public int getCodigo_Linea() {
        return codigo_Linea;
    }

    public void setCodigo_Linea(int codigo_Linea) {
        this.codigo_Linea = codigo_Linea;
    }

    public int getMontoPrestado() {
        return montoPrestado;
    }

    public void setMontoPrestado(int montoPrestado) {
        this.montoPrestado = montoPrestado;
    }

    public int getPlazoPrestado() {
        return plazoPrestado;
    }

    public void setPlazoPrestado(int plazoPrestado) {
        this.plazoPrestado = plazoPrestado;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LineasDeCredito getLc() {
        return lc;
    }

    public void setLc(LineasDeCredito lc) {
        this.lc = lc;
    }
}
