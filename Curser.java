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

    private GreenfootImage right = new GreenfootImage ("curser1Dot.png");
    private GreenfootImage left = new GreenfootImage ("curser3Dot.png");
    private GreenfootImage up = new GreenfootImage ("curser4Dot.png");
    private GreenfootImage down = new GreenfootImage ("curser2Dot.png");

    /**
     * Act - do whatever the curser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gravity();
        changePicture();
        hitRedBlock();
        changeGravity();        
        checkTransportBlock();
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

    public void hitRedBlock(){
        if(getOneIntersectingObject(redBlock.class) !=null){
            if(gravityNumber == 0){
                setLocation(getX(), getY()-3);
            }          
            if(gravityNumber == 1){
                setLocation(getX()-3, getY());
            }
            if(gravityNumber == 2){
                setLocation(getX(), getY()+3);
            }
            if(gravityNumber == 3){
                setLocation(getX()+3, getY());
            }    
        }
    }

    public void changePicture(){
        if(gravityNumber == 0){
            setImage(down);
        }          
        if(gravityNumber == 1){
            setImage(right);
        }
        if(gravityNumber == 2){
            setImage(up);
        }
        if(gravityNumber == 3){
            setImage(left);
        }    
    }

    public int getGravityNumber(){
        return gravityNumber;
    }

    public void setGravityNumber(int a){
        gravityNumber = a;
    }

    public boolean checkTransportBlock(){
        if (getWorld().getObjects(transportBlock.class).size() !=0){
            if(getOneIntersectingObject(transportBlock.class)!=null){
                return true;
                }
                else return false;
                }
        return false;
    }  
      
    public void changeWorld(World a){
        if (checkTransportBlock() == true){
            Greenfoot.setWorld(a);
        }
    }
}

