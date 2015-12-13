import greenfoot.*;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Clickables
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        playNextLevel();
    }  

    public Play(){
        super();
    }

    public void playNextLevel(){
        Curser curser = new Curser();
        if (curser.getAlpha9() == true)clickChangeLevel(new Alpha9());
        else if (curser.getAlpha8() == true)clickChangeLevel(new Alpha8());
        else if (curser.getAlpha7() == true)clickChangeLevel(new Alpha7());
        else if (curser.getAlpha6() == true)clickChangeLevel(new Alpha6());
        else if (curser.getAlpha5() == true)clickChangeLevel(new Alpha5());
        else if (curser.getAlpha4() == true)clickChangeLevel(new Alpha4());
        else if (curser.getAlpha3() == true)clickChangeLevel(new Alpha3());
        else if (curser.getAlpha2() == true)clickChangeLevel(new Alpha2());
        else if (curser.getAlpha1() == true)clickChangeLevel(new Alpha1());
        else clickChangeLevel(new Alpha0());

    }
}
