/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *
 * @author HASA
 */
public class ScreenLockFactory {

   
     public ScreenLock selectlock(String type) 
    {
        if(type==null||type.isEmpty())
            return null;
        if("Pattern".equals(type))
        {
            return new Pattern();
        }
        if("PIN".equals(type))
        {
            return new PIN();
        }
         
        if("Password".equals(type))
        {
            return new Password();
        }
        
        return null;
    }
}
