import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Prostokat prostokat1 = new Prostokat();
        prostokat1.czytaj_dane();
        prostokat1.przetworz_dane();
        prostokat1.wyswietl_wynik();
    }
}
