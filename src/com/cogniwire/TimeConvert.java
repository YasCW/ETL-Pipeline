package com.cogniwire;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class TimeConvert {

        public static XMLGregorianCalendar convertTimeToXMLGregorianCalendar(String time) {
        if (time == null || time.length() != 6) {
            throw new IllegalArgumentException("Time must be in the format HHMMSS");
        }

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(2, 4));
        int second = Integer.parseInt(time.substring(4, 6));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(GregorianCalendar.HOUR_OF_DAY, hour);
        gregorianCalendar.set(GregorianCalendar.MINUTE, minute);
        gregorianCalendar.set(GregorianCalendar.SECOND, second);
        gregorianCalendar.set(GregorianCalendar.MILLISECOND, 0);

        XMLGregorianCalendar xmlGregorianCalendar = null;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return xmlGregorianCalendar;
    }


    public static XMLGregorianCalendar convertDateToXMLGregorianCalendar(String date) {
        if (date == null || date.length() != 8) {
            throw new IllegalArgumentException("Date must be in the format DDMMYYYY");
        }

        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(2, 4)) - 1; // Month in GregorianCalendar is 0-based
        int year = Integer.parseInt(date.substring(4, 8));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(GregorianCalendar.DAY_OF_MONTH, day);
        gregorianCalendar.set(GregorianCalendar.MONTH, month);
        gregorianCalendar.set(GregorianCalendar.YEAR, year);
        gregorianCalendar.set(GregorianCalendar.HOUR_OF_DAY, 0);
        gregorianCalendar.set(GregorianCalendar.MINUTE, 0);
        gregorianCalendar.set(GregorianCalendar.SECOND, 0);
        gregorianCalendar.set(GregorianCalendar.MILLISECOND, 0);

        XMLGregorianCalendar xmlGregorianCalendar = null;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return xmlGregorianCalendar;
    }

}
