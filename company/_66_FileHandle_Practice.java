package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _66_FileHandle_Practice {
    public static void main(String[] args) {

        int i = 19;
        String table = "";

        for (int j = 1; j <= 10; j++){
            table += i + "X" + j + "=" + (i*j);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("E:\\Multiplication.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
