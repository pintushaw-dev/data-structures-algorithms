package oopsLab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinBallGame extends JPanel implements ActionListener, KeyListener {

    int ballX = 160, ballY = 100;
    int ballDiameter = 20;
    int ballDX = 2, ballDY = 3;

    int paddleX = 140;
    int paddleY = 350;
    int paddleWidth = 100;
    int paddleHeight = 15;

    int score = 0;

    Timer timer;

    public PinBallGame() {
        timer = new Timer(10, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // background
        g.setColor(Color.black);
        g.fillRect(0, 0, 400, 400);

        // ball
        g.setColor(Color.yellow);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);

        // paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, paddleY, paddleWidth, paddleHeight);

        // SCORE DISPLAY
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score : " + score, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ballX += ballDX;
        ballY += ballDY;

        // wall bounce
        if (ballX < 0 || ballX > 380) ballDX = -ballDX;
        if (ballY < 0) ballDY = -ballDY;

        // paddle collision + SCORE UPDATE
        if (ballY + ballDiameter >= paddleY &&
                ballX + ballDiameter >= paddleX &&
                ballX <= paddleX + paddleWidth) {

            ballDY = -ballDY;   // bounce
            score++;            // INCREASE SCORE
        }

        // game over
        if (ballY > 400) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over! Your Score: " + score);
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            paddleX = Math.max(0, paddleX - 20);

        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            paddleX = Math.min(300, paddleX + 20);

        repaint();
    }

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pin Ball Game");
        PinBallGame game = new PinBallGame();
        frame.add(game);
        frame.setSize(420, 440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}