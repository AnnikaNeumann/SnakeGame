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
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame(){
        //create new game with new apple to get to, start timer and running set to true
        newApple();
        running=true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }
    //turn gui into grid for x and y coordinates
    public void draw(Graphics g){
        for (int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++){
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
    }

    public void newApple(){
        //create coordinates for next apple to be spread evenly within frame
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleX = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public void move(){
        //shifts body parts around the coordinates
        for(int i = bodyParts;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        //create different direction snake is headed with switch statement

        switch(direction){
            case 'U':
                y[0] = y[0]-UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0]+UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0]-UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0]+UNIT_SIZE;
                break;


        }



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
