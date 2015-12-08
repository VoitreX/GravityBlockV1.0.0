import greenfoot.*;

/**
 * Write a description of class Alpha2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha2 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha2.
     * 
     */
    public Alpha2()
    {
    }
    public void act(){
        nextLevel(new Alpha3());
    }
}
