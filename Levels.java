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
    private List<Curser> curserList;
    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels()
    {
    }

    public void nextLevel(World a){
        curserList = getObjects(Curser.class);
        curserList.get(0).changeWorld(a);
        
        //Probs Need to take out and program for every World
    }
}
