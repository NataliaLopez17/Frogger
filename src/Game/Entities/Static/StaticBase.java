package Game.Entities.Static;

import java.awt.Graphics;
import java.awt.Rectangle;

import Game.Entities.EntityBase;
import Game.World.BaseArea;
import Main.Handler;


public class StaticBase extends EntityBase {

    private BaseArea SpawnableArea;
    
    private int height=64,width=64,x,y;
    protected Rectangle bounds;

    StaticBase(Handler handler) {
        super(handler);
        
        bounds = new Rectangle(0, 0, width,height);
    }

    /*
     * Draws the hazard, and the Rectangle.
     */
    @Override
	public void render(Graphics g) {
    	
    }
    
    @Override
	public void tick() {
    	
    }
    
    @Override
	public Rectangle getCollisionBounds(float xOffset, float yOffset){
        return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }
    
    public BaseArea getSpawnableArea() {
        return SpawnableArea;
    }

    public void setSpawnableArea(BaseArea spawnableArea) {
        SpawnableArea = spawnableArea;
    }

    /*
     * Obtains the Rectangle of this Area.
     */
	public Rectangle GetCollision() {
		return new Rectangle();
	}
}
