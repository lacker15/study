import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/18.
 */
public class ShootGame {
  public static final int WIDTH  = 400 ;
  public static final int HEIGHT = 650 ;
   public static BufferedImage background;
  public static  BufferedImage start;
  public static  BufferedImage pause;
  public static BufferedImage gameover;
  public static BufferedImage airplance;
  public static BufferedImage bee;
  public static BufferedImage bullet;
  public static BufferedImage hero0;
  public static BufferedImage hero1;

  static {
      try{
          background = ImageIO.read(ShootGame.class.getResource("background.png"));
          start = ImageIO.read(ShootGame.class.getResource("start.png"));
         pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
         gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
          airplance = ImageIO.read(ShootGame.class.getResource("airplane.png"));
          bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
          bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
          hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
          hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));

      }catch (IOException e){
          e.printStackTrace();
      }
  }


}
