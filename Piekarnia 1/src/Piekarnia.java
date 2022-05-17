import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class Piekarnia {
    private JTabbedPane tab_produkty;
    private JPanel panel1;
    private JPanel produkty;
    private JPanel zamowienie;
    private JList<String> listlistaproduktow;
    private JList<String> listaskladników;
    private JLabel lprodukt;
    private JLabel lskladniki;
    private JButton battonDodajSkladnik;
    private JButton buttonUsunSkladnik;
    private JTextField textSkladnikNazwa;
    private JLabel lSkladnikNazwa;
    private JTextField textSkladnikIlosc;
    private JList<String> listaZamowienie;
    private JPanel panelZamowienie;
    private JLabel labelWybierzProdukt;
    private JComboBox<String> comboBoxProdukty;
    private JTextField textFieldIloscProdukt;
    private JLabel labelIloscZamowienie;
    private JPanel panelDodajProduktDoZamowienia;
    private JButton buttonDodajProduktDoZamowienia;
    private JButton buttonDodajProdukt;
    private JTextField textFieldProdukt;
    private JLabel labelProdukt;
    private JButton buttonUsunProdukt;
    private JButton buttonZamownienie;
    private JButton buttonCzyscZamowienie;
    private DefaultListModel<String> listProduktowModel;
    private DefaultListModel<String> listProduktowZamowieniaModel;
    private List<Produkt> listaProduktow = new LinkedList<Produkt>();
    private List<Produkt> listaProduktowZamowienia = new LinkedList<Produkt>();

    ZamawianeSkladniki zamawianeSkladniki;

    public Piekarnia() {
        zamawianeSkladniki = new ZamawianeSkladniki();
        listProduktowModel = new DefaultListModel<String>();
        listlistaproduktow.setModel(listProduktowModel);
        listProduktowModel.addElement("bułka");
        listaProduktow.add(new Produkt("bułka"));
        listaProduktow.get(0).addSkladnik(new Składnik("maka pszenna typ 500", 500));
        listaProduktow.get(0).addSkladnik(new Składnik("margaryna", 20));
        listaProduktow.get(0).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(0).addSkladnik(new Składnik("drozdze", 15));
        listaProduktow.get(0).addSkladnik(new Składnik("cukier", 5));

        listProduktowModel.addElement("Precle");
        listaProduktow.add(new Produkt("precle"));
        listaProduktow.get(1).addSkladnik(new Składnik("maka pszenna typ 500", 200));
        listaProduktow.get(1).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(1).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(1).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(1).addSkladnik(new Składnik("cukier", 5));
        listaProduktow.get(1).addSkladnik(new Składnik("mak", 10));

        listProduktowModel.addElement("bułka weka");
        listaProduktow.add(new Produkt("bułka weka"));
        listaProduktow.get(2).addSkladnik(new Składnik("maka pszenna typ 500", 700));
        listaProduktow.get(2).addSkladnik(new Składnik("margaryna", 30));
        listaProduktow.get(2).addSkladnik(new Składnik("sól", 15));
        listaProduktow.get(2).addSkladnik(new Składnik("drozdze", 15));
        listaProduktow.get(2).addSkladnik(new Składnik("cukier", 5));

        listProduktowModel.addElement("bułka mozzarella");
        listaProduktow.add(new Produkt("bułka mozzarella"));
        listaProduktow.get(3).addSkladnik(new Składnik("maka pszenna typ 500", 500));
        listaProduktow.get(3).addSkladnik(new Składnik("margaryna", 15));
        listaProduktow.get(3).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(3).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(3).addSkladnik(new Składnik("cukier", 5));
        listaProduktow.get(3).addSkladnik(new Składnik("masło", 5));
        listaProduktow.get(3).addSkladnik(new Składnik("mozzarella", 30));
        listaProduktow.get(3).addSkladnik(new Składnik("oregano", 10));

        listProduktowModel.addElement("bułka z orzechami musli");
        listaProduktow.add(new Produkt("bułka z orzechami musli"));
        listaProduktow.get(4).addSkladnik(new Składnik("maka pszenna typ 500", 500));
        listaProduktow.get(4).addSkladnik(new Składnik("margaryna", 15));
        listaProduktow.get(4).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(4).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(4).addSkladnik(new Składnik("cukier", 5));
        listaProduktow.get(4).addSkladnik(new Składnik("mak", 5));
        listaProduktow.get(4).addSkladnik(new Składnik("platki kukurydziane", 20));
        listaProduktow.get(4).addSkladnik(new Składnik("kefir", 15));

        listProduktowModel.addElement("bułka maślana");
        listaProduktow.add(new Produkt("bułka maślana"));
        listaProduktow.get(5).addSkladnik(new Składnik("maka pszenna typ 500", 200));
        listaProduktow.get(5).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(5).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(5).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(5).addSkladnik(new Składnik("cukier", 2));
        listaProduktow.get(5).addSkladnik(new Składnik("masło", 40));

        listProduktowModel.addElement("kajzerka");
        listaProduktow.add(new Produkt("kajzerka"));
        listaProduktow.get(6).addSkladnik(new Składnik("maka pszenna typ 500", 500));
        listaProduktow.get(6).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(6).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(6).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(6).addSkladnik(new Składnik("cukier", 5));
        listaProduktow.get(6).addSkladnik(new Składnik("mak",10));

        listProduktowModel.addElement("bułka hamburgerowa");
        listaProduktow.add(new Produkt("bułka hamburgerowa"));
        listaProduktow.get(7).addSkladnik(new Składnik("maka pszenna typ 500", 400));
        listaProduktow.get(7).addSkladnik(new Składnik("margaryna", 15));
        listaProduktow.get(7).addSkladnik(new Składnik("sól", 15));
        listaProduktow.get(7).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(7).addSkladnik(new Składnik("cukier", 3));
        listaProduktow.get(7).addSkladnik(new Składnik("masło", 20));
        listaProduktow.get(7).addSkladnik(new Składnik("sezam", 10));

        listProduktowModel.addElement("Sztangiel z ziarnem");
        listaProduktow.add(new Produkt("sztangiel z ziarnem"));
        listaProduktow.get(8).addSkladnik(new Składnik("maka pszenna typ 500", 400));
        listaProduktow.get(8).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(8).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(8).addSkladnik(new Składnik("drozdze", 15));
        listaProduktow.get(8).addSkladnik(new Składnik("cukier", 5));
        listaProduktow.get(8).addSkladnik(new Składnik("gotowane ziarno pszenicy", 10));
        listaProduktow.get(8).addSkladnik(new Składnik("siemielniane", 7));
        listaProduktow.get(8).addSkladnik(new Składnik("słonecznik", 7));

        listProduktowModel.addElement("chleb wiejski na maślance");
        listaProduktow.add(new Produkt("chleb wiejski na maślance"));
        listaProduktow.get(9).addSkladnik(new Składnik("maka żytnia typ 720", 500));
        listaProduktow.get(9).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(9).addSkladnik(new Składnik("sól", 15));
        listaProduktow.get(9).addSkladnik(new Składnik("drozdze", 15));
        listaProduktow.get(9).addSkladnik(new Składnik("kminek", 10));
        listaProduktow.get(9).addSkladnik(new Składnik("maślanka", 40));

        listProduktowModel.addElement("chleb pasterski");
        listaProduktow.add(new Produkt("chleb pasterski"));
        listaProduktow.get(10).addSkladnik(new Składnik("maka żytnia typ 720", 300));
        listaProduktow.get(10).addSkladnik(new Składnik("margaryna", 10));
        listaProduktow.get(10).addSkladnik(new Składnik("sól", 15));
        listaProduktow.get(10).addSkladnik(new Składnik("drozdze", 15));
        listaProduktow.get(10).addSkladnik(new Składnik("maka żytnia typ 650", 200));
        listaProduktow.get(10).addSkladnik(new Składnik("boczek", 50));
        listaProduktow.get(10).addSkladnik(new Składnik("cebula", 25));

        listProduktowModel.addElement("chleb żytni razowy");
        listaProduktow.add(new Produkt("chleb żytni razowy"));
        listaProduktow.get(10).addSkladnik(new Składnik("sól", 10));
        listaProduktow.get(10).addSkladnik(new Składnik("drozdze", 10));
        listaProduktow.get(10).addSkladnik(new Składnik("maka żytnia typ 720", 400));
        listaProduktow.get(10).addSkladnik(new Składnik("maka żytnia typ 200", 200));

        listProduktowZamowieniaModel = new DefaultListModel<>();
        listaZamowienie.setModel(listProduktowZamowieniaModel);

        refreshComboBox();
        battonDodajSkladnik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nr = listlistaproduktow.getLeadSelectionIndex();
                try {
                    if (textSkladnikNazwa.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Nie podano wartości w polu nazwa dla składnika!");
                    }
                    else if(Integer.parseInt(textSkladnikIlosc.getText())<=0)
                    {
                        JOptionPane.showMessageDialog(null, "Wartość ilosć nie może być ujemna lub równa zero!");
                    }
                    else {
                        String skl = textSkladnikNazwa.getText();
                        if ((skl.charAt(0) >= 'a' && skl.charAt(0) <= 'z') || (skl.charAt(0) >= 'A' && skl.charAt(0) <= 'Z')) {

                            Składnik skladnik = new Składnik(textSkladnikNazwa.getText(), Integer.parseInt(textSkladnikIlosc.getText()));
                            listaProduktow.get(nr).addSkladnik(skladnik);
                            String strSkladnik = textSkladnikNazwa.getText() + " " + textSkladnikIlosc.getText();

                            DefaultListModel listModel = new DefaultListModel<>();
                            String lista = " ";
                            List<Składnik> ls = listaProduktow.get(nr).getListaSkł();
                            for (Składnik s : ls) {
                                lista = " ";
                                lista = lista + s.getNazwa() + " ";
                                lista = lista + s.getIlosc();
                                listModel.addElement(lista);
                            }
                            listaskladników.setModel(listModel);
                            textSkladnikNazwa.setText("");
                            textSkladnikIlosc.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Niepoprawna nazwa składnika!");
                        }

                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Sprawdz wartość w polu ilość!");
                }
            }

        });
        listlistaproduktow.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int nr = listlistaproduktow.getLeadSelectionIndex();
                try {
                    System.out.println("przed renderowaniem skladników" + nr);
                    renderSkładnikiList(nr);
                } catch (IndexOutOfBoundsException k) {
                    System.out.printf("Indeks poza zakresem");
                }
            }
        });
        tab_produkty.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (tab_produkty.getSelectedIndex() == 0)
                    refreshComboBox();
                else
                    refreshProdukty();
            }
        });
        buttonDodajProduktDoZamowienia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = comboBoxProdukty.getSelectedItem().toString();

                try  //try catch blok służacy do wyłapywania wyjątków
                {
                    int ilosc = Integer.parseInt(textFieldIloscProdukt.getText());
                    System.out.println(x);
                    if(ilosc>0)   {

                        String produkt = x + " " + textFieldIloscProdukt.getText();
                        listProduktowZamowieniaModel.addElement(produkt);
                        zamawianeSkladniki.dodajProduk(listaProduktow.get(comboBoxProdukty.getSelectedIndex()), ilosc);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Wartośc nie może być ujemna lub równa zero!");
                        textFieldIloscProdukt.setText("");
                    }
                } catch (NumberFormatException el) {
                    if (textFieldIloscProdukt.getText().length() > 0) {
                        JOptionPane.showMessageDialog(null, "Zła wartość");
                        textFieldIloscProdukt.setText("");
                    } else
                        JOptionPane.showMessageDialog(null, "Nie podano wartości");

                }
            }

        });

        buttonUsunSkladnik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nrprod = listlistaproduktow.getSelectedIndex();
                int nrskl = listaskladników.getSelectedIndex();
                listaProduktow.get(nrprod).usunSkladnik(textSkladnikNazwa.getText());
                DefaultListModel listModel = new DefaultListModel<>();
                String lista = " ";
                List<Składnik> ls = listaProduktow.get(nrprod).getListaSkł();
                for (Składnik s : ls) {
                    lista = " ";
                    lista = lista + s.getNazwa() + " ";
                    lista = lista + s.getIlosc();
                    listModel.addElement(lista);
                }
                listaskladników.setModel(listModel);
                textSkladnikNazwa.setText("");
                textSkladnikIlosc.setText("");
            }


        });
        listaskladników.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int nrprod = listlistaproduktow.getSelectedIndex();
                Produkt p = listaProduktow.get(nrprod);
                int nrskl = listaskladników.getSelectedIndex();
                if (nrskl >= 0) {
                    List<Składnik> listaSkładników = p.getListaSkł();
                    Składnik s = listaSkładników.get(nrskl);
                    textSkladnikNazwa.setText(s.nazwa);
                    textSkladnikIlosc.setText(String.valueOf(s.getIlosc()));

                }

            }
        });
        buttonDodajProdukt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldProdukt.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Nie podano wartości w polu nazwa");
                } else {
                    //Produkt p = new Produkt(textFieldProdukt.getText());
                    listaProduktow.add(new Produkt(textFieldProdukt.getText()));
                    renderProduktList();
                    textFieldProdukt.setText(" ");
                }


            }
        });
        buttonUsunProdukt.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int nrprod = listlistaproduktow.getSelectedIndex();
                System.out.println(nrprod);
                if (nrprod >= 0) {
                    listaProduktow.remove(nrprod);
                    renderProduktList();
                }
            }
        });
        buttonZamownienie.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //   List<Składnik> listaSkładnikowwZamowieniu = new LinkedList<Składnik>();
                // for()
                zamawianeSkladniki.saveToFile();
            }

        });
        buttonCzyscZamowienie.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                listProduktowZamowieniaModel.removeAllElements();
                zamawianeSkladniki.czyscZamownie();
            }
            // DefaultListModel<String> listModel = new DefaultListModel<>();
            //  listaZamowienie.setModel(listModel);
            //  zamawianeSkladniki.czyscZamownie();

        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Piekarnia");
        frame.setContentPane(new Piekarnia().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700, 800);

    }

    public void refreshComboBox() {
        comboBoxProdukty.removeAllItems();
        for (Produkt p : listaProduktow) {
            comboBoxProdukty.addItem(p.getNazwa());
        }

    }

    public void refreshProdukty() {
        listProduktowModel.removeAllElements();
        for (Produkt p : listaProduktow) {
            listProduktowModel.addElement(p.getNazwa());
        }
    }

    public void renderProduktList() {
        DefaultListModel<String> listModel = new DefaultListModel<>();

        listaProduktow.forEach(produkt -> {
            String listStr = produkt.getNazwa();
            listModel.addElement(listStr);
        });
        this.listlistaproduktow.setModel(listModel);
    }

    public void renderSkładnikiList(int nr) {

        //listskladnikModel.removeAllElements();
        DefaultListModel listModel = new DefaultListModel<>();
        if (nr >= 0) {
            System.out.println(nr);
            Produkt p = listaProduktow.get(nr);
            String lista = "";
            List<Składnik> listas = p.getListaSkł();
            for (Składnik s : listas) {
                lista = " ";
                lista = lista + s.getNazwa() + " ";
                lista = lista + s.getIlosc();
                listModel.addElement(lista);
                // System.out.println(lista);
            }
        }
        listaskladników.setModel(listModel);

    }

    public void renderZamownie() {
        DefaultListModel listModel = new DefaultListModel<>();

        for (Zamowienie z : zamawianeSkladniki.listaSkładników) {
            listModel.addElement(z.getNazwa() + " " + textFieldIloscProdukt.getText());
        }

    }
}

