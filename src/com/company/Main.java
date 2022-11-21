package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File("D:\\Programming\\IdeaProjects\\writingstreamfiles\\captmidn.txt");
        Scanner scanner = new Scanner(file);


        String fileContent = "";
        while (scanner.hasNext()){
            fileContent = fileContent.concat(scanner.nextLine()+"\n");
//            System.out.println(scanner.nextLine());
        }

        FileWriter fw = new FileWriter("D:\\Programming\\IdeaProjects\\writingstreamfiles\\newfile.txt");
        fw.write(fileContent);
        fw.close();
    }
}
