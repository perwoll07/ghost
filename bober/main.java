import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<pracownik> pracownicy = new ArrayList<>();

        pracownicy.add(new pracownik("Adam", 4000));
        pracownicy.add(new programista("Kasia", 8000, "Java"));
        pracownicy.add(new menadzer("Marek", 10000, 2500));

        for (pracownik p : pracownicy) {
            p.wypiszInfo();
        }
    }
}

