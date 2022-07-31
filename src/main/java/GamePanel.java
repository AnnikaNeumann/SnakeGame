import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    //array holds all coordinates of the snake bodyparts
    final int x[]= new int[GAME_UNITS];
    final int y[]= new int[GAME_UNITS];
    //initial bodyparts of snake
    int bodyParts = 6;
    //start with 0 apples to be eaten
    int applesEaten;
    //set apple x and y coordinate to 0, will appear randomly for snake to head to
    int appleX;
    int appleY;
    //set direction, can be done with character
    char direction = 'R';
    //start game
    boolean running = false;
    Timer timer;
    Random random;

    //CONSTRUCTOR
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();


    }

    public void startGame(){

    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkApple(){

    }

    public void checkCollision(){

    }

    public void GameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
       @Override
       public void keyPressed(KeyEvent e){

       }
    }
}
