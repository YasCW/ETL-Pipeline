package com.cogniwire.etlPipeline;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

public class FileConsumer {

    public static ArrayList<String[]> parseFile(Path CSVFilePath) 
    
    {
        
        String scvDelimiter = ",";                                      //Comma delimiter for CSV
        ArrayList<String[]> parsedData = new ArrayList<>();             //ArrayList used because of mutability vs. immutable arrays
                                                                        //Each list element will contain a a String array of the split elements from the CSV, one set per ArrayList element
        try {
        List<String> lReader = Files.readAllLines(CSVFilePath);         //Attempt to split up file according to lines. Could have used bufferedReader class

            for(int i = 0; i < lReader.size(); i++)                     //Iterate through each line, and split according delimiter to create String arrays and store in ArrayList<String[]> parsedData
            {                                                           //Used String.split as StringTokenizer is legacy code
                parsedData.add(lReader.get(i).split(scvDelimiter));     
            }

            return parsedData;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    
    }

}
