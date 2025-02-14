package com.example;

public class Time {
    protected int ore;
    protected int minuti;
    protected int secondi;

    public Time(int secondi){

    }

    public Time(int ore, int minuti, int secondi){
        if(minuti > 60 || secondi > 60){
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        }else{
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;
        }

    }

    public int getOre(){
        return ore;

    }

    public int getMinuti(){

    }
    public int getSecondi(){
        return secondi;

    }

    public void setOre(int ore){

    }

    @Deprecated
    public void setMinuti(int minuti){ 
        this.minuti = minuti;

    }
    public void setSecondi(int secondi){

    }

    public void addSecondi(int secondi){

    }

    public int convertiSecondi(){
        return getOre()*3600 + getMinuti()*60 + getSecondi();

    }

    @Override
    public String toString() {
        return getOre() + ":" + getMinuti() + ":" + getSecondi();
    }
}
