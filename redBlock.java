import greenfoot.*;

/**
 * Write a description of class redBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redBlock extends Blocks
{
    /**
     * Act - do whatever the redBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void blockCollision(){
        if (getOneIntersectingObject(Curser.class) != null){
            //Curser.setLocation(Curser.getX(), Curser.getY()+3);
        }
    }
}
