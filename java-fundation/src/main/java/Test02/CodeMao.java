package Test02;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/26 18:30
 * @since JDK17
 * */

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;


/**
 * 编程猫类
 */

public class CodeMao {

    //坐标(初始化)
    private static int x = 0,y = 0;
    //image对象
    private Image img;

    /**
     * 构造方法
     */
    public CodeMao() {
        //实例化img对象
//        img = new ImageIcon("tutui.jpg").getImage();

//        super(new BorderLayout());

//        Image image;

        try {
            img = ImageIO.read(getClass().getResource("tutui.jpg"));
        } catch (IOException e) {
            img=null;
        }

    }


    /**
     * 获取x
     * @return 编程猫的x
     */
    public int getX() {
        return x;
    }

    /**
     * 获取y
     * @return 编程猫的y
     */
    public int getY() {
        return y;
    }

    /**
     * 加x函数
     */
    public void X_add(int num) {
        x += num;
    }

    /**
     * 加y函数
     */
    public void Y_add(int num) {
        y += num;
    }

    /**
     * 获取codemao图片的函数
     * @return codemao图片
     */
    public Image getImage() {
        return img;
    }
}
