package com.cogniwire.etlPipeline;

import java.io.File;
import java.nio.file.FileSystems;

public class EtlPipeline {

    public static void main(String[] args) {

        /* Define the expected input file
        *  user.dir and File.seperator is used to ensure cross-platform and environment compatibility 
        */
        String filePath = System.getProperty("user.dir") + File.separator + "Input File" + File.separator + "InputFile.csv";

        try {
            XMLExporter.exportXML(FileConsumer.parseFile(FileSystems.getDefault().getPath(filePath)));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
