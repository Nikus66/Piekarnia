import javax.swing.*;
import javax.swing.text.*;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class ZamawianeSkladniki {
    List<Zamowienie> listaSkładników = new LinkedList<Zamowienie>();

    public ZamawianeSkladniki() {
    }

   void dodajSkladnik(Składnik nowy, int ilosc)
    {
        for (Zamowienie s: listaSkładników)
        {
           if(s.getNazwa().equals(nowy.getNazwa()))
           {
               s.dodajIlosc(ilosc);
               System.out.println("Składnik istniejący: "+ s.getNazwa()+" "+ ilosc+ " ilosc koncowa" + s.getIloscKoncowa());
               return;
           }
        }
        listaSkładników.add(new Zamowienie(nowy, ilosc));
        System.out.println("Składnik nowy: "+ nowy.getNazwa()+ " " +ilosc+ " ilosc koncowa" + listaSkładników.get(listaSkładników.size()-1).getIloscKoncowa());
    }
    void dodajProduk(Produkt p, int ilosc)
    {
        System.out.println("W metodzie dodoaj produkt "+p.getListaSkł().size());
        for(Składnik s: p.listaSkładników)
        {
            dodajSkladnik(s, ilosc*s.getIlosc());
            System.out.println("W dodaj produkt "+ s.getNazwa()+" "+ilosc);
        }
    }
    void pisz()
    {
        System.out.println("Zamawiane składniki");
        for (Zamowienie s : listaSkładników)
        {
            System.out.println(s.getNazwa() + "" + s.getIloscKoncowa() );
        }
    }
    void saveToFile()
    {

        try {

            PrintWriter out= new PrintWriter("Zamowienie.txt");
            // Write the name of four oceans to the file
            out.println("Zamawiane sładniki: " );
            for (Zamowienie s : listaSkładników) {
                out.print("Składnik: ");
                if(s.getIloscKoncowa()>1000)
                {
                    int ilekg= s.getIloscKoncowa()/1000;
                    out.println(s.getNazwa() + " ilosć:  " + ilekg+"kg " +(s.getIloscKoncowa()-(ilekg*1000))+"g");

                }
                else
                    out.println(s.getNazwa() + " ilosć:  " + s.getIloscKoncowa()+"g");
            }
            out.close();
            JOptionPane.showMessageDialog(null, "Dane zapisane do pliku Zamówienie.txt");
        }catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Błąd zapisu pliku");
            System.out.println("Błąd zapisu pliku");
        }

    }
    void czyscZamownie()
    {
        for(int i=0; i< listaSkładników.size(); i++)
            listaSkładników.remove(i);
    }
}
