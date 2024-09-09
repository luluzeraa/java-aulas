package br.sesi.lhltb.poo.cabeca;

public class Cabeca {
    public Olho olho;
    public Orelha orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca() {
        olho = new Olho();
        orelhao = new Orelha();
        nariz = new Nariz();
        boca = new Boca();
    }
}
