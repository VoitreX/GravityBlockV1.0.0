import greenfoot.*;

/**
 * Write a description of class Alpha1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpha1 extends AlphaLevels
{

    /**
     * Constructor for objects of class Alpha1.
     * 
     */
    public Alpha1()
    {

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Curser curser = new Curser();
        addObject(curser, 658, 332);
        transportBlock transportblock2 = new transportBlock();
        addObject(transportblock2, 930, 130);
        redBlock redblock8 = new redBlock();
        addObject(redblock8, 510, 61);
        redBlock redblock9 = new redBlock();
        addObject(redblock9, 664, 281);
        redBlock redblock10 = new redBlock();
        addObject(redblock10, 822, 346);
        redBlock redblock11 = new redBlock();
        addObject(redblock11, 673, 440);
        redblock11.setLocation(664, 434);
        redblock10.setLocation(806, 361);
        redBlock redblock12 = new redBlock();
        addObject(redblock12, 440, 369);
    }
    
    public void act(){
        nextLevel(new Alpha2());
    }
}
