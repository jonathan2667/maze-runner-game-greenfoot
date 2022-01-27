import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnnemyFlyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnnemyFlyer extends Ennemies
{
    /**
     * Act - do whatever the EnnemyFlyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnnemyFlyer() {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void act()
    {
        // Add your action code here.
        move(5);
        wrapAtEdge();
    }
    

}
