import java.util.ArrayList;
import java.util.List;

public class Kadro extends Sirket{ //composite yapısı

    private List<Sirket> list = new ArrayList<>();

    public Kadro(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket sirket) {
        list.add(sirket);
    }

    @Override
    public void sil(Sirket sirket) {
        list.remove(sirket);
    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println(isim + " - "+ departman);
        for(Sirket u : list){
            u.yazdir(satirbasi + 2);
        }
    }
}
