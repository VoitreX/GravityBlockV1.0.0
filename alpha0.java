import greenfoot.*;

/**
 * Write a description of class alpha0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha0 extends AlphaLevels
{
    
    /**
     * Constructor for objects of class alpha0.
     * 
     */

    public Alpha0()
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
        addObject(curser, 658, 332);
        transportBlock transportblock = new transportBlock();
        addObject(transportblock, 668, 640);
        redBlock redblock = new redBlock();
        addObject(redblock, 666, 406);
        transportblock.setLocation(295, 350);
    }

    public void act(){
        
        nextLevel(new Alpha1());
        restartLevel(new Alpha0());
    }
}

