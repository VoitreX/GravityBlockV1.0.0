import greenfoot.*;

/**
 * Write a description of class Alpha9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha9 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha9.
     * 
     */
    public Alpha9()
    {
        prepare();
    }
    public void prepare(){
        Curser curser = new Curser();
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Beta0());
        restartLevel(new Alpha9());
    }
}
