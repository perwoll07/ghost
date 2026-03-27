
public class pracownik {
    protected String imie;
    protected double pensja;

    public pracownik(String imie, double pensja) {
        this.imie = imie;
        this.pensja = pensja;
    }

    public void wypiszInfo() {
        System.out.println("Pracownik: " + imie + ", pensja: " + pensja);
    }
}

