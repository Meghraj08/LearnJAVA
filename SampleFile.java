package com.app.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SampleFile {
    public static void main(String[] args) {
        try {
            String name = "C:\\Users\\SPAN\\IdeaProjects\\Project1\\src\\com\\app\\java";
            File file = new File(name);
            System.out.println(file.listFiles());
            for (File files : file.listFiles()) {
                System.out.println(files.getAbsolutePath() + " " + files.isHidden() + " " + files.canRead() + " " + files.canWrite());
            }
            if (file.exists() && file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                int c = fileInputStream.read();
                while (c != -1) {
                    System.out.print((char) c);
                    c = fileInputStream.read();
                }
            } else if (file.isFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                String iname = "Meghraj Mahida";
                fileOutputStream.write(iname.getBytes());
                fileOutputStream.close();
            } else {
                System.out.println("You have provided directory.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
