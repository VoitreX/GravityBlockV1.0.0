import greenfoot.*;

/**
 * Write a description of class curser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curser extends Player
{
    public int gravityNumber = 0;
    private int gravityNumberTimer = 0;
    private int gravityNumberTimer2 = 0;
    /**
     * Act - do whatever the curser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gravity();
        changeGravity();
        //System.out.println(gravityNumber);
    }    
    public void gravity(){
        if (gravityNumber == 0)setLocation(getX(), getY()+3);
        if (gravityNumber == 1)setLocation(getX()+3, getY());
        if (gravityNumber == 2)setLocation(getX(), getY()-3);
        if (gravityNumber == 3)setLocation(getX()-3, getY());
    }
    public void changeGravity(){
        if (gravityNumberTimer <= 21)gravityNumberTimer++;
        if (gravityNumberTimer2 <= 21)gravityNumberTimer2++;
        if (gravityNumber == -1) gravityNumber = 3;
        if (gravityNumber == 4) gravityNumber = 0;
        if (Greenfoot.isKeyDown("left") && gravityNumberTimer >= 20){
            setGravityNumber(getGravityNumber() - 1); 
            gravityNumberTimer = 0;
        }
        if (Greenfoot.isKeyDown("right") && gravityNumberTimer2 >= 20){
            setGravityNumber(getGravityNumber() + 1);
            gravityNumberTimer2 = 0;
        }
    }
    public int getGravityNumber(){
        return gravityNumber;
    }
    public void setGravityNumber(int a){
        gravityNumber = a;
    }
}
