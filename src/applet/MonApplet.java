package applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by association on 16/01/17.
 */
public class MonApplet extends Applet {
    String message;

    @Override
    public void init() {
        message = "Bonjour, me voilà !";
        repaint();
    }

    @Override
    public void start() {
        message = "Je démarre ...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, on m'arrête ...";
        repaint();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
