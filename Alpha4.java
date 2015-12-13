import greenfoot.*;

/**
 * Write a description of class Alpha4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha4 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha4.
     * 
     */
    public Alpha4()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha5());
        restartLevel(new Alpha4());
    }
}
