import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Alpha2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha2 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Alpha2.
     * 
     */
    public Alpha2()
    {
        
        prepare();
    }
    
    Curser curser = new Curser();
    redBlock redblock = new redBlock();
    redBlock redblock2 = new redBlock();
    redBlock redblock3 = new redBlock();
    redBlock redblock4 = new redBlock();
    redBlock redblock5 = new redBlock();
    redBlock redblock6 = new redBlock();
    transportBlock transportblock = new transportBlock();
    
    public void prepare(){
        addObject(curser, 865, 360);
        
        //addObject(redblock, 865, 360+60);
        
        addObject(redblock2, 865-120, 360);
        
        //addObject(redblock3, 865-60, 360-60);
        
        addObject(redblock4, 865+60, 360);
        
        addObject(redblock5, 865-60, 360+200);
        
        addObject(redblock6, 865+140, 360+140);
        
        addObject(transportblock, 865+240, 360);
    }

    public void act(){
        changeOrientation();
        nextLevel(new Alpha3());
        restartLevel(new Alpha2());
    }
    
    public void changeOrientation(){
        curserList = getObjects(Curser.class);
        curserList.get(0).getGravityNumber();

        if (curser.getGravityNumber() == 0){
            redblock.setLocation(865, 360+60);
            redblock2.setLocation(865-120, 360);
            redblock3.setLocation(865-60, 360-60);
            redblock4.setLocation(865+60, 360);
            redblock5.setLocation(865-60, 360+200);
            redblock6.setLocation(865+140, 360+140);
            transportblock.setLocation(865+240, 360);
        }
        if (curser.getGravityNumber() == 1){
            redblock.setLocation(865+60, 360);
            redblock2.setLocation(865, 360+120);
            redblock3.setLocation(865-60, 360+60);
            redblock4.setLocation(865, 360-60);
            redblock5.setLocation(865+200, 360+60);
            redblock6.setLocation(865+140, 360-140);
            transportblock.setLocation(865, 360-240);
        }
        if (curser.getGravityNumber() == 2){
            redblock.setLocation(865, 360-60);
            redblock2.setLocation(865+120, 360);
            redblock3.setLocation(865+60, 360+60);
            redblock4.setLocation(865-60, 360);
            redblock5.setLocation(865+60, 360-200);
            redblock6.setLocation(865-140, 360-140);
            transportblock.setLocation(865-240, 360);
        }
        if (curser.getGravityNumber() == 3){
            redblock.setLocation(865-60, 360);
            redblock2.setLocation(865, 360-120);
            redblock3.setLocation(865+60, 360-60);
            redblock4.setLocation(865, 360+60);
            redblock5.setLocation(865-200, 360-60);
            redblock6.setLocation(865-140, 360+140);
            transportblock.setLocation(865, 360+240);
        }        
    }
}
