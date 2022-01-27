import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnnemyWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnnemyWalker extends Ennemies
{
    /**
     * Act - do whatever the EnnemyWalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    
    public EnnemyWalker(boolean upAndDown) {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        upDown = upAndDown;
    }

    public void act()
    {
        // Add your action code here.
        moveAround();
        ennemyHitWalls();
            
    }
    
    public void ennemyHitWalls() {
        if (hitWalls() || isAtEdge()) {
             speed = -speed; 
        }            
    }
    
    private void moveAround() {
        int x = getX();
        int y = getY();

        if (upDown) {
            setLocation(x, y + speed);
        }
        else if (!upDown) {
            setLocation(x + speed, y );
        }
    }
}
