package com.company;

public class PC {
    public int memorija;
    public String tipMemorija;
    public int hardDisk;
    public String golemina="GB";

    public PC(){
        this.memorija=2;
        this.tipMemorija="DDR2";
        this.hardDisk=160;
    }
    public void Vrti(int zgolemiMemorija, int novHardDisk){
        System.out.println("Memorijata beshe:"+" "+this.memorija+golemina+","+"sega iznesuva:"+zgolemiMemorija+golemina);
        System.out.println("Tipot na memorijata e:"+" "+tipMemorija);
        System.out.println("HD ima golemina od:"+" "+novHardDisk+golemina+" "+"prethodno iznesuvashe"+" "+hardDisk+golemina);
    }
}
