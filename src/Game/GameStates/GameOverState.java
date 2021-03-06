package Game.GameStates;

import Main.Handler;
import Resources.Images;
import UI.UIImageButton;
import UI.UIManager;

import java.awt.*;

import Game.Entities.Dynamic.Player;

/**
 * Created by AlexVR on 7/1/2018.
 */
public class GameOverState extends State {

	public Player player;
    private int count = 0;
    private UIManager uiManager;

    public GameOverState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);

        /*
         * Adds a button that by being pressed changes the State
         */
        uiManager.addObjects(new UIImageButton(160, handler.getGame().getHeight() - 250, 230, 64, Images.restart, () -> {
            handler.getMouseManager().setUimanager(null);
            State.setState(handler.getGame().gameState);
        }));

        uiManager.addObjects(new UIImageButton(33 + 150,  handler.getGame().getHeight() - 150, 170, 64, Images.newTitle, () -> {
            handler.getMouseManager().setUimanager(null);
            State.setState(handler.getGame().menuState);
        }));

    }

    
    @Override
    public void tick() {
        handler.getMouseManager().setUimanager(uiManager);
        uiManager.tick();
        count++;
        if( count>=30){
            count=30;
        }
        if(handler.getKeyManager().pbutt && count>=30){
            count=0;
            State.setState(handler.getGame().gameState);
        }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.gameOver,0,0,handler.getGame().getWidth(),handler.getGame().getHeight(),null);
        g.drawImage(Images.letter,50,200,200,200,null);
        g.drawImage(Images.clouds,230,100,300,150,null);
        g.drawImage(Images.planet,10,450,250,200,null);
        g.drawImage(Images.moon,370,420,200,200,null);
        g.drawImage(Images.spaceShip,0,0,300,300,null);
        uiManager.Render(g);
        g.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		g.setColor(Color.BLACK);
		g.drawString("Score " + Player.score, 300, 180);

    }
}
