import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

class myPanel extends Applet{
    public void init(){
        setBackground(Color.white);
    }
    static String team[] = {"tokyo","osaka"};
    static int score[][] = {
            {1,0,0,2,0,0,0,1,0,4},
            {0,1,3,0,0,0,0,1,0,5}
    };
    public void paint(Graphics g){
        int i,j;
        int xp = 50;
        int yp=20;
        g.setColor(Color.red);
        for (i=0;i<=2;i++){
            g.drawLine(xp+0,yp+i*30,xp+300,yp+i*30);
        }
        for (j=0;j<=10;j++){
            g.drawLine(xp+j*30,yp+0,xp+j*30,yp+60);
        }
        for (j=0;j<9;j++){
            g.drawString(Integer.toString(j+1),xp+j*30+10,10);
            g.drawString("計",xp+j*30+10,10);
            g.setColor(Color.black);
            for(i=0;i<10;i++){
                g.drawString(team[i],10,yp+i*30+20);
                for(j=0;j<10;j++){
                    g.drawString(Integer.toString(score[i][j]),xp+j*30+10,yp+i*30+20);
                }
            }
        }
    }
}
public class Gui_01 extends JFrame {
        public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500,200);
            f.setTitle("Yakyu Test");
            f.setResizable(false);
            Container contentPane = f.getContentPane();
            myPanel p = new myPanel();
            contentPane.add(p);
            p.start();

            f.setVisible(true);
        }

}
