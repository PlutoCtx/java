package Test02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/26 18:31
 * @since JDK17
 */


public class MoveFrame extends JFrame {
    /**
     * 全部变量
     */
    public static CodeMao cat;

    /**
     * 构造方法
     */
    public MoveFrame() {
//		属性
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

//		创建codemao对象
        cat = new CodeMao();

//		panel对象，方便画图
        JPanel jp = new panel();
        setContentPane(jp);

//		添加键盘敲击事件
        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                /**
                 *按下事件
                 */
                int code = e.getKeyCode();
                //按w
                if (code==e.VK_W) {
                    cat.Y_add(-5);
                }
                //按s
                if (code==e.VK_S) {
                    cat.Y_add(5);
                }
                //按a
                if (code==e.VK_A) {
                    cat.X_add(-5);
                }
                //按d
                if (code==e.VK_D) {
                    cat.X_add(5);
                }
            }
            public void keyReleased(KeyEvent e) {}

        });

        //线程对象
        new Thread() {
            public void run() {
                //死循环
                while (true) {
                    jp.repaint();
                }
            }
        }.start();
    }

    /**
     * 主方法
     */
    public static void main(String[] args) {
        new MoveFrame().setVisible(true);
    }

    /**
     * panel 类
     */
    private class panel extends JPanel {
        public void paint(Graphics g) {
            super.paintComponent(g);
            g.drawImage(cat.getImage(), cat.getX(), cat.getY(), this);

        }
    }
}