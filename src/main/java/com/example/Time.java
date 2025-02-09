package com.example;
import java.util.HashMap;

/**
* La classe rappresenta e gestisce dati di tipo temporale
*/
public class Time {
    /**
    * @param ore Numero di ore dell'oggetto Time
    * @param minuti Numero di minuti dell'oggetto Time
    * @param secondi Numero di secondi dell'oggetto Time
    */
    protected int ore;
    protected int minuti;
    protected int secondi;



    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * Vengono distribuite in automatico i secondi tra le ore, minuti e secondi.
     * Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     * @param secondi Secondi da assegnare al nuovo oggetto
    */
    public Time(int secondi){
        HashMap tempo = normalizzaSecondi(secondi);
        this.ore = (int) tempo.get("ore");
        this.minuti = (int) tempo.get("minuti");
        this.secondi = (int) tempo.get("secondi");
    }

    public Time(int ore, int minuti, int secondi){

    }

    public int getOre(){

    }

    /**
     * Restituisce il numero di minuti
     * @return Il numero di minuti dell'oggetto Time
     */
    public int getMinuti(){
        return this.minuti;
    }

    public int getSecondi(){

    }

    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore){
        this.ore = ore;
    }

    public void setMinuti(int minuti){

    }

    /**
     * @deprecated
     * @param secondi
     */
    public void setSecondi(int secondi){
        this.secondi = secondi;
    }

    /**
     * Vengono addizionati il numero di secondi specificati. Il tempo viene normalizzato in automatico.
     * @param secondi Numero di secondi da aggiungere
     */
    public void addSecondi(int secondi){
        secondi += this.convertiSecondi();
        HashMap tempo = normalizzaSecondi(secondi);
        this.setSecondi((int)tempo.get("secondi"));
        this.setMinuti((int)tempo.get("minuti"));
        this.setOre((int)tempo.get("ore"));
    }

    public int convertiSecondi(){

    }

    @Override
    public String toString() {

    }

    private HashMap normalizzaSecondi(int secondi){
        if(secondi < 0 || secondi > 86399) throw new IllegalArgumentException();
        HashMap tempo = new HashMap();
        this.ore = secondi / 3600;
        this.minuti = (secondi % 3600) / 60;
        this.secondi = secondi % 60;
        tempo.put("ore", this.ore);
        tempo.put("minuti", this.minuti);
        tempo.put("secondi", this.secondi);
        return tempo;
    }
}
