package lab2.Utils;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class outputFrom {
    File file;
    JTextArea jTextArea;
    public outputFrom(String path,JTextArea jTextArea) {
        file = new File(path);
        this.jTextArea = jTextArea;
    }
    public void DuQuFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                jTextArea.append(line + "\n");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
