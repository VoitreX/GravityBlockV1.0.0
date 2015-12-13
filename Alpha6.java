import greenfoot.*;

/**
 * Write a description of class Alpha6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha6 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha6.
     * 
     */
    public Alpha6()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha7());
        restartLevel(new Alpha6());
    }
}
