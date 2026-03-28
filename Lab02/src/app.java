package Lab02.src;
import javax.swing.*;

public class app {
    public static void main(String[] args) throws Exception {
        JFrame mainWindow = new JFrame("Flappy Bird");

        int boardWidth = 360;
        int boardHeight = 640;
        mainWindow.setSize(boardWidth, boardHeight);

        // Nằm giữa màn hình
        mainWindow.setLocationRelativeTo(null);

        // Không cho phép thay đổi kích thước
        mainWindow.setResizable(false);

        flappyBird flappyBird = new flappyBird();
        mainWindow.add(flappyBird);

        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}