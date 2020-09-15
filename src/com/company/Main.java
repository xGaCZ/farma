package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);

        int rok = 2020;
        int tydzien = 1;
        System.out.println("Witaj w symulatorze bycia rolnikiem!!!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("ZASADY SĄ PROSTE ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Zaczynasz mając tylko 16k PLN \nMożesz kupować zwierzęta ziemie nasiona ziemia jest w hektarach\nCeny oraz wydajność są podane za hektar lub równowartośc w plonach za hektar ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("JESLI CHCESZ ZACZĄĆ WCIŚNIJ ENTER");
        System.in.read();

        System.out.println("Dziś mamy: " + tydzien + " Tydzień " + rok + " Roku.");
       Scanner in = new Scanner(System.in);
    }
}