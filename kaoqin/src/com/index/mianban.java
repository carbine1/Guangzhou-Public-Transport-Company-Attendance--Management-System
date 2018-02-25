package com.index;
import javax.swing.*;
import java.awt.*;//引入awt包，设置面板颜色
public class mianban extends JFrame {
/**
     * 设置窗口
     */
    private static final long serialVersionUID = -8689013371205797802L;
public mianban() {
    setBounds(10,10,1000,700);//设置窗口位置10,10，窗口宽1000，高700
    setDefaultCloseOperation(EXIT_ON_CLOSE);//关闭窗口时关闭程序
    
    Container c = getContentPane();//容器设置
    c.setLayout(new GridLayout(2,2,10,10));//容器线性布局
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(100,30,1,1));
    JPanel p2 = new JPanel(new GridLayout(100,30,1,11));
    JPanel p3 = new JPanel(new GridLayout(100,30,1,1));
    JPanel p4 = new JPanel(new GridLayout(100,30,1,1));
    
    /*
     * ??ӱ߿?
     * 
     */
    p1.setBorder(BorderFactory.createTitledBorder("面板1"));//?????????
    p2.setBorder(BorderFactory.createTitledBorder("面板2"));//?????????
    p3.setBorder(BorderFactory.createTitledBorder("面板3"));//?????????
    p4.setBorder(BorderFactory.createTitledBorder("面板4"));//?????????
    
    c.add(p1);c.add(p2);c.add(p3);c.add(p4);
    
    setVisible(true);//窗口可见
}
  public static void main(String[] args) {
      new mianban();
}
}

    