import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Alpha1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha1 extends AlphaLevels
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Alpha1.
     * 
     */
    public Alpha1()
    {

        prepare();
    }

    Curser curser = new Curser();
    transportBlock transportblock2 = new transportBlock();
    redBlock redblock8 = new redBlock();
    redBlock redblock9 = new redBlock();
    redBlock redblock10 = new redBlock();
    redBlock redblock11 = new redBlock();
    redBlock redblock12 = new redBlock();

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        addObject(curser, 865, 360);
        addObject(transportblock2, 865+325, 360);
        addObject(redblock8, 865, 360-240);
        addObject(redblock9, 865, 450);
        addObject(redblock12, 865-130, 360);
        addObject(redblock11, 865+90, 360);

    }

    public void act(){
        changeOrientation();
        nextLevel(new Alpha2());
        restartLevel(new Alpha1());
    }

    public void changeOrientation(){
        curserList = getObjects(Curser.class);
        curserList.get(0).getGravityNumber();

        if (curser.getGravityNumber() == 0){
            redblock9.setLocation(865, 450);
            redblock12.setLocation(865-130, 360);
            redblock8.setLocation(865, 360-240);
            redblock11.setLocation(865+90, 360);
            transportblock2.setLocation(865+325, 360);
        }
        if (curser.getGravityNumber() == 1){
            redblock9.setLocation(865+90, 360);
            redblock12.setLocation(865, 360+130);
            redblock8.setLocation(865-240, 360);
            redblock11.setLocation(865, 360-90);
            transportblock2.setLocation(865, 360-325);
        }
        if (curser.getGravityNumber() == 2){
            redblock9.setLocation(865, 360-90);
            redblock12.setLocation(865+130, 360);
            redblock8.setLocation(865, 360+260);
            redblock11.setLocation(865-90, 360);
            transportblock2.setLocation(865-325, 360);
        }
        if (curser.getGravityNumber() == 3){
            redblock9.setLocation(865-90, 360);
            redblock12.setLocation(865, 360-130);
            redblock8.setLocation(865+240, 360);
            redblock11.setLocation(865, 360+90);
            transportblock2.setLocation(865, 685);
        }        
    }
}
