import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

class Pixel {

    BufferedImage image;
    int width;
    int height;

    public Pixel() {
        try {
            File input = new File("practice.jpg");

            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            int count = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    count++;

                    Color c = new Color(image.getRGB(j, i));

                    System.out.println("S.No: " + count + " Red: " + c.getRed() + " Green: " + c.getGreen() + " Blue: "
                            + c.getBlue());
                }

                if (height == i && width == i) {
                    System.out.print("stop");
                }
            }
        } catch (Exception e) {
        }
    }

    static public void main(String... args) {
        Pixel obj = new Pixel();
    }
}
