package com.company;

public class rosliny {
    public String rasa;
    public  Double cena;
    static Double ryz_cena = 16.0;
    static Double jablko_cena = 36.0;
    static Double gruszka_cena = 19.0;
    static Double sliwka_cena = 25.0;
    static Double malina_cena = 28.0;
    static Double truskawka_cena = 48.0;
    static Double ziemiak_cena = 50.0;




    public void  rosliny_na_farme(String rasa){
        this.rasa=rasa;
        if (rasa == "ryz") {this.cena = ryz_cena;}
        if (rasa == "jabłko") {this.cena = jablko_cena;}
        if (rasa == "gruszka") {this.cena = gruszka_cena;}
        if (rasa == "sliwka") {this.cena = sliwka_cena;}
        if (rasa == "mailna") {this.cena = malina_cena;}
        if (rasa == "truskawka") {this.cena = truskawka_cena;}
        if (rasa == "ziemiak") {this.cena = ziemiak_cena;}}


    String[] spis_roslin_do_zakupu = new String[]{
            "ryz","jabłko","gruszka","sliwka","malina","truskawka","ziemiak"};

    public void setSpis_roslin_do_zakupu(String[] spis_zwierzakow) {
        this.spis_roslin_do_zakupu = spis_zwierzakow;}
    public String[] getSpis_roslin_do_zakupu() {return spis_roslin_do_zakupu;}

}
