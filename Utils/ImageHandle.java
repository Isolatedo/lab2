package lab2.Utils;

import javax.swing.*;
import java.awt.*;

public class ImageHandle {
    JPanel jPanel;
    public ImageHandle(JPanel jPanel) {
        this.jPanel = jPanel;
    }
    public ImageIcon scaleImage(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(jPanel.getWidth(), jPanel.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }
}
