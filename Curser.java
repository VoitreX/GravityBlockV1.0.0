import greenfoot.*;

/**
 * Write a description of class curser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curser extends Player
{

    //Start Booleans
    public static boolean Alpha1 = false;
    public static boolean Alpha2 = false;
    public static boolean Alpha3 = false;
    public static boolean Alpha4 = false;
    public static boolean Alpha5 = false;
    public static boolean Alpha6 = false;
    public static boolean Alpha7 = false;
    public static boolean Alpha8 = false;
    public static boolean Alpha9 = false;
    //End Booleans

    //Start ints
    public int gravityNumber = 0;
    private int gravityNumberTimer = 0;
    private int gravityNumberTimer2 = 0;
    private int acceleration = 1;
    private int accelerationTimer = 0;
    //End ints

    //Start Curser animation
    private GreenfootImage right = new GreenfootImage ("curser1Dot.png");
    private GreenfootImage left = new GreenfootImage ("curser3Dot.png");
    private GreenfootImage up = new GreenfootImage ("curser4Dot.png");
    private GreenfootImage down = new GreenfootImage ("curser2Dot.png");
    //End Curser animations
    /**
     * Act - do whatever the curser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        avalibleLevels();
        gravity();
        changePicture();
        hitRedBlock();
        changeGravity(); 
        isTouchingBlock();
        checkTransportBlock();
        //System.out.println(Alpha1);
    }    

    public void gravity(){
        setLocation(getX(), getY()+(3*(acceleration)));
        //if (gravityNumber == 0)setLocation(getX(), getY()+(3*(acceleration)));
        //if (gravityNumber == 1)setLocation(getX()+(3*(acceleration)), getY());
        //if (gravityNumber == 2)setLocation(getX(), getY()-(3*(acceleration)));
        //if (gravityNumber == 3)setLocation(getX()-(3*(acceleration)), getY());
    }

    public void changeGravity(){
        if (gravityNumberTimer <= 11)gravityNumberTimer++;
        if (gravityNumberTimer2 <= 11)gravityNumberTimer2++;
        if (gravityNumber == -1) gravityNumber = 3;
        if (gravityNumber == 4) gravityNumber = 0;
        if (Greenfoot.isKeyDown("left") && gravityNumberTimer >= 10){
            setGravityNumber(getGravityNumber() - 1); 
            gravityNumberTimer = 0;
        }
        if (Greenfoot.isKeyDown("right") && gravityNumberTimer2 >= 10){
            setGravityNumber(getGravityNumber() + 1);
            gravityNumberTimer2 = 0;
        }
    }

    public void hitRedBlock(){
        if(getOneIntersectingObject(redBlock.class) !=null){
            setLocation(getX(), getY()-(3*(getAcceleration())));
            /*if(gravityNumber == 0){
                setLocation(getX(), getY()-(3*(getAcceleration())));
            }          
            if(gravityNumber == 1){
                setLocation(getX()-(3*(getAcceleration())), getY());
            }
            if(gravityNumber == 2){
                setLocation(getX(), getY()+(3*(getAcceleration())));
            }
            if(gravityNumber == 3){
                setLocation(getX()+(3*(getAcceleration())), getY());
            }    
            setAcceleration(1);*/
        } 
        else constantGravity(); 
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

    public void changeWorld(World a/*, boolean b*/){
        if (checkTransportBlock() == true){
            Greenfoot.setWorld(a);
            //(b) = true;
        }
    }

    public boolean isTouchingBlock(){
        if (getOneIntersectingObject(Blocks.class) != null)return true;
        else return false;
    }

    public void constantGravity(){
        accelerationTimer++;
        if (accelerationTimer >= 20)
        {
            acceleration = acceleration + 1;
            accelerationTimer = 0;

        }
    }

    public int getAcceleration(){
        return acceleration;
    }

    public void setAcceleration(int a){
        acceleration = a;
    }
    
    public void youDied(World a){
        if (getX() <= 470 || getX() >= (getWorld().getWidth()-1) || getY() <= 1 || getY() >= (getWorld().getHeight()-1)){
            Greenfoot.setWorld(a);
        }
    }
    
    public boolean selectLevelTrue(boolean a){
        return a = true;
       
    }
    
    public void avalibleLevels(){
        if (getWorld() instanceof Alpha1){
            Alpha1 = true;
        }
        if (getWorld() instanceof Alpha2){
            Alpha2 = true;
        }
        if (getWorld() instanceof Alpha3){
            Alpha3 = true;
        }
        if (getWorld() instanceof Alpha4){
            Alpha4 = true;
        }
        if (getWorld() instanceof Alpha5){
            Alpha5 = true;
        }
        if (getWorld() instanceof Alpha6){
            Alpha6 = true;
        }
        if (getWorld() instanceof Alpha7){
            Alpha7 = true;
        }
        if (getWorld() instanceof Alpha8){
            Alpha8 = true;
        }
        if (getWorld() instanceof Alpha9){
            Alpha9 = true;
        }
        
        
    }
    
    public boolean getAlpha1(){
        return Alpha1;
    }
    
    public boolean getAlpha2(){
        return Alpha2;
    }
    
    public boolean getAlpha3(){
        return Alpha3;
    }
    
    public boolean getAlpha4(){
        return Alpha4;
    }
    
    public boolean getAlpha5(){
        return Alpha5;
    }
    
    public boolean getAlpha6(){
        return Alpha6;
    }
    
    public boolean getAlpha7(){
        return Alpha7;
    }
    
    public boolean getAlpha8(){
        return Alpha8;
    }
    
    public boolean getAlpha9(){
        return Alpha9;
    }
    
}

