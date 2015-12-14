import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Alpha7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha7 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Alpha7.
     * 
     */
    public Alpha7()
    {
        prepare();
    }
    
    Curser curser = new Curser();
    
    public void prepare(){
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Alpha8());
        restartLevel(new Alpha7());
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
