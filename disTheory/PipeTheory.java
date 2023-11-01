package lab2.disTheory;

import lab2.Utils.ImageHandle;
import lab2.disJFrame.PipelineFilterDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PipeTheory extends JFrame {
    private JTextArea textArea;

    public PipeTheory() {
        // 设置窗口标题
        setTitle("管道过滤器系统风格原理");
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
        contentPanel.setSize(780,400);
        // 创建一个标签用于显示图片
        JLabel imageLabel = new JLabel();
        // 替换为实际的图片路径
        ImageHandle imageHandle = new ImageHandle(contentPanel);
        ImageIcon imageIcon = imageHandle.scaleImage("D:\\IdeaProjects\\javaModel\\src\\lab2\\Img\\img_4.png");
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel, BorderLayout.NORTH);

        // 创建一个新的面板用于放置说明文字
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BorderLayout()); // 使用BorderLayout布局
        String text = "管道-过滤器软件体系结构风格是一种基于组件的架构风格，它通过将应用程序分解成多个处理阶段和数据过滤器来实现数据流处理,其优点如下：<br>" +
                "1.可扩展性：由于每个过滤器都是独立的组件，因此系统可以方便地添加或删除过滤器组件，以满足不同的需求。<br>" +
                "2.可重用性：每个过滤器都是独立的组件，因此可以在不同的系统中重复使用。<br>" +
                "3.易于维护和测试：由于每个过滤器只关注自己的输入和输出数据格式，因此它们之间的相互依赖性降低了。这使得系统更容易维护和测试。<br>" +
                "4.高效性：由于每个过滤器都是独立的组件，因此系统可以并行处理数据流，从而提高系统的处理效率。<br>";
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
                PipelineFilterDome pf = new PipelineFilterDome();
                pf.displaySystemInformation();
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

