package com.company;

    public class budynki {
        public String nazwa;
        public double cena;

        public budynki(String nazwa, double cena) {
            this.nazwa = nazwa;
            this.cena = cena;}


    public String toString() {
        return " Nazwa: " + this.nazwa + " Cena: " + this.cena;
    }

    String[] buildings = new String[] {
            "POle",
            "stodoła",};
}