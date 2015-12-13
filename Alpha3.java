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
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha4());
        restartLevel(new Alpha3());
    }
}
