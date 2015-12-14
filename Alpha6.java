import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Alpha6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha6 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Alpha6.
     * 
     */
    public Alpha6()
    {
        prepare();
    }
    
    Curser curser = new Curser();
    
    public void prepare(){
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha7());
        restartLevel(new Alpha6());
    }
    
    public void changeOrientation(){
        curserList = getObjects(Curser.class);
        curserList.get(0).getGravityNumber();

        if (curser.getGravityNumber() == 0){
            
        }
        if (curser.getGravityNumber() == 1){
            
        }
        if (curser.getGravityNumber() == 2){
            
        }
        if (curser.getGravityNumber() == 3){
            
        }        
    }
}
