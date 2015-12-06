import greenfoot.*;

/**
 * Write a description of class alpha0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alpha0 extends Levels
{

    /**
     * Constructor for objects of class alpha0.
     * 
     */
    public alpha0()
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
    }
}
