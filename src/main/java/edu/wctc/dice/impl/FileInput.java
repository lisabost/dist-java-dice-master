package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesInput;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<String> contents = readline();
        List<Sale> sales = new ArrayList<>();

        for(String row : contents) {
            String[] array = row.split(",");
            Sale sale = new Sale(array);
            sales.add(sale);
        }

        return sales;
    }

    public List<String> readline() {

        //TODO: fix file path
        File data = new File("C:\\Users\\Corey\\repos\\dist-java-dice-master\\src\\main\\java\\edu\\wctc\\dice\\data.txt");

        BufferedReader in = null;
        String line = null;
        List<String> contents = new ArrayList<>();

        try {
            if (data.exists()) {
                // make sure we differentiate between java.io.FileReader
                // class and this class (also called FileReader)
                in = new BufferedReader(new java.io.FileReader(data));

                while (true) {
                    line = in.readLine();
                    if (line == null) {
                        break;
                    }
                    contents.add(line);
                }
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);  // 1 = signals program end with error
        }

        return contents;
    }
}
