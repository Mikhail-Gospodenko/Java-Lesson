package homework9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class Game extends JFrame implements ActionListener {
    private static final int MAP_SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    private static final int WINDOW_SIZE = 350;
    private static final ImageIcon ICON_DEF = new ImageIcon(Objects.requireNonNull(Game.class.getResource("default.png")));
    private static final ImageIcon ICON_X = new ImageIcon(Objects.requireNonNull(Game.class.getResource("X.png")));
    private static final ImageIcon ICON_O = new ImageIcon(Objects.requireNonNull(Game.class.getResource("O.png")));
    private static final int ICON_X_HASH = ICON_X.hashCode();
    private static final int ICON_O_HASH = ICON_O.hashCode();
    private static final int ICON_DEF_HASH = ICON_DEF.hashCode();
    private final JButton[][] gameField = new JButton[MAP_SIZE][MAP_SIZE];

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
        setLayout(new GridLayout(MAP_SIZE, MAP_SIZE));

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                JButton jButton = new JButton(ICON_DEF);
                gameField[i][j] = jButton;
                jButton.addActionListener(this);
                add(gameField[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        if (!humanTurn(jButton)) {
            return;
        }

        if (isWin(ICON_X_HASH)) {
            System.out.println("Вы победили!");
        }

        ioTurn();
        if (isWin(ICON_O_HASH)) {
            System.out.println("Компьютер победил :(");
        }

    }

    private boolean humanTurn (JButton jButton) {
        if (isCellAvailable(jButton)) {
            jButton.setIcon(ICON_X);
            return true;
        } else {
            return false;
        }
    }

    public void ioTurn() {
        int x, y;
        do {
            x = new Random().nextInt(gameField.length);
            y = new Random().nextInt(gameField.length);
        } while (!isCellAvailable(gameField[x][y]));
        gameField[x][y].setIcon(ICON_O);
    }

    private boolean isCellAvailable(JButton jButton) {
        return jButton.getIcon().hashCode() == ICON_DEF_HASH;
    }

    private boolean isWin(int hash) {
        int hor, ver;
        int diagMain, diagSecond;

        for (int i = 0; i < gameField.length; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j].getIcon().hashCode() == hash) {                          // горизонтальная линия
                    hor++;
                } else if (gameField[i][j].getIcon().hashCode() != hash && hor < DOTS_TO_WIN) {
                    hor = 0;
                }
                if (gameField[j][i].getIcon().hashCode() == hash) {                          // вертикальная линия
                    ver++;
                } else if (gameField[j][i].getIcon().hashCode() != hash && ver < DOTS_TO_WIN) {
                    ver = 0;
                }
            }
            if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
                return true;
            }
        }

        for (int j = 0; j < gameField.length; j++) {
            diagMain = 0;
            for (int i = 0; i < gameField.length; i++) {
                int k = j + i;
                if (k < gameField.length) {
                    if (gameField[i][k].getIcon().hashCode() == hash) {                      // главная диагональ
                        diagMain++;
                    } else if (gameField[i][k].getIcon().hashCode() != hash) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 1; j < gameField.length; j++) {
            diagMain = 0;
            for (int i = 0; i < gameField.length; i++) {
                int k = j + i;
                if (k < gameField.length) {
                    if (gameField[k][i].getIcon().hashCode() == hash) {
                        diagMain++;
                    } else if (gameField[k][i].getIcon().hashCode() != hash) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 0; j < gameField.length; j++) {
            diagSecond = 0;
            for (int i = 0; i < gameField.length; i++) {
                int k = (gameField.length - 1) - i;
                int l = j + i;
                if (k >= 0 && l < gameField.length) {
                    if (gameField[l][k].getIcon().hashCode() == hash) {                     // вторая диагональ
                        diagSecond++;
                    } else if (gameField[l][k].getIcon().hashCode() != hash) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 1; j < gameField.length; j++) {
            diagSecond = 0;
            for (int i = 0; i < gameField.length; i++) {
                int k = (gameField.length - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k].getIcon().hashCode() == hash) {
                        diagSecond++;
                    } else if (gameField[i][k].getIcon().hashCode() != hash) {
                        diagSecond = 0;
                    }
                }
                if (diagSecond >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }
}
