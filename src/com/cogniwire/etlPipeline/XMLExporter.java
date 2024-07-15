package com.cogniwire.etlPipeline;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.math.BigDecimal;

import com.cogniwire.TimeConvert;
import com.cogniwire.etlPipeline.model.ObjectFactory;
import com.cogniwire.etlPipeline.model.VoucherEntry;                    //Schema binding  classes created from XSD
import com.cogniwire.etlPipeline.model.VoucherEntry.Record;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


public class XMLExporter {
    
        public static void exportXML(ArrayList<String[]> parsedData) 
        
        {
            String[] csvRecord;

            ObjectFactory factory = new ObjectFactory();

            VoucherEntry voucherEntry = factory.createVoucherEntry();

            // Create a list to hold multiple customer objects
            List<Record> records = new ArrayList<>();
            
            try {

                for (int i = 0; i < parsedData.size(); i++) {           //Iterating through the ArrayList, representing the rows in the original file
                    
                    csvRecord = parsedData.get(i);                      //An ArrayList element as a line from the original CSV file
                    
                    Record record = factory.createVoucherEntryRecord(); //We create a record object to be used for every record elemnt in the XML / row from the original CSV

                        for (int j = 0; j <= 7; j++) {                  //csvRecord is a String[] type. The number 8 is equal to csvRecord.length since the original CSV has 8 columns of data
                                                                        //We need to iterate 8-1 times due to zero index                                   
                                switch(j) {                             //Each index value is a column, so 0 is TrxDate column, 1 is TransactionId, 2: AcctID, etc.
                                    case 0:
                                    record.setTrxDate(TimeConvert.convertDateToXMLGregorianCalendar(csvRecord[0]));     //TrxDate
                                    break;
                                    case 1:
                                    record.setTransactionId(csvRecord[1]);                                              //TransactionId
                                    break;
                                    case 2:
                                    record.setAcctID(csvRecord[2]);                                                     //AcctID
                                    break;
                                    case 3:
                                    record.setCustID(csvRecord[3]);                                                     //CustID
                                    break;
                                    case 4:
                                    record.setTrxTime(TimeConvert.convertTimeToXMLGregorianCalendar(csvRecord[4]));     //TrxTime
                                    break;
                                    case 5:
                                    record.setTransactionType(csvRecord[5]);                                            //TransactionType
                                    break;
                                    case 6:
                                    record.setCurrency(csvRecord[6]);                                                   //Currency
                                    break;
                                    case 7:
                                    record.setAmount(new BigDecimal(csvRecord[7]));                                     //Amount
                                    break;
                                }

                        }
                    records.add(record);
                }

                // Set the list of records in voucher_entry
                voucherEntry.getRecord().addAll(records);

                // Create the JAXB context and marshaller
                JAXBContext context = JAXBContext.newInstance(VoucherEntry.class);
                Marshaller marshaller = context.createMarshaller();

                // Set the marshaller properties
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                // Marshal the voucherEntry object to an XML file
                // user.dir and File.seperator is used to ensure cross-platform and environment compatibility
                marshaller.marshal(voucherEntry, new File(System.getProperty("user.dir") + File.separator + "Output File" + File.separator + "voucher_entry.xml"));
                
                System.out.println("XML file created successfully.");

            } catch (JAXBException e) {
                e.printStackTrace();
            }
            

      }
}
