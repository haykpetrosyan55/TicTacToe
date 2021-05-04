import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoPlayerGame implements ActionListener {
    private JButton a1 = new JButton("");
    private JButton a2 = new JButton(" ");
    private JButton a3 = new JButton("  ");
    private JButton b1 = new JButton("   ");
    private JButton b2 = new JButton("    ");
    private JButton b3 = new JButton("     ");
    private JButton c1 = new JButton("      ");
    private JButton c2 = new JButton("       ");
    private JButton c3 = new JButton("        ");

    TwoPlayerGame(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(616,600);
        frame.setLayout(null);
        frame.setVisible(true);

        a1.setBounds(0,400,200,200);
        a1.setFocusable(false);
        a1.addActionListener(this);
        frame.add(a1);

        a2.setBounds(200,400,200,200);
        a2.setFocusable(false);
        a2.addActionListener(this);
        frame.add(a2);

        a3.setBounds(400,400,200,200);
        a3.setFocusable(false);
        a3.addActionListener(this);
        frame.add(a3);

        b1.setBounds(0,200,200,200);
        b1.setFocusable(false);
        b1.addActionListener(this);
        frame.add(b1);

        b2.setBounds(200,200,200,200);
        b2.setFocusable(false);
        b2.addActionListener(this);
        frame.add(b2);

        b3.setBounds(400,200,200,200);
        b3.setFocusable(false);
        b3.addActionListener(this);
        frame.add(b3);

        c1.setBounds(0,0,200,200);
        c1.setFocusable(false);
        c1.addActionListener(this);
        frame.add(c1);

        c2.setBounds(200,0,200,200);
        c2.setFocusable(false);
        c2.addActionListener(this);
        frame.add(c2);

        c3.setBounds(400,0,200,200);
        c3.setFocusable(false);
        c3.addActionListener(this);

        frame.add(c3);

    }
    private String XorO = "X";
    private Boolean isXorO = true;
    private int count = 0;
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==a1 && !a1.getText().equals("X") && !a1.getText().equals("O")) {
            a1.setFont(new Font(null,Font.PLAIN,140));
            a1.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==a2 && !a2.getText().equals("X") && !a2.getText().equals("O")) {
            a2.setFont(new Font(null,Font.PLAIN,140));
            a2.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==a3 && !a3.getText().equals("X") && !a3.getText().equals("O")) {
            a3.setFont(new Font(null,Font.PLAIN,140));
            a3.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==b1 && !b1.getText().equals("X") && !b1.getText().equals("O")) {
            b1.setFont(new Font(null,Font.PLAIN,140));
            b1.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==b2 && !b2.getText().equals("X") && !b2.getText().equals("O")) {
            b2.setFont(new Font(null,Font.PLAIN,140));
            b2.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==b3 && !b3.getText().equals("X") && !b3.getText().equals("O")) {
            b3.setFont(new Font(null,Font.PLAIN,140));
            b3.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==c1 && !c1.getText().equals("X") && !c1.getText().equals("O")) {
            c1.setFont(new Font(null,Font.PLAIN,140));
            c1.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==c2 && !c2.getText().equals("X") && !c2.getText().equals("O")) {
            c2.setFont(new Font(null,Font.PLAIN,140));
            c2.setText(XorO);
            change();
            count++;
        }
        if(e.getSource()==c3 && !c3.getText().equals("X") && !c3.getText().equals("O")) {
            c3.setFont(new Font(null,Font.PLAIN,140));
            c3.setText(XorO);
            change();
            count++;
        }

        if((a1.getText().equals(b2.getText()) && b2.getText().equals(c3.getText())) ||
                (a3.getText().equals(b2.getText()) && b2.getText().equals(c1.getText())) ||
                (a1.getText().equals(a2.getText()) && a2.getText().equals(a3.getText())) ||
                (b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText())) ||
                (c1.getText().equals(c2.getText()) && c2.getText().equals(c3.getText())) ||
                (a1.getText().equals(b1.getText()) && b1.getText().equals(c1.getText())) ||
                (a2.getText().equals(b2.getText()) && b2.getText().equals(c2.getText())) ||
                (a3.getText().equals(b3.getText()) && b3.getText().equals(c3.getText()))){
            change();
            LaunchGame launchGame = new LaunchGame();
            launchGame.label.setText("Player  '" + XorO + "'  Win");

        }else if(count > 8){
            change();
            LaunchGame launchGame = new LaunchGame();
            launchGame.label.setText("Draw");
        }

    }

    private void change() {
        isXorO = !isXorO;
        if (isXorO) {
            XorO = "X";
        } else {
            XorO = "O";
        }
    }
}
