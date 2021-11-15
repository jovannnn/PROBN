package com.company;

public class Fakultet {
    public String nazivFakultet;
    public int brojNaSmerovi;
    public int brojNaStudenti;
    public String dekan;
    public String sediste;

    public void PrvMetod(){
        System.out.println("Zgolemena vrednost na studenti:"+" "+(this.brojNaStudenti+50));
    }
    public int VtorMetod(int namali){
        System.out.println("Namalena vrednost:"+" "+(this.brojNaStudenti-namali));
        return namali;
    }
    public void TretMetod(){
        System.out.println("Sediste:"+" "+sediste);
        System.out.println("Dekan:"+" "+dekan);
    }
}
