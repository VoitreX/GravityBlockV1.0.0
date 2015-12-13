import greenfoot.*;

/**
 * Write a description of class mainMenuLevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenuLevelSelect extends Menu
{

    //Start Booleans
    public boolean Alpha1 = false;
    public boolean Alpha2 = false;
    public boolean Alpha3 = false;
    public boolean Alpha4 = false;
    public boolean Alpha5 = false;
    public boolean Alpha6 = false;
    public boolean Alpha7 = false;
    public boolean Alpha8 = false;
    public boolean Alpha9 = false;
    //End Booleans
    
    /**
     * Constructor for objects of class mainMenuLevelSelect.
     * 
     */
    public mainMenuLevelSelect()
    {

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Curser curser = new Curser();
        
        redAlpha0 redalpha0 = new redAlpha0();
        addObject(redalpha0, getWidth()/16, getHeight()/10);
        redAlpha1 redalpha1 = new redAlpha1();
        if (curser.getAlpha1() == true)addObject(redalpha1, getWidth()/16, 3*(getHeight()/10));
        redAlpha2 redalpha2 = new redAlpha2();
        if (curser.getAlpha2() == true)addObject(redalpha2, getWidth()/16, 5*(getHeight()/10));
        redAlpha3 redalpha3 = new redAlpha3();
        if (curser.getAlpha3() == true)addObject(redalpha3, getWidth()/16, 7*(getHeight()/10));
        redAlpha4 redalpha4 = new redAlpha4();
        if (curser.getAlpha4() == true)addObject(redalpha4, getWidth()/16, 9*(getHeight()/10));
        redAlpha5 redalpha5 = new redAlpha5();
        if (curser.getAlpha5() == true)addObject(redalpha5, (getWidth()/16)*3, getHeight()/10);
        redAlpha6 redalpha6 = new redAlpha6();
        if (curser.getAlpha6() == true)addObject(redalpha6, (getWidth()/16)*3, 3*(getHeight()/10));
        redAlpha7 redalpha7 = new redAlpha7();
        if (curser.getAlpha7() == true)addObject(redalpha7, (getWidth()/16)*3, 5*(getHeight()/10));
        redAlpha8 redalpha8 = new redAlpha8();
        if (curser.getAlpha8() == true)addObject(redalpha8, (getWidth()/16)*3, 7*(getHeight()/10));
        redAlpha9 redalpha9 = new redAlpha9();
        if (curser.getAlpha9() == true)addObject(redalpha9, (getWidth()/16)*3, 9*(getHeight()/10));
    }
}
