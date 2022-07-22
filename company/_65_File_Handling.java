package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _65_File_Handling {
    public static void main(String[] args) {

        //code to create a new File
        File myFile = new File("coderAman.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }

        //code to write to a file

        try {
            FileWriter fileWriter = new FileWriter("coderAman.txt");
            fileWriter.write("This is a first file from this java course\n Okay Bye Now.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Reading a file

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Delete a file

        if (myFile.delete()) {
            System.out.println("I have deleted : " + myFile.getName());
        } else {
            System.out.println("Some Problem occurred while deleting the file ");
        }
    }
}
