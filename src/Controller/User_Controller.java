/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.AdminMod.User;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;


/**
 *
 * @author LaMitologica
 */
public class User_Controller{ 

    private static UserXmlFile manageUserXmlFile = new UserXmlFile();
        
    public static boolean IsUser (String Nick, String Password)
    {
        boolean isUser;
        
        
        try
        {
            isUser=manageUserXmlFile.valUser(Nick,Password);   
            
            if (isUser)
                return true;
            else
                return false;        
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public static User getUser(String Nick){
        User user = new User();
        return user;
    }
    
    public static boolean regUser(String name,String lastName,String iD,String userName,String pass,
                           String email,Date regDate, int rol){
        User user = new User(name,lastName,iD,userName,pass,email,regDate,rol);
        
        boolean saved = manageUserXmlFile.saveUserInDataBase(user);
        
        return saved;
    }
    
}
