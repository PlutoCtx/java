import javax.swing.*;
import java.awt.*;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/11/26 18:21
 * @since JDK17
 */

public class Test01 extends JFrame {

    public Test01() {
        this.setTitle("Regino");
        this.setSize(300, 200);
        // 定义一个按钮组件
        JButton bt = new JButton("Click Me");
        // 设置流式布局管理器
        this.setLayout(new FlowLayout());
        // 添加按钮组件
        this.add(bt);
        // 设置单击关闭按钮时的默认操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Test01();
    }
}
