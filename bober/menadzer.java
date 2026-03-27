// Klasa pochodna Menadżer
public class menadzer extends pracownik {
    private double premia;

    public menadzer(String imie, double pensja, double premia) {
        super(imie, pensja);
        this.premia = premia;
    }

    @Override
    public void wypiszInfo() {
        System.out.println("Menadżer: " + imie + ", pensja: " + pensja +
                ", premia: " + premia);
    }
}

