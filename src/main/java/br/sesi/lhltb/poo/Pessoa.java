package br.sesi.lhltb.poo;


import br.sesi.lhltb.poo.cabeca.Cabeca;
import br.sesi.lhltb.poo.inferior.MembrosInferiores;
import br.sesi.lhltb.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferiores;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferiores = new MembrosInferiores();

    }
}