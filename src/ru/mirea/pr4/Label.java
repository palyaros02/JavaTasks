package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Label extends JFrame {

    public static void main(String[] args) {
        new Label();
    }

    int MilanScore  = 0,
        MadridScore = 0;

    JLabel result = new JLabel("Result:");
    JLabel resultScore = new JLabel("0 : 0");
    JLabel score  = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    Font font = new Font("Consolas", Font.BOLD, 35);

    public void printWinner() {
        if (MilanScore > MadridScore) {
            winner.setText("Winner: AC Milan");
        } else if (MilanScore == MadridScore) {
            winner.setText("DRAW");
        } else {
            winner.setText("Winner: Real Madrid");
        }
    }

    public void JLabelStyle(JLabel jlabel) {
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setFont(font);
    }

    private void updateResult(){
        resultScore.setText(MadridScore + " : " + MilanScore);
        printWinner();
    }

    Label() {
        JButton ACMilan    = new JButton(   "<html>" +
                "<font size=15>" +
                "<p align=\"center\">" +
                "AC Milan");
        JButton RealMadrid = new JButton("<html>" +
                "<font size=15>" +
                "<p align=\"center\">" +
                "Real Madrid");

        add(ACMilan); add(RealMadrid);

        setLayout(null);
        setSize(470,215);
        setLayout(new BorderLayout());
        setResizable(false);

        ACMilan.setPreferredSize(new Dimension(150, 80));
        RealMadrid.setPreferredSize(new Dimension(150, 80));

        ACMilan.setFocusable(false);
        ACMilan.setBorderPainted(true);
        RealMadrid.setFocusable(false);
        RealMadrid.setBorderPainted(true);

        // AC Milan
        add(ACMilan, BorderLayout.EAST);
        ACMilan.addActionListener(event->{
            MilanScore++;
            updateResult();
            score.setText("Last score: AC Milan");
        });

        // Real Madrid
        add(RealMadrid, BorderLayout.WEST);
        RealMadrid.addActionListener(event->{
            MadridScore++;
            updateResult();
            score.setText("Last score: Real Madrid");
        });

        JPanel resultPanel = new JPanel();
        resultPanel.setPreferredSize(new Dimension(50, 50));
        add(resultPanel, BorderLayout.CENTER);
        resultPanel.add(result, BorderLayout.CENTER);
        resultPanel.add(resultScore, BorderLayout.SOUTH);
        JLabelStyle(result);
        JLabelStyle(resultScore);
        /*

        add(result, BorderLayout.CENTER);
        JLabelStyle(result);

        add(resultScore, BorderLayout.CENTER);
        JLabelStyle(resultScore);
*/
        add(winner, BorderLayout.NORTH);
        JLabelStyle(winner);

        add(score, BorderLayout.SOUTH);
        JLabelStyle(score);

        setVisible(true);
    }


}