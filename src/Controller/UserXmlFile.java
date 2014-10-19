/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AdminMod.User;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.JDOMParseException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import Model.AdminMod.MyOwnUtilFuntions;

/**
 *
 * @author ricardocasanova
 */
public class UserXmlFile
{
    User register = new User();
   
    
   /*
    * Validates User and Password
    */
    public boolean valUser(String Nick, String Password){
        return true;
    }
 
   /*
    * Gets an user from UserXmlFile
    */
    public User getUser(String Nick, String Password){
        return register;
    }
  
    public static boolean readUserFromDataBase(User user)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          name, lastName, id, email, pass;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);

                name            = child.getAttributeValue(Util.USER_NAME_TAG);
                lastName        = child.getAttributeValue(Util.USER_LASTNAME_TAG);
                id              = child.getAttributeValue(Util.USER_ID_TAG);

                if(name != null             && name.equals(user.getName()) &&
                   lastName != null         && lastName.equals(user.getLastName()) &&
                   id != null               && id.equals(user.getId()))
                {
                    found = true;
                }
                else
                {
                    if (name == null)
                        System.out.println(Util.ERROR_USER_NAME_TAG);

                    if (lastName == null)
                        System.out.println(Util.ERROR_USER_LASTNAME_TAG);

                    if (id == null)
                        System.out.println(Util.ERROR_USER_ID_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return found;
    }
    
    public static User readUserFromDataBase(String nick)
    {
        User         user = null;
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          name, lastName, id, email, userName, pass, regDate, sRol;
        Date date = new Date();
        int rol=0;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);

                name            = child.getAttributeValue(Util.USER_NAME_TAG);
                lastName        = child.getAttributeValue(Util.USER_LASTNAME_TAG);
                id              = child.getAttributeValue(Util.USER_ID_TAG);
                email           = child.getAttributeValue(Util.USER_EMAIL_TAG);
                userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                pass            = child.getAttributeValue(Util.USER_PASSWORD_TAG);
                date            = MyOwnUtilFuntions.ConvertToDate(child.getAttributeValue(Util.USER_REGDATE_TAG));
                rol             = Integer.valueOf(child.getAttributeValue(Util.USER_ROL_TAG));

                if(name != null && lastName != null && id != null && email != null &&
                   userName != null && pass != null && date != null && 
                   child.getAttributeValue(Util.USER_ROL_TAG) != null && userName.equals(nick))
                {
                    user = new User(name, lastName, id, userName, pass, email, date, rol);
                    found = true;
                }
                else
                {
                    if (name == null)
                        System.out.println(Util.ERROR_USER_NAME_TAG);

                    if (lastName == null)
                        System.out.println(Util.ERROR_USER_LASTNAME_TAG);
                    
                    if (id == null)
                        System.out.println(Util.ERROR_USER_ID_TAG);
                    
                    if (email == null)
                        System.out.println(Util.ERROR_USER_EMAIL_TAG);
                    
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    if (pass == null)
                        System.out.println(Util.ERROR_USER_PASSWORD_TAG);
                    
                    if (date == null)
                        System.out.println(Util.ERROR_USER_REGDATE_TAG);
                    
                    if (child.getAttributeValue(Util.USER_ROL_TAG) == null)
                        System.out.println(Util.ERROR_USER_ROL_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return user;
    }
    
    public static void readAllUsersFromDataBase(ArrayList<User> listUser)
    {
        User         user = null;
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          name, lastName, id, address, telephone, userName, pass, email;
        int             pos = 0, rol;
        Date date = new Date();

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);

                name            = child.getAttributeValue(Util.USER_NAME_TAG);
                lastName        = child.getAttributeValue(Util.USER_LASTNAME_TAG);
                id              = child.getAttributeValue(Util.USER_ID_TAG);
                email              = child.getAttributeValue(Util.USER_EMAIL_TAG);
                userName              = child.getAttributeValue(Util.USER_USERNAME_TAG);
                pass              = child.getAttributeValue(Util.USER_PASSWORD_TAG);
                date              = MyOwnUtilFuntions.ConvertToDate(child.getAttributeValue(Util.USER_REGDATE_TAG));
                rol              = Integer.valueOf(child.getAttributeValue(Util.USER_ROL_TAG));

                if(name != null && lastName != null && id != null && email != null &&
                   userName != null && pass != null && date != null && 
                   child.getAttributeValue(Util.USER_ROL_TAG) != null)
                {
                    
                    user = new User(name, lastName, id, userName, pass, email, date, rol);
                    
                    listUser.add(user);
                }
                else
                {
                    if (name == null)
                        System.out.println(Util.ERROR_USER_NAME_TAG);

                    if (lastName == null)
                        System.out.println(Util.ERROR_USER_LASTNAME_TAG);

                    if (id == null)
                        System.out.println(Util.ERROR_USER_ID_TAG);
                    
                    if (email == null)
                        System.out.println(Util.ERROR_USER_EMAIL_TAG);
                    
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    if (pass == null)
                        System.out.println(Util.ERROR_USER_PASSWORD_TAG);
                    
                    if (date == null)
                        System.out.println(Util.ERROR_USER_REGDATE_TAG);
                    
                    if (child.getAttributeValue(Util.USER_ROL_TAG) == null)
                        System.out.println(Util.ERROR_USER_ROL_TAG);
                }
                
                pos++;
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
    }
    

    public static boolean saveUserInDataBase(User user)
    {
        Document    doc;
        Element     root, newChild;

        SAXBuilder  builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            // Creamos una nueva etiqueta
            newChild = new Element(Util.USER_TAG);

            // Añadimos un atributo
            newChild.setAttribute(Util.USER_NAME_TAG, user.getName());
            newChild.setAttribute(Util.USER_LASTNAME_TAG, user.getLastName());
            newChild.setAttribute(Util.USER_ID_TAG, user.getId());
            newChild.setAttribute(Util.USER_EMAIL_TAG, user.getEmail());
            newChild.setAttribute(Util.USER_USERNAME_TAG, user.getUserName());
            newChild.setAttribute(Util.USER_PASSWORD_TAG, user.getPass());
            newChild.setAttribute(Util.USER_REGDATE_TAG, MyOwnUtilFuntions.ConvertToString(user.getRegDate()));
            newChild.setAttribute(Util.USER_ROL_TAG, String.valueOf(user.getRol())); 

            // La añadimos como hija a una etiqueta ya existente
            root.addContent(newChild);

            try
            {
                Format format = Format.getPrettyFormat();

                /* Se genera un flujo de salida de datos XML */
                XMLOutputter out = new XMLOutputter(format);

                /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                FileOutputStream file = new FileOutputStream(Util.USERS_XML_PATH);

                /* Se manda el documento generado hacia el archivo XML */
                out.output(doc,file);

                /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                file.flush();
                file.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return true;
    }
}
