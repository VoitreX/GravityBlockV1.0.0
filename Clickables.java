import greenfoot.*;

/**
 * Write a description of class Clickables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clickables extends Actor
{
    /**
     * Act - do whatever the Clickables wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public Clickables(){
               
    }
    public void clickChangeLevel(World a){
        if (Greenfoot.mouseClicked(this))Greenfoot.setWorld(a);
    }
    
}
