package Game.Entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import Main.Handler;

public class EntityBase {


    Handler handler;
    private int height=64,width=64,x,y;
    protected Rectangle bounds;


    public EntityBase( Handler handler) {
        this.handler = handler;
        
        bounds = new Rectangle(0, 0, width,height);

    }


    public Rectangle getCollisionBounds(float xOffset, float yOffset){
        return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }
    
    public void tick(){

    }

    public void render(Graphics g){

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
