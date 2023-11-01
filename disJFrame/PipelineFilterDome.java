package lab2.disJFrame;

import lab2.disTheory.PipeTheory;
import lab2.hander.Pipe.pipeDome;
import lab2.Utils.outputFrom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PipelineFilterDome extends JFrame {
    private JTextArea textArea;

    public PipelineFilterDome() {
        // 设置窗口标题
        setTitle("管道-过滤器风格风格");

        // 创建文本区域
        String text = "管道-过滤器处理后的数据如下：\n";
        textArea = new JTextArea(text);
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
        // 将文本区域添加到滚动面板中
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 将滚动面板添加到窗口中
        add(scrollPane);

        // 创建按钮并设置按钮属性
        JButton principleButton = new JButton("原理");
        principleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                // 在按钮点击事件中处理按钮的功能逻辑
                PipeTheory pipe = new PipeTheory();
            }
        });

        // 创建一个面板并添加按钮
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(principleButton);

        // 将面板添加到窗口底部
        add(buttonPanel, BorderLayout.SOUTH);

        // 设置窗口大小和关闭操作
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
        public void displaySystemInformation() {
            String path = "D:\\IdeaProjects\\javaModel\\src\\lab2\\output\\output4";
            pipeDome demo4 = new pipeDome();
            demo4.do4();
            new outputFrom(path, this.textArea).DuQuFile();
        }
    }

