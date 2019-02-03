package Game.World;

import java.awt.Graphics;

import Game.Entities.EntityManager;
import Main.Handler;

public class BaseArea {
    Handler handler;

    int yPosition;

    boolean canStepOn = true;

	private EntityManager entityManager;

    /*
     * Constructs the yPosition of the Tile.
     */
    BaseArea(Handler handler, int yPosition) {
        this.handler = handler;
        this.yPosition = yPosition;
    }

    public void tick(){

    }
    
    public EntityManager getEntityManager() {
		return entityManager;
	}
    
    // Draws the tile.
    public void render(Graphics g) {
    	
    }
    
    public int getYPosition() {
    	return this.yPosition;
    }
    
    public void setYPosition(int position) {
    	this.yPosition = position;
    }
}
