import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener {
    public Player(double x, double y,double vx,double vy) {
        super(x,y,vx,vy);
    }

    public void draw(MyFrame f) {
        f.setColor(0,182,0);
        f.fillRect(x,y+20,30,10);
        f.setColor(200,200,200);
        f.fillOval(x+10,y,10,30);
    }


    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            vx=-5;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            vx=5;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));
            System.out.println("玉の数="+GameWorld.playerBullets.size());
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Enterキーが押されました");
            GameWorld.enterPressed = true;
        }
    }


    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            vx=0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            vx=0;
        }
    }

    public void move(){
        super.move();
        if (x<0) x=0;
        if (x>370) x=370;
    }
}
