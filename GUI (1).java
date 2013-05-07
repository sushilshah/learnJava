import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class GUI implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    private final BufferedImage offscreenImage; // double buffered image
    private final BufferedImage onscreenImage;  // double buffered image
    private final Graphics2D offscreen;
    private final Graphics2D onscreen;
    private JFrame frame;                       // the top-level component
    private JPanel center = new JPanel();       // center panel

    // create a GUI with a menu, some buttons, and a drawing window of size width-by-height
    public GUI(int width, int height) {
        offscreenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        onscreenImage  = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        offscreen = (Graphics2D) offscreenImage.getGraphics();
        onscreen  = (Graphics2D) onscreenImage.getGraphics();

        // the drawing panel
        ImageIcon icon = new ImageIcon(onscreenImage);
        JLabel draw = new JLabel(icon);
        draw.addMouseListener(this);
        draw.addMouseMotionListener(this);

        // label cannot get keyboard focus
        center.add(draw);
        center.addKeyListener(this);

        // west panel of buttons
        JPanel west = new JPanel();
        west.setLayout(new BoxLayout(west, BoxLayout.PAGE_AXIS));
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button1.setToolTipText("Click me");
        west.add(button1);
        west.add(button2);
        west.add(button3);
        west.add(button4);

        // menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem menuSave = new JMenuItem(" Save...   ");
        menuSave.addActionListener(this);
        menuSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        menu.add(menuSave);

        // setup the frame and add components
        frame = new JFrame();

        frame.setJMenuBar(menuBar);
        frame.add(west,   BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.pack();

        // give the focus to the center panel
        center.requestFocusInWindow();

        frame.setVisible(true);
    }


    // draw picture (gif, jpg, or png) centered on (x, y)
    public void picture(int x, int y, String filename) {
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage();
        offscreen.drawImage(image, x, y, null);
        show();
    }


    // display the drawing canvas on the screen
    public void show() {
        onscreen.drawImage(offscreenImage, 0, 0, null);
        frame.repaint();
    }



   /*************************************************************************
    *  Event callbacks
    *************************************************************************/

    // for buttons and menus
    public void actionPerformed(ActionEvent e) {
        Object cmd = e.getActionCommand();
        if      (cmd.equals(" Save...   ")) System.out.println("File -> Save");
        else if (cmd.equals("button 1"))    System.out.println("Button 1 pressed");
        else if (cmd.equals("button 2"))    System.out.println("Button 2 pressed");
        else if (cmd.equals("button 3"))    System.out.println("Button 3 pressed");
        else if (cmd.equals("button 4"))    System.out.println("Button 4 pressed");
        else                                System.out.println("Unknown action");

        // don't hog the keyboard focus
        center.requestFocusInWindow();
    }

    // for the mouse
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse pressed at " + x + ", " + y);
        offscreen.setColor(Color.BLUE);
        offscreen.fillOval(x-3, y-3, 6, 6);
        show();
    }

    public void mouseClicked (MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered (MouseEvent e) { }
    public void mouseExited  (MouseEvent e) { }
    public void mouseDragged (MouseEvent e) { }
    public void mouseMoved   (MouseEvent e) { }


    // for the keyboard
    public void keyPressed (KeyEvent e) { }
    public void keyReleased(KeyEvent e) { }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key = '" + e.getKeyChar() + "'");
    }

    // test client
    public static void main(String[] args) {
        GUI gui = new GUI(800, 471);
        gui.picture(0, 0, "map.png");
        gui.show();
    }

}
