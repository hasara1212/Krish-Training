
package factorydesignpattern;


public class FactoryDesignPattern {

  
    public static void main(String[] args) {
        ScreenLockFactory screenLockFactory=new ScreenLockFactory();
        ScreenLock screenlock;
        screenlock = screenLockFactory.selectlock("PIN");
        screenlock.screenlocktype();
    }
    
}
