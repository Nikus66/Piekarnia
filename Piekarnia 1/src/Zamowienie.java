import java.util.LinkedList;
import java.util.List;

//Zamowienie dla pojedynczego składnika
public class Zamowienie {
    Składnik s;
    int ilosckoncowa;
    int iloscSztuk;

    public Zamowienie(Składnik s, int ilosc) {
        this.s = s;
        this.ilosckoncowa = ilosc;
    }
    public Zamowienie(Składnik s, int ilosc, int iloscSztuk) {
        this.s = s;
        this.ilosckoncowa = ilosc;
        this.iloscSztuk=iloscSztuk;
    }

    public Zamowienie(Składnik s) {
        this.s = s;
    }
    public void dodajIlosc(int ilosc)
    {
        this.ilosckoncowa+=ilosc;
    }
    public String getNazwa()
    {
        return s.getNazwa();
    }
    public int getIloscKoncowa()
    {
        return ilosckoncowa;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }
}
