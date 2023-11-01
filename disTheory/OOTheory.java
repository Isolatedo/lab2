package lab2.disTheory;

import lab2.Utils.ImageHandle;
import lab2.disJFrame.ObjectOrientedDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OOTheory extends JFrame {
    private JTextArea textArea;

    public OOTheory() {
        // 设置窗口标题
        setTitle("面向对象系统风格原理");
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
        contentPanel.setSize(780,300);
        // 创建一个标签用于显示图片
        JLabel imageLabel = new JLabel();
        // 替换为实际的图片路径
        ImageHandle imageHandle = new ImageHandle(contentPanel);
        ImageIcon imageIcon = imageHandle.scaleImage("D:\\IdeaProjects\\javaModel\\src\\lab2\\Img\\img_1.png");
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel, BorderLayout.NORTH);

        // 创建一个新的面板用于放置说明文字
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BorderLayout()); // 使用BorderLayout布局
        String text = "面向对象软件体系结构是一种基于面向对象编程范式的软件设计和组织方法，<br>它将系统划分为多个相互协作的对象，以实现系统的功能和需求,其特点如下：<br>" +
                "1.分层体系结构：这种体系结构将系统划分为多个水平层次，每个层次都有明确定义的职责和功能。<br>每个层次只能与相邻的层次进行交互，从而实现了模块化和松耦合。<br>" +
                "2.客户端-服务器体系结构：这种体系结构将系统划分为客户端和服务器两部分，<br>客户端发送请求并接收响应，而服务器处理请求并提供服务。<br>这种体系结构可以实现分布式计算和资源共享，常见的例子包括Web应用程序和数据库系统。<br>" +
                "3.领域驱动设计体系结构：这种体系结构将系统划分为领域模型、<br>应用服务、基础设施层等组件。<br>这种体系结构强调关注领域模型的设计和实现。<br>";
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
                ObjectOrientedDome oo = new ObjectOrientedDome();
                oo.displaySystemInformation();
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

