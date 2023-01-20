public class Yazilim extends Sirket{ //leaf yapısı


    public Yazilim(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket sirket) {

    }

    @Override
    public void sil(Sirket sirket) {

    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println(isim + " - "+ departman);
    }
}
