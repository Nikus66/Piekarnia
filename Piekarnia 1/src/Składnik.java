public class Składnik {
    String nazwa;   //dostep do skladników jest package
    int ilosc;  //w gramach

    public Składnik(String nazwa, int ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String toString()
    {
        return nazwa+" " +String.valueOf(ilosc);
    }
}

//https://www.youtube.com/watch?v=lRupi3iJmzk