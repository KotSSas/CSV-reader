package com.company;

import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\IdeaProjects\\writingstreamfiles\\csv\\crimes.csv";
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String[] values =  null;
        while ((line = br.readLine()) !=null){
          values = line.split(",");
            System.out.println("Date: "+values[0]+" "+"Description: "+values[5]);

        }

    }
}
