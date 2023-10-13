import java.util.Scanner;

public class Prostokat {
    private double a,b,pole;
    public void prostokat()
    {




    }
    public void czytaj_dane(){


        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("podaj 1 bok");
        a = myObj1.nextDouble();
        System.out.println("podaj 2 bok");
        b = myObj2.nextDouble();


    }

    public void przetworz_dane(){
        pole = a * b;
    }
    public void wyswietl_wynik(){
        System.out.println("Pole prostokąta wynosi " + pole);
    }
}
