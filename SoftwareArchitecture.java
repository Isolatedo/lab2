package lab2;

import lab2.JFrameHander.MainActionHander;

import javax.swing.*;
import java.awt.*;

public class SoftwareArchitecture extends JFrame {

    // 创建 JFrame 实例
    private JFrame frame;
    private JLabel label;
    private MainActionHander mainActionHander;
    // 创建按钮
    private JButton mainButton;
    private JButton oopButton;
    private JButton eventButton;
    private JButton pipeButton;

    public SoftwareArchitecture() {
        // 创建 JFrame 实例
        frame = new JFrame("经典软件体系结构");
        //MainHander实例
        mainActionHander = new MainActionHander(this);
        // 创建标签
        label = new JLabel("请选择软件体系结构风格：");
        label.setFont(new Font("黑体", Font.PLAIN, 40));
        label.setBounds(180, 10, 500, 50);
        frame.add(label);
        // 创建按钮
        mainButton = new JButton("主程序-子程序");
        mainButton.setBounds(200,80, 400, 50);
        mainButton.addActionListener(mainActionHander);
        frame.add(mainButton);

        oopButton = new JButton("面向对象");
        oopButton.setBounds(200, 150, 400, 50);
        oopButton.addActionListener(mainActionHander);
        frame.add(oopButton);

        eventButton = new JButton("事件系统");
        eventButton.setBounds(200, 220, 400, 50);
        eventButton.addActionListener(mainActionHander);
        frame.add(eventButton);

        pipeButton = new JButton("管道-过滤器");
        pipeButton.setBounds(200, 290, 400, 50);
        pipeButton.addActionListener(mainActionHander);
        frame.add(pipeButton);

        //组件居中
        //setCenter();
        // 设置 JFrame 的大小
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SoftwareArchitecture();
    }
}
