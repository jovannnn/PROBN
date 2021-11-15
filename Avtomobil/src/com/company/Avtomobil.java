package com.company;

public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public int pominatiKm;
    public int GodinaNaProizvodstvo;
    public int registracija;

    public Avtomobil(String marka,String model,String boja,int pominatiKm,int GodinaNaProizvodstvo,int registracija){
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.pominatiKm=pominatiKm;
        this.GodinaNaProizvodstvo=GodinaNaProizvodstvo;
        this.registracija=registracija;
    }
    public void Pecati(){
        System.out.println(this.marka+" ," +","+this.model+","+this.boja);
    }
    public double Vrati(){
        double pominati;
        pominati=this.pominatiKm+1520.25;
        System.out.println("Kilometri pominati:"+" "+pominati);
        return pominati;
    }
}
