package homework9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener{
    private static final int MAP_SIZE = 3;
    private static final int WINDOW_SIZE = 350;
    private static final ImageIcon ICON_DEF = new ImageIcon(Game.class.getResource("default.png"));
    private static final ImageIcon ICON_X = new ImageIcon(Game.class.getResource("X.png"));
    private static final ImageIcon ICON_O = new ImageIcon(Game.class.getResource("O.png"));
    private static final int ICON_X_HASH = ICON_X.hashCode();
    private static final int ICON_O_HASH = ICON_O.hashCode();
    public Game() {
        createWindow();
    }

    private void createWindow() {
        //Создание окна
        setTitle("Крестики нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, WINDOW_SIZE, WINDOW_SIZE);
        setVisible(true);
        setResizable(false);

        //Создание кнопок
        JButton[][] jbs = new JButton[MAP_SIZE][MAP_SIZE];
        setLayout(new GridLayout(MAP_SIZE, MAP_SIZE));
        for (int i = 0; i < jbs.length; i++) {
            for (int j = 0; j < jbs[i].length; j++) {
                JButton jButton = new JButton(ICON_DEF);
                jbs[i][j] = jButton;
                jButton.addActionListener(this);
                add(jbs[i][j]);
            }
        }
        System.out.println(ICON_X_HASH);
        System.out.println(ICON_O_HASH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Кнопка нажата");
        //TODO: перенести логику из 5го ДЗ
        //1. При нажатии кнопки рисовать кнопку X.png
        //2. Делаем проверку на победу
        //3. После этого ходит компьютер - рисует кнопку O.png
        //4. Делаем проверку на победу
        //5. Если после п.2 или п.4 игра закончилась - создать новое окно с предложением сыграть еще раз
    }
}
