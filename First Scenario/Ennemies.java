import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ennemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ennemies extends Movers
{
    /**
     * Act - do whatever the Ennemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void wrapAtEdge() {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1;
        int worldHeight = getWorld().getHeight() - 1;
        if (x >= worldWidth) {
            setLocation(1, y);            
        }
        if (x <=  0) {
            setLocation(worldWidth - 1, y);            
        }
        if (y >= worldHeight) {
            setLocation(x, 1);            
        }
        if (y <=  0) {
            setLocation(x, worldWidth - 1);            
        }
    }
}
