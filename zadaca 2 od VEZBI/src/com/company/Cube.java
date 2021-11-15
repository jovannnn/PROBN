package com.company;

public class Cube {
    public int a;

    public void VolumenNaKocka() {
        int volumen;
        volumen = a * a * a;
        System.out.println("Volumenot na kockata iznesuva:" + volumen);
    }

    public int Plostina(){
        int plostina;
        plostina=(int)(6*(Math.pow(a,2)));
        System.out.println("Plostinata e:"+plostina);
        return plostina;
    }
}
