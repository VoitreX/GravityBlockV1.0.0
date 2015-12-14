import greenfoot.*;
import java.util.*;
/**
 * Write a description of class alpha0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha0 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class alpha0.
     * 
     */

    public Alpha0()
    {

        prepare();
    }

    Curser curser = new Curser();
    transportBlock transportblock = new transportBlock();
    redBlock redblock = new redBlock();
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(curser, 865, 332);
        addObject(transportblock, 600, 360);
        addObject(redblock, 865, 415);
        
    }

    public void act(){
        changeOrientation();
        nextLevel(new Alpha1());
        restartLevel(new Alpha0());
    }
    
    public void changeOrientation(){
        curserList = getObjects(Curser.class);
        curserList.get(0).getGravityNumber();

        if (curser.getGravityNumber() == 0){
            transportblock.setLocation(600, 360);
            redblock.setLocation(865, 415);
        }
        if (curser.getGravityNumber() == 1){
            transportblock.setLocation(865, 360+260);
            redblock.setLocation(920, 360);
        }
        if (curser.getGravityNumber() == 2){
            transportblock.setLocation(600+520, 360);
            redblock.setLocation(865, 406-110);
        }
        if (curser.getGravityNumber() == 3){
            transportblock.setLocation(865, 360-260);
            redblock.setLocation(865-55, 360);
        }        
    }
}