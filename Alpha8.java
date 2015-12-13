import greenfoot.*;

/**
 * Write a description of class Alpha8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha8 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha8.
     * 
     */
    public Alpha8()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha9());
        restartLevel(new Alpha8());
    }
}
