import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {

        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,1*50,11*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,1*50,10*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,2*50,9*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,2*50,7*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,3*50,7*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,4*50,8*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,5*50,9*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,6*50,9*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,7*50,9*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,8*50,8*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,9*50,7*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,10*50,6*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,11*50,5*50);
        
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,53,38);

        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,558,314);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,283,265);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,419,159);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,452,475);
        SpeedBoost speedBoost5 = new SpeedBoost();
        addObject(speedBoost5,183,519);
        SpeedBoost speedBoost6 = new SpeedBoost();
        addObject(speedBoost6,90,243);
        SpeedBoost speedBoost7 = new SpeedBoost();
        addObject(speedBoost7,44,348);
        SpeedBoost speedBoost8 = new SpeedBoost();
        addObject(speedBoost8,402,528);
        SpeedBoost speedBoost9 = new SpeedBoost();
        addObject(speedBoost9,463,74);

        EnnemyFlyer ennemyFlyer = new EnnemyFlyer();
        addObject(ennemyFlyer,251,174);
        EnnemyFlyer ennemyFlyer2 = new EnnemyFlyer();
        addObject(ennemyFlyer2,334,151);
        EnnemyFlyer ennemyFlyer3 = new EnnemyFlyer();
        addObject(ennemyFlyer3,199,285);
        EnnemyFlyer ennemyFlyer4 = new EnnemyFlyer();
        addObject(ennemyFlyer4,308,338);
        EnnemyFlyer ennemyFlyer5 = new EnnemyFlyer();
        addObject(ennemyFlyer5,302,571);
        EnnemyFlyer ennemyFlyer6 = new EnnemyFlyer();
        addObject(ennemyFlyer6,123,560);
        EnnemyFlyer ennemyFlyer7 = new EnnemyFlyer();
        addObject(ennemyFlyer7,526,552);
        EnnemyFlyer ennemyFlyer8 = new EnnemyFlyer();
        addObject(ennemyFlyer8,588,432);
        EnnemyFlyer ennemyFlyer9 = new EnnemyFlyer();
        addObject(ennemyFlyer9,595,550);

        EnnemyWalker ennemyWalker = new EnnemyWalker(true);
        addObject(ennemyWalker, 250, 300);
        EnnemyWalker ennemyWalker2 = new EnnemyWalker(false);
        addObject(ennemyWalker2,304,50);
        EnnemyWalker ennemyWalker3 = new EnnemyWalker(true);
        addObject(ennemyWalker3,252,536);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,547,548);
    }
}
