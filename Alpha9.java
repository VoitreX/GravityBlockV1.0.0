import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Alpha9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha9 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Alpha9.
     * 
     */
    public Alpha9()
    {
        prepare();
    }
    
    Curser curser = new Curser();
    
    public void prepare(){
        addObject(curser, 658, 332);
    }
    public void act(){
        nextLevel(new Beta0());
        restartLevel(new Alpha9());
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
