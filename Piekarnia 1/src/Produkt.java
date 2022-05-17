import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;

public class Produkt {
    String nazwa;
    List<Składnik> listaSkładników = new LinkedList<Składnik>();

    public void addSkladnik(Składnik s)
    {
        listaSkładników.add(s);
    }
    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getListaSkładników() {
        String lista="";
        for (Składnik e:listaSkładników
             ) {
            lista=lista+e.getNazwa()+ " ";
            lista=lista+e.getIlosc();
        }

        return lista;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setListaSkładników(List<Składnik> listaSkładników) {

        this.listaSkładników = listaSkładników;
    }
    public List<Składnik> getListaSkł() {
        return this.listaSkładników;
    }

    public void usunSkladnik(String nazwa)
    {
        try{
        System.out.println("Usuwam składnik "+ nazwa);
        int i=0;
        for (Składnik e:listaSkładników) {
            if (e.getNazwa().equals(nazwa))
            {
                System.out.println("Usuwam składnik "+listaSkładników.get(i).getNazwa());
                listaSkładników.remove(i);
            }
            i++;
        }}

        catch(ConcurrentModificationException e )
            {
                System.out.println("Nie da się");
            }
    }



}


