package lab2.disTheory;

import lab2.Utils.ImageHandle;
import lab2.disJFrame.MainProgramSubProgramDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSubTheory extends JFrame {
    private JTextArea textArea;

    public MainSubTheory() {
        // 设置窗口标题
        setTitle("主程序-子程序系统风格原理");
        System.setProperty("file.encoding", "UTF-8");
        // 创建文本区域
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 25));

        // 将文本区域添加到滚动面板中
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 将滚动面板添加到窗口中
        add(scrollPane);

        // 创建一个面板用于放置图片和按钮
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setSize(780,350);
        // 创建一个标签用于显示图片
        JLabel imageLabel = new JLabel();
        // 替换为实际的图片路径
        ImageHandle imageHandle = new ImageHandle(contentPanel);
        ImageIcon imageIcon = imageHandle.scaleImage("D:\\IdeaProjects\\javaModel\\src\\lab2\\Img\\img.png");
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel, BorderLayout.NORTH);

        // 创建一个新的面板用于放置说明文字
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BorderLayout()); // 使用BorderLayout布局
        String text = "这是主程序-子程序软件体系结构原理图,其特点如下：<br>" +
                "1.模块化设计：主程序-子程序架构将整个系统拆分为多个独立的子程序模块，<br>每个子程序负责特定的功能或任务。<br>" +
                "2.松耦合：主程序-子程序架构通过定义清晰的接口<br>和通信机制来实现子程序之间的松耦合。<br>" +
                "3.可重用性：主程序-子程序架构鼓励子程序的可重用性，<br>即通过设计独立、通用的子程序模块，<br>可以在不同的项目中进行复用，提高开发效率和代码质量。";
        JLabel descriptionLabel = new JLabel(text);
        descriptionLabel.setText("<html>" + text + "</html>");  // 这样才能生效
        descriptionLabel.setFont(new Font("宋体", Font.BOLD, 20));
        descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        descriptionPanel.add(descriptionLabel, BorderLayout.CENTER); // 将说明文字标签添加到descriptionPanel中
        contentPanel.add(descriptionPanel); // 将descriptionPanel添加到contentPanel中

        // 创建按钮并设置按钮属性
        JButton backButton = new JButton("返回");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainProgramSubProgramDemo m = new MainProgramSubProgramDemo();
                m.displaySystemInformation();
                dispose(); // 关闭当前窗口
            }
        });
        contentPanel.add(backButton, BorderLayout.SOUTH);

        // 将内容面板添加到窗口中
        add(contentPanel);

        // 设置窗口大小和关闭操作
        setSize(800, 700); // 调整适合图片的大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    }

