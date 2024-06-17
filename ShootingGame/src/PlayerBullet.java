public class PlayerBullet extends Character{
    public PlayerBullet(double x, double y, double vx, double vy) {
        super(x, y, vx, vy);
    }

    public void draw(MyFrame f) {
        f.setColor(116,80,48);
        f.fillOval(x,y+20,30,10);
        f.fillOval(x+2.5,y+15,25,10);
        f.fillOval(x+5,y+10,20,20);
    }
}
