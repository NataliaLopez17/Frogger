package Game.Entities.Static;

import java.awt.Graphics;
import java.awt.Rectangle;

import Main.Handler;
import Resources.Images;

public class RamenLog extends StaticBase {

    public Rectangle ramenLog;
	
    public RamenLog(Handler handler,int xPosition, int yPosition) {
        super(handler);
        // Sets original position to be this one.
        this.setY(yPosition);
        this.setX(xPosition);
        
    }
    
    @Override
    public void render(Graphics g) {
    	
    	g.drawImage(Images.ramenLog, this.getX(), this.getY(), 64, 64, null);
    	ramenLog = new Rectangle(this.getX(), this.getY()+5, 64, 55);

    }
    
    
    @Override
    public Rectangle GetCollision() {
    	
    	return ramenLog;
    }
}
