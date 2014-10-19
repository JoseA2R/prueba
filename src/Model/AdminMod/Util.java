/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.AdminMod;

/**
 *
 * @author ricardocasanova
 */
public class Util
{   
    public static final String USER_TAG = "user";
    public static final String USER_NAME_TAG = "name";
    public static final String USER_LASTNAME_TAG = "lastName";
    public static final String USER_ID_TAG = "id";
    public static final String USER_EMAIL_TAG = "email";
    public static final String USER_USERNAME_TAG = "username";
    public static final String USER_PASSWORD_TAG = "pass";
    public static final String USER_REGDATE_TAG = "regDate";
    public static final String USER_ROL_TAG = "rol";
    
    
    public static final String ERROR_USER_NAME_TAG = "Error loading User from XML - Error in the attribute " + USER_NAME_TAG + " of the XML tag";
    public static final String ERROR_USER_LASTNAME_TAG = "Error loading Studen from XML - Error in the attribute " + USER_LASTNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_ID_TAG= "Error loading User from XML - Error in the attribute " + USER_ID_TAG + " of the XML tag";
    public static final String ERROR_USER_EMAIL_TAG= "Error loading User from XML - Error in the attribute " + USER_EMAIL_TAG + " of the XML tag";
    public static final String ERROR_USER_USERNAME_TAG= "Error loading User from XML - Error in the attribute " + USER_USERNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_PASSWORD_TAG= "Error loading User from XML - Error in the attribute " + USER_PASSWORD_TAG + " of the XML tag";
    public static final String ERROR_REGDATE_TAG= "Error loading User from XML - Error in the attribute " + USER_REGDATE_TAG + " of the XML tag";
    public static final String ERROR_USER_ROL_TAG= "Error loading User from XML - Error in the attribute " + USER_ROL_TAG + " of the XML tag";
    
    public static final String ERROR_XML_EMPTY_FILE = "Error loading XML file - The file is empty";
    public static final String ERROR_XML_PROCESSING_FILE = "Error loading XML file - It's not possible processing the file";
    public static final String ERROR_XML_USER_ID_NOT_EXIST = "Error loading XML file - The professor don't exist";
    
    public static final String USERS_XML_PATH = "src/Model/AdminMod/users.xml";
}
