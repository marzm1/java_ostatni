public class NaPewnoZdam {
    private String nazwaPrzedmiotu;
    private int przewidywanaOcena;
    private String nazwiskoNauczyciela;

    public NaPewnoZdam(String nazwaPrzedmiotu, int przewidywanaOcena, String nazwiskoNauczyciela) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.przewidywanaOcena = przewidywanaOcena;
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public int getPrzewidywanaOcena() {
        return przewidywanaOcena;
    }

    public String getNazwiskoNauczyciela() {
        return nazwiskoNauczyciela;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public void setPrzewidywanaOcena(int przewidywanaOcena) {
        this.przewidywanaOcena = przewidywanaOcena;
    }

    public void setNazwiskoNauczyciela(String nazwiskoNauczyciela) {
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    @Override
    public String toString() {
        return "NaPewnoZdam{" +
                "Na pewno znad z '" + nazwaPrzedmiotu + '\'' +
                ", Oczekuje dostać " + przewidywanaOcena +
                nazwiskoNauczyciela + ", Jest najlepszy'"+'\'' +
                '}';
    }

    public void Radosc(String tekst){
        for (int i = 0; i > przewidywanaOcena; i++) {
           System.out.println(tekst);
        }
}


}
