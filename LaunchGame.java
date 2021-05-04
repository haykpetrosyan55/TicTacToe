import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchGame implements ActionListener {
    private JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome To Game X or O!!!", SwingConstants.CENTER);
    private JButton Players_1 = new JButton("1 Player");
    private JButton Players_2 = new JButton("2 Players");

    LaunchGame() {

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(616, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        label.setBounds(50,50,500,200);
        label.setText("Welcome To Game X or O!!!");
        label.setFont(new Font(null,Font.PLAIN,30));
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        frame.add(label);

        JLabel labelNewGame = new JLabel("NEW GAME", SwingConstants.CENTER);
        labelNewGame.setBounds(150,275,300,100);
        labelNewGame.setFont(new Font(null,Font.PLAIN,20));
        labelNewGame.setOpaque(true);
        labelNewGame.setBackground(Color.GREEN);
        frame.add(labelNewGame);

        Players_1.setBounds(200, 400, 200, 50);
        Players_1.setFocusable(false);
        Players_1.addActionListener(this);
        Players_1.setFont(new Font(null, Font.PLAIN, 40));
        frame.add(Players_1);

        Players_2.setBounds(200, 480, 200, 50);
        Players_2.setFocusable(false);
        Players_2.addActionListener(this);
        Players_2.setFont(new Font(null, Font.PLAIN, 40));
        frame.add(Players_2);

    }

    String XorO = "X";
    Boolean isXorO = true;
    int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Players_1) {
            frame.dispose();
            OnePlayerGame onePlayerGame = new OnePlayerGame();
        }

        if (e.getSource() == Players_2) {
            frame.dispose();
            TwoPlayerGame twoPlayerGame = new TwoPlayerGame();

        }
    }
}
