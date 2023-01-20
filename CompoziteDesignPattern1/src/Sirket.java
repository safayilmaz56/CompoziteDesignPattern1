public abstract class Sirket { //component yapısı
    protected String isim;
    protected Bolum departman;

    public Sirket(String isim, Bolum departman) {
        this.isim = isim;
        this.departman = departman;
    }
    public abstract void ekle(Sirket sirket);
    public abstract void sil(Sirket sirket);
    public abstract void yazdir(int satirbasi);
}
