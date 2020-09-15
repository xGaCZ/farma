package com.company;

public class animal {
    public String rasa;
    public  Double cena;
    static Double pies_cena = 160.0;
    static Double osiol_cena = 360.0;
    static Double kon_cena = 190.0;
    static Double swinia_cena = 250.0;
    static Double krowa_cena = 450.0;
    static Double owca_cena = 360.0;




        public void  zwierzaki(String rasa){
        this.rasa=rasa;
            if (rasa == "osioł") {this.cena = osiol_cena;}
            if (rasa == "kon") {this.cena = kon_cena;}
            if (rasa == "swinia") {this.cena = swinia_cena;}
            if (rasa == "krwoa") {this.cena = krowa_cena;}
            if (rasa == "owca") {this.cena = owca_cena;}
            if (rasa == "pies") {this.cena = pies_cena;}}


    String[] spis_zwierzakow = new String[]{
            "osioł","kon","swiania","krwoa","owca","pies"};

    public void setSpis_zwierzakow(String[] spis_zwierzakow) {
        this.spis_zwierzakow = spis_zwierzakow;}
    public String[] getSpis_zwierzakow() {return spis_zwierzakow;}
}