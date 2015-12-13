import greenfoot.*;

/**
 * Write a description of class Alpha7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha7 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha7.
     * 
     */
    public Alpha7()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha8());
        restartLevel(new Alpha7());
    }
}
