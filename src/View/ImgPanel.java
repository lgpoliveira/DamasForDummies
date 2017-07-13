/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author guga
 */
public class ImgPanel extends JPanel {
    Image img;
    public ImgPanel(){
        
    }
    public void setImg(Image img)
    {
        this.img = img;
    }
    protected void paintComponent(Graphics g)
    {
         super.paintComponent(g);
    if (img != null)
      g.drawImage(img, 0,0,this);
    }

    public Image getImg() {
        return this.img;
    }
}
