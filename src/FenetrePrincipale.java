import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class FenetrePrincipale extends JFrame implements ActionListener {

    JButton creerClient = new JButton("Ajouter des articles");
    JButton InfoClient = new JButton("Information Supermarché");
    JButton ProduitClient = new JButton("Commande");
    JButton Calculatrice = new JButton("Calculatrice");
    JLabel DateTime = new JLabel("Date");


    public FenetrePrincipale() {



        //Affichage de la fenêtre//

        setTitle("TP1 OT MARKET");
        setSize(1000, 1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(buildContentGel());

        setVisible(true);


        //Affichage de l'image dans l'accueil//

        String imgUrl = "kebabicon.jpg";
        ImageIcon icone = new ImageIcon(imgUrl);
        JLabel label = new JLabel(icone, JLabel.CENTER);
        label.setIcon(icone);
        label.setBounds(0, 0, 100, 100);
        add(label);


        setVisible(true);

    }

    private JPanel buildContentGel() {


        JPanel p = new JPanel();

        //--Ajouts des boutons pour l'interception des actions de l'utilisateur--//

        //Bouton Pour la création d'un nouveau client
        creerClient.addActionListener(this);
        p.add(creerClient);

        //Bouton Pour l'affichage des infos du clients
        InfoClient.addActionListener(this);
        p.add(InfoClient);

        //Bouton Affichage des produits pour passer une commande
        ProduitClient.addActionListener(this);
        p.add(ProduitClient);

        //Bouton Affichage de la calculatrice
        Calculatrice.addActionListener(this);
        p.add(Calculatrice);


        return p;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        //--Traitements des actions de l'utilisateurs--//

        //création d'un nouveau client
    }
}
