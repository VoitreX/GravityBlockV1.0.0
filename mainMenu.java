import greenfoot.*;

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends Menu
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GravityBlocks gravityblocks = new GravityBlocks();
        addObject(gravityblocks, getWidth()/2, (getHeight()/5)*1);
        Play play = new Play();
        addObject(play, getWidth()/2, (getHeight()/16)*9);
        MenuOptions menuoptions = new MenuOptions();
        addObject(menuoptions, getWidth()/4, 5*(getHeight()/6));
        LevelSelect levelselect = new LevelSelect();
        addObject(levelselect, (getWidth()/4)*3, 5*(getHeight()/6));
        
        
        
    }
}
