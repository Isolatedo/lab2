package lab2.JFrameHander;

import lab2.SoftwareArchitecture;
import lab2.disJFrame.EventSystemDome;
import lab2.disJFrame.MainProgramSubProgramDemo;
import lab2.disJFrame.ObjectOrientedDome;
import lab2.disJFrame.PipelineFilterDome;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class MainActionHander extends KeyAdapter implements ActionListener {
    SoftwareArchitecture softwareArchitecture;

    public MainActionHander(SoftwareArchitecture softwareArchitecture) {
        this.softwareArchitecture = softwareArchitecture;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String text = jButton.getText();
        switch (text) {
            case "主程序-子程序":
                softwareArchitecture.dispose();
                MainProgramSubProgramDemo m = new MainProgramSubProgramDemo();
                m.displaySystemInformation();
                break;
            case "面向对象":
                softwareArchitecture.dispose();
                ObjectOrientedDome o = new ObjectOrientedDome();
                o.displaySystemInformation();
                break;
            case "事件系统":
                softwareArchitecture.dispose();
                EventSystemDome es = new EventSystemDome();
                es.displaySystemInformation();
                break;
            case "管道-过滤器":
                softwareArchitecture.dispose();
                PipelineFilterDome pf = new PipelineFilterDome();
                pf.displaySystemInformation();
                break;
        }
    }
}
