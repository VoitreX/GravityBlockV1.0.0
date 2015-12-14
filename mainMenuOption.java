import greenfoot.*;

/**
 * Write a description of class mainMenuOption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenuOption extends Menu
{

    /**
     * Constructor for objects of class mainMenuOption.
     * 
     */
    public mainMenuOption()
    {

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Volume volume2 = new Volume();
        addObject(volume2, getWidth()/5, getHeight()/5);
        Plus plus2 = new Plus();
        addObject(plus2, (getWidth()/8)*3, getHeight()/5);
        Minus minus2 = new Minus();
        addObject(minus2, (getWidth()/8)*4, getHeight()/5);
        Back back = new Back();
        addObject(back, (getWidth()/5), 4*(getHeight()/5));
    }
}
