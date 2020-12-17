import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pieces{
    public static final int SIZE = 60;

    /* Size of object, in pixels. */
    private int width;
    private int height;
    
    private static BufferedImage img;


    public Pieces(int width, int height, int boardWidth, int boardHeight) {
        
        this.width  = width;
        this.height = height;
    }

    public void draw(Graphics g, int px, int py, PieceType P) {
        String IMG_FILE = "files/" + P.toString() + ".png";
        
        try {
            img = ImageIO.read(new File(IMG_FILE));
        } catch (IOException e) {
            System.out.println("Internal Error:" + e.getMessage());
        }
        g.drawImage(img, px, py, width, height, null);
    }
    

}
