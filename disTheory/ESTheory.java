package lab2.disTheory;

import lab2.Utils.ImageHandle;
import lab2.disJFrame.EventSystemDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ESTheory extends JFrame {
    private JTextArea textArea;

    public ESTheory() {
        // 设置窗口标题
        setTitle("事件系统风格原理");
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
        ImageIcon imageIcon = imageHandle.scaleImage("D:\\IdeaProjects\\javaModel\\src\\lab2\\Img\\image_2.png");
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel, BorderLayout.NORTH);

        // 创建一个新的面板用于放置说明文字
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BorderLayout()); // 使用BorderLayout布局
        String text = "事件系统软件体系风格是一种基于事件驱动的架构风格，它将应用程序中各个模块之间的通信和协作通过事件进行管理。<br>在这种架构中，每个模块都可以发布和订阅事件，而无需直接调用其他模块的方法或接口,其特点如下：<br>" +
                "1.松耦合：在事件系统中，各个模块之间通过事件进行通信，所以模块之间的依赖性降低了。这使得系统更容易维护和扩展。<br>" +
                "2.异步：事件系统支持异步事件处理，使得系统可以更快速地响应事件。<br>" +
                "3.可靠性：事件系统可以进行事件的存储和重播，从而保证数据不会丢失。<br>" +
                "4.伸缩性：事件系统可以根据需求进行横向扩展，以应对高并发的情况。<br>";
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
                EventSystemDome es = new EventSystemDome();
                es.displaySystemInformation();
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

