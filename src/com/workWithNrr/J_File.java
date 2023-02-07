package com.workWithNrr;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class J_File {
    public static void main(String[] args) {
//        System.out.println(createFile("myFile.txt"));
//        write("myFile.txt");
//        readFromFile("myFile.txt");

//        get file information
       /* File file = new File("myFile.txt");
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.lastModified());*/

//        delete a file
        /*File file = new File("myFile.txt");

        if (file.delete())
            System.out.println("Deleted successfully.");
        else
            System.out.println("Something went wrong.");*/
    }

    public static void readFromFile(String fileName){
        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);

            while (in.hasNextLine()){
                var data = in.nextLine();
                System.out.println(data);
            }
            in.close();
        }
        catch (Exception ex){
            System.out.println("An error occurred.");
        }
    }
    public static File createFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
                return file;
            }
            else {
//                System.out.println("File Exist already.");
                return file;
            }
        }
        catch (Exception ex){
//            System.out.println("Something went wrong.");
        }
        return null;
    }

    public static void write(String fileName){
        File file = createFile(fileName);
        Scanner in = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter(file.getName());
            String str = "";

            while (true) {
                System.out.println("Enter next line.");
                str = in.nextLine();
                if (str.compareToIgnoreCase("stop") == 0)
                    break;
                fileWriter.write(str + "\n");
            }

            fileWriter.close();
        }
        catch (Exception ex){
            System.out.println("Something went wrong.");
        }
    }
}
