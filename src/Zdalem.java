import java.time.LocalDate;

public class Zdalem extends NaPewnoZdam{

    private LocalDate dataZdania;
    public Zdalem(String nazwaPrzedmiotu, int przewidywanaOcena, String nazwiskoNauczyciela, int dataZdania) {
        super(nazwaPrzedmiotu, przewidywanaOcena, nazwiskoNauczyciela);
        this.dataZdania = LocalDate.ofEpochDay(dataZdania);
    }
}
