import greenfoot.*;

/**
 * Write a description of class Alpha5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha5 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha5.
     * 
     */
    public Alpha5()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha6());
        restartLevel(new Alpha5());
    }
}
