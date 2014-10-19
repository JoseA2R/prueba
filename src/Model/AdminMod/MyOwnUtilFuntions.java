/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.AdminMod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class allow enter in determined functions
 * @author Karolyn Mendez & Leonardo Azocar & Jesus Di Bari
 */
public class MyOwnUtilFuntions {
    /**
     * Convert a date into String
     * @param date
     * @return String
     */
    public static String ConvertToString(Date date){
        DateFormat df;
        String dateString;
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        dateString = df.format(date);
        return dateString;
    }
    /**
     * Convert a String into a date
     * @param stringDate
     * @return Date
     */
    public static Date ConvertToDate(String stringDate){
        
        DateFormat df;
        Date date = new Date();
        System.out.println(stringDate);
        df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(stringDate);
            date = df.parse(stringDate);
        } catch (ParseException ex) {
            Logger.getLogger(MyOwnUtilFuntions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
        
    }
    
}
