import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// TO DO



public class OnePlayerGame implements ActionListener {
    JFrame frame = new JFrame();

    String a1Text = "a1";
    String a2Text = "a2";
    String a3Text = "a3";
    String b1Text = "b1";
    String b2Text = "b2";
    String b3Text = "b3";
    String c1Text = "c1";
    String c2Text = "c2";
    String c3Text = "c3";
    String X = "X";
    String O = "O";
    int step = 0;

    JButton a1 = new JButton(a1Text);
    JButton a2 = new JButton(a2Text);
    JButton a3 = new JButton(a3Text);
    JButton b1 = new JButton(b1Text);
    JButton b2 = new JButton(b2Text);
    JButton b3 = new JButton(b3Text);
    JButton c1 = new JButton(c1Text);
    JButton c2 = new JButton(c2Text);
    JButton c3 = new JButton(c3Text);


    OnePlayerGame() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(616, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        a1.setBounds(0, 400, 200, 200);
        a1.setFocusable(false);
        a1.addActionListener(this);
        frame.add(a1);

        a2.setBounds(200, 400, 200, 200);
        a2.setFocusable(false);
        a2.addActionListener(this);
        frame.add(a2);

        a3.setBounds(400, 400, 200, 200);
        a3.setFocusable(false);
        a3.addActionListener(this);
        frame.add(a3);

        b1.setBounds(0, 200, 200, 200);
        b1.setFocusable(false);
        b1.addActionListener(this);
        frame.add(b1);

        b2.setBounds(200, 200, 200, 200);
        b2.setFocusable(false);
        b2.addActionListener(this);
        frame.add(b2);

        b3.setBounds(400, 200, 200, 200);
        b3.setFocusable(false);
        b3.addActionListener(this);
        frame.add(b3);

        c1.setBounds(0, 0, 200, 200);
        c1.setFocusable(false);
        c1.addActionListener(this);
        frame.add(c1);

        c2.setBounds(200, 0, 200, 200);
        c2.setFocusable(false);
        c2.addActionListener(this);
        frame.add(c2);

        c3.setBounds(400, 0, 200, 200);
        c3.setFocusable(false);
        c3.addActionListener(this);

        frame.add(c3);

    }


    @Override
    public void actionPerformed(ActionEvent e) {



        if (e.getSource() == a1 && a1Text.equals("a1")) {
            a1Text = X;
            setX(a1);
            step++;
        }

        if (e.getSource() == a2 && a2Text.equals("a2")) {
            a2Text = X;
            setX(a2);
            step++;
        }

        if (e.getSource() == a3 && a3Text.equals("a3")) {
            a3Text = X;
            setX(a3);
            step++;
        }
        if (e.getSource() == b1 && b1Text.equals("b1")) {
            b1Text = X;
            setX(b1);
            step++;
        }

        if (e.getSource() == b2 && b2Text.equals("b2")) {
            b2Text = X;
            setX(b2);
            step++;
        }

        if (e.getSource() == b3 && b3Text.equals("b3")) {
            b3Text = X;
            setX(b3);
            step++;
        }

        if (e.getSource() == c1 && c1Text.equals("c1")) {
            c1Text = X;
            setX(c1);
            step++;
        }

        if (e.getSource() == c2 && c2Text.equals("c2")) {
            c2Text = X;
            setX(c2);
            step++;
        }

        if (e.getSource() == c3 && c3Text.equals("c3")) {
            c3Text = X;
            setX(c3);
            step++;
        }


/*
        if(step == 1){
            if(b2Text.equals(X)){
                setO(a1);
                a1Text = O;
            } else {
                setO(b2);
                b2Text = O;
            }
        }

        if(step == 2){
            if(b2Text.equals(O)){

            } else {

            }

        }

        if(step == 3){

        }

        if(step == 4){

        }

*/


        if ((a1.getText() == b2.getText() && b2.getText() == c3.getText()) ||
                (a3.getText() == b2.getText() && b2.getText() == c1.getText()) ||
                (a1.getText() == a2.getText() && a2.getText() == a3.getText()) ||
                (b1.getText() == b2.getText() && b2.getText() == b3.getText()) ||
                (c1.getText() == c2.getText() && c2.getText() == c3.getText()) ||
                (a1.getText() == b1.getText() && b1.getText() == c1.getText()) ||
                (a2.getText() == b2.getText() && b2.getText() == c2.getText()) ||
                (a3.getText() == b3.getText() && b3.getText() == c3.getText())) {
            LaunchGame launchGame = new LaunchGame();
            launchGame.label.setText("Player  '" + X + "'  Win");

        } else if (step > 4) {
            LaunchGame launchGame = new LaunchGame();
            launchGame.label.setText("Draw");
        }


    }
    public void setX(JButton button){
        button.setText(X);
        button.setFont(new Font(null, Font.PLAIN, 140));
    }
    public void setO(JButton button){
        button.setText(O);
        button.setFont(new Font(null, Font.PLAIN, 140));
    }

}


