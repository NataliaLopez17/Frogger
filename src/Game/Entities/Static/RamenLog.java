package Game.Entities.Static;

import java.awt.Graphics;
import java.awt.Rectangle;

import Main.Handler;
import Resources.Images;

public class RamenLog extends StaticBase {

    public static Rectangle ramenLog;
	
    public RamenLog(Handler handler,int xPosition, int yPosition) {
        super(handler);
        // Sets original position to be this one.
        this.setY(yPosition);
        this.setX(xPosition);
        
        bounds.x=0;
        bounds.y=0;
        bounds.width = 64;
        bounds.height = 64;
        
        ramenLog = new Rectangle();
        
    }
    
    @Override
    public void render(Graphics g) {
    	
    	g.drawImage(Images.ramenLog, this.getX(), this.getY(), 64, 64, null);
    	ramenLog = new Rectangle(this.getX()+40, this.getY()+5, 64, 55);

    }
    
    
    @Override
    public Rectangle GetCollision() {
    	
    	return ramenLog;
    }
}
