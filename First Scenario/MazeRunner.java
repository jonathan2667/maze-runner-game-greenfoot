import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Players
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Constructor Method
    int mazeRunnerLives;
    public MazeRunner(int lives) {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        mazeRunnerLives = lives;
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
        mazeRunnerHit();
        youWin();
        looseLife();
        youLose();
    } 
    
    public void mazeRunnerHit() {
        if (hitEnnemy()) {
            setLocation(50, 40);
        }
    }
    
    public void looseLife() {
        if (hitEnnemy()) {
            mazeRunnerLives--;
        }
    }
    
    public void youLose() {
        if (mazeRunnerLives == 0) {
            getWorld().addObject(new YouLoose(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
