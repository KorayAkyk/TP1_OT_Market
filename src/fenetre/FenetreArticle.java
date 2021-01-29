package fenetre;
import javax.swing.*;

import classe.Article;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class FenetreArticle extends JFrame {

    public FenetreArticle() {
    	setResizable(false);

        //Affichage de la fenêtre//

        setTitle("Article");
        setSize(658, 435);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        setVisible(true);

        //Affichage de l'image dans l'accueil//

        String imgUrl = "kebabicon.jpg";
        ImageIcon icone = new ImageIcon(imgUrl);

        //Recuprer un article 
        Article art = new Article();
               
        setVisible(true);
      
    }
}
