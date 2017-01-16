package cadre;

import javax.swing.*;
import java.awt.*;

/**
 * Created by association on 16/01/17.
 */
public class MonCadre extends JFrame{
    public MonCadre(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "Je suis le maître du monde !!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MonCadre monCadre = new MonCadre("Design Patterns - Tête la première");
    }
}
