
public class programista extends pracownik {
    private String jezykProgramowania;

    public programista(String imie, double pensja, String jezykProgramowania) {
        super(imie, pensja);
        this.jezykProgramowania = jezykProgramowania;
    }

    @Override
    public void wypiszInfo() {
        System.out.println("Programista: " + imie + ", pensja: " + pensja +
                ", język: " + jezykProgramowania);
    }
}

