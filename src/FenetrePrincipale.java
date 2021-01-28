import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipale extends JFrame implements ActionListener {

    JButton creerClient = new JButton("Nouveau Restaurant");
    JButton InfoClient = new JButton("Information Restaurant");
    JButton ProduitClient = new JButton("Produits Périmés");
    JButton Calculatrice = new JButton("Calculatrice");
    JLabel DateTime = new JLabel("Date");


    public FenetrePrincipale() {

        //______________J'ai essayé de changé le background mais je n'est pas réussie-------------//

        //JFrame frame = new JFrame("Afficher une image en arrière-plan");

        //final ImageIcon icon = new ImageIcon("background4K.jpg");
        //JTextArea text = new JTextArea()
        //{
        //    Image img = icon.getImage();
        //    // initialiseur d'instance
        //    {setOpaque(false);}
        //    public void paintComponent(Graphics graphics)
        //    {
        //        graphics.drawImage(img, 0, 0, this);
        //        super.paintComponent(graphics);
        //    }
        //};

        // JScrollPane pane = new JScrollPane(text);
        // Container content = frame.getContentPane();
        // content.add(pane, BorderLayout.CENTER);
        // setDefaultCloseOperation(3);
        //frame.setSize(400, 300);
        //frame.setVisible(true);


        //JLabel background;
        // ImageIcon img = new ImageIcon("background4K.jpg");
        // background = new JLabel("",JLabel.CENTER);
        // background.setBounds(0,0,1000,1000);
        // add(background);


        //_________________________________________________________________________________________//


        //Affichage de la fenêtre//

        setTitle("TP1 OT MARKET");
        setSize(1000, 1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(buildContentGel());

        setVisible(true);


        //Affichage de l'image dans l'accueil//

        String imgUrl = "javalogo.jpg";
        ImageIcon icone = new ImageIcon(imgUrl);
        JLabel label = new JLabel(icone, JLabel.CENTER);
        label.setIcon(icone);
        label.setBounds(0, 0, 100, 100);
        add(label);


        setVisible(true);

    }

    private JPanel buildContentGel() {


        JPanel p = new JPanel();




        return p;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
