import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculatrice {
    //Declaration des variables, Variable Declaration
    JPanel p1; // Panel Principale, Main Panel
    JLabel l;
    JButton A, B, C, D, E, F;
    JTextField t, t1, t2;
    JFrame f;
    ImageIcon i;
    Image e;
    //JLABEL TEST
    //Declaration des variables, Variable Declaration


    //Constructeur
    public Calculatrice() {
// JMenu bar
        JMenuBar JMenu = new JMenuBar();
        JMenu m = new JMenu("Option");// JMenu
        JMenu.add(m);
// Ajouter Item (Element dans le meno Class)
        JMenuItem erase = new JMenuItem("Erase");
        m.add(erase);


        //Ajout dans Le Jpanel 1 et creation de Jtext
        p1 = new JPanel();// creation du Panel1

        p1.setLayout(new GridLayout(6, 2, 10, 10)); //4,2,10,10  , // Creation de la structure, du shema de la fenetre

//Ajout de la 1ere ligne, le Titre plus le champs
        l = new JLabel("1er nombre ");
        p1.add(l);  // ajout de la ligne dans le Jpanel Principal
        t = new JTextField(20);
        p1.add(t); // ajout du champs dans le Jpanel Principal

// 2eme
        l = new JLabel("2eme nombre ");
        p1.add(l);
        t1 = new JTextField(20);
        p1.add(t1);
// 3eme Resultat
        l = new JLabel("Resultat: ");
        p1.add(l);
        t2 = new JTextField(20);
        t2.setBackground(Color.WHITE);
        t2.setForeground(Color.GREEN);
        t2.setEnabled(false);
        p1.add(t2);

// Action Buton
        A = new JButton("+");
        p1.add(A); // ajout du 1er button dans le Jpanel Principal
        B = new JButton("x");
        p1.add(B);
        C = new JButton("/");
        p1.add("SOUTH", C);
        D = new JButton("-");
        p1.add(D);
        E = new JButton("Puissance");
        p1.add(E);
        F = new JButton("Racine carrée");
        p1.add(F);
// Action Buton

//action Addition
// Gestion des evenments sur le button d'addition,
        A.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    String ad2 = t1.getText();
                    double t = Double.parseDouble(ad);
                    double b = Double.parseDouble(ad2);
                    String w = " " + (t + b);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        });// Gestion des evenments sur le button d'addition,

// Gestion des evenments sur le button d'Multiplication,
//Action Multiplication
        B.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    String ad2 = t1.getText();
                    double t = Double.parseDouble(ad);
                    double b = Double.parseDouble(ad2);
                    String w = " " + (t * b);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        }); // Gestion des evenments sur le button d'Multiplication,


//Action Division
// Gestion des evenments sur le button Division,
        C.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    String ad2 = t1.getText();
                    double t = Double.parseDouble(ad);
                    double b = Double.parseDouble(ad2);
                    String w = " " + (t / b);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        });// Gestion des evenments sur le button Division,

//Exponetiel
// Gestion des evenments sur le button Exponentiel,
        D.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    String ad2 = t1.getText();
                    double t = Double.parseDouble(ad);
                    double b = Double.parseDouble(ad2);
                    String w = " " + (t - b);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        });// Gestion des evenments sur le button Exponentiel,


//Puissance
// Gestion des evenments sur le button Puissance,
        E.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    String ad2 = t1.getText();
                    double t = Double.parseDouble(ad);
                    double b = Double.parseDouble(ad2);
                    String w = " " + Math.pow(t, b);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        }); // Gestion des evenments sur le button Puissance,


//Racine Carrer
// Gestion des evenments sur le button racine Carrer,
        F.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    String ad = t.getText();
                    double t = Double.parseDouble(ad);
                    String w = " " + Math.sqrt(t);
                    t2.setText(w);

                } catch (NumberFormatException er) {
                }

            }
        }); //Racine Carrer
// Gestion des evenments sur le button racine Carrer,


// Gestion des evenments button qui efface les inputs, Button bar which erase the TextField
        erase.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    t.setText("");
                    t1.setText("");
                    t2.setText("");


                } catch (NumberFormatException er) {
                }

            }
        });// Gestion des evenments button qui efface les inputs, Button bar which erase the TextField


//Fenetre
        f = new JFrame("Calculatrice JBEJ");
        f.setVisible(true);
        f.getContentPane().add("Center", p1);//Positionement Au Centre
        f.setResizable(false); // Permet de ne pas redimentionner la fenetre
        f.setJMenuBar(JMenu);// JMenu bar horizontal
        i = new ImageIcon("r.jpg");
        e = i.getImage();
        //p1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));

        l.setForeground(Color.BLUE);
        f.setSize(400  , 400);
        f.setLocationRelativeTo(null);


    }

}

