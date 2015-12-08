import greenfoot.*;

/**
 * Write a description of class Alpha3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha3 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha3.
     * 
     */
    public Alpha3()
    {
    }
    public void act(){
        nextLevel(new Alpha3());
    }
}
