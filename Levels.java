import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends Super
{
    public List<Curser> curserList;
    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels()
    {
        UI ui = new UI();
        addObject(ui, 225, 360);
        UIMainMenu uimainmenu = new UIMainMenu();
        addObject(uimainmenu, 227, 585);
        UILevelSelect uilevelselect = new UILevelSelect();
        addObject(uilevelselect, 228, 428);
        centerDot centerdot = new centerDot();
        addObject(centerdot, 865, 360);
    }
    

    public void nextLevel(World a /*, boolean b*/){
        curserList = getObjects(Curser.class);
        curserList.get(0).changeWorld(a/*, b*/);

        //Probs Need to take out and program for every World
    }

    public void progressLevel(boolean a){
        curserList = getObjects(Curser.class);
        curserList.get(0).selectLevelTrue(a);
    }
    
    public void restartLevel(World a){
        curserList.get(0).youDied(a);
    }
}
