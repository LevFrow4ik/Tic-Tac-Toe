package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameMain extends GameStructure  implements ActionListener {
    public GameMain() {
        frame1.hide();
        frame.setTitle( "Game" );
        frame.setIconImage( Toolkit.getDefaultToolkit().getImage( getClass().getResource( "Логотип Tic-Tac-Toe.png" ) ) );
        frame.setSize( 600, 600 );
        frame.setLocation( 1000, 200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setBackground( Color.BLACK );
        frame.setVisible( true );

        fieldT.setBackground( Color.BLACK );
        fieldT.setForeground( Color.YELLOW );
        fieldT.setText( "            Tic-tac-toe" );
        fieldT.setFont( fontB );
        frame.add( fieldT );

        exit = new JButton();
        exit.setLocation( 0,0 );
        exit.setBackground( Color.black );
        exit.setForeground( Color.YELLOW );
        exit.setSize(70, 27);
        exit.setFont( fontB1 );
        exit.setText( "Exit" );
        fieldT.add( exit );
        exit.addActionListener( new exitAction() );

        buttonsPanel.setBackground( Color.WHITE );
        buttonsPanel.setLayout( new GridLayout( 3, 3 ) );
        buttonsPanel.setVisible( true );
        frame.add( buttonsPanel );

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont( fontB );
            buttons[i].setSize( 25, 25 );
            buttons[i].setBackground( Color.WHITE );
            buttonsPanel.add( buttons[i] );
        }

        frame.add( fieldT, BorderLayout.NORTH );
        startGame();
    }

    public void startGame() {
        times += 1;
        try {
            Thread.sleep( 2000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        player1_turn = new Random().nextBoolean();
        if (player1_turn) {
            fieldT.setText( "              X turn" );
            for (int i = 0; i < 9; i++) {
                buttons[i].addActionListener( this );
            }
        }
        if (!player1_turn) {
            fieldT.setText( "              O turn" );
            for (int i = 0; i < 9; i++) {
                buttons[i].addActionListener( this );
            }
        }

    }

    public void checkIsXWin() {
        for (int i = 0; i < 9; i++) {
            if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[6].getText() == "X" && buttons[4].getText() == "X" && buttons[2].getText() == "X") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }
            if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Xwins();
            }

        }
    }

    public void checkIsOWin() {
        for (int i = 0; i < 9; i++) {
            if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[6].getText() == "O" && buttons[4].getText() == "O" && buttons[2].getText() == "O") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
            if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                Owins();
            }
        }
    }


    public void Xwins() {
        fieldT.setText( "         X is the winner!" );
        ST = new JButton();
        ST.setSize(100,27);
        ST.setLocation( 485, 0 );
        ST.setBackground( Color.black );
        ST.setForeground( Color.YELLOW );
        ST.setFont(fontB1);
        ST.setText("Play again");
        ST.addActionListener( new STaction() );
        fieldT.add(ST);
        //  int ans = JOptionPane.showConfirmDialog( null, "Сыграем заново?", "Крестики-Нолики", JOptionPane.YES_NO_OPTION);
//        switch (ans) {
//            case 0:
//                frame.hide();
//                GameStructure game = new GameStructure();
//                break;
//            case 1:
//                frame.hide();
//                JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//                System.exit( 0 );
//        }
//        if(ans == JOptionPane.YES_OPTION) {
//            frame.hide();
//            GameStructure game = new GameStructure();
//
//        }
//        if(ans == JOptionPane.NO_OPTION) {
//            frame.hide();
//            JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//            System.exit( 0 );
//        }
    }


    public void Owins() {
        fieldT.setText( "         O is the winner!" );
        ST = new JButton();
        ST.setSize(100,27);
        ST.setLocation( 485, 0 );
        ST.setBackground( Color.black );
        ST.setForeground( Color.YELLOW );
        ST.setFont(fontB1);
        ST.setText("Play again");
        ST.addActionListener( new STaction() );
        fieldT.add(ST);
//        int ans = JOptionPane.showConfirmDialog( null, "Сыграем заново?", "Крестики-Нолики", JOptionPane.YES_NO_OPTION);
//        switch (ans) {
//            case 0:
//                frame.hide();
//                startGame();
//                break;
//            case 1:
//                frame.hide();
//                JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//                System.exit( 0 );
//
//       }
//        if(ans == JOptionPane.YES_OPTION) {
//            frame.hide();
//            GameStructure game = new GameStructure();
//        }
//        if(ans == JOptionPane.NO_OPTION) {
//            frame.hide();
//            JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//            System.exit( 0 );
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    System.out.println(times);
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground( new Color( 139, 0, 0 ) );
                        buttons[i].setText( "X" );
                        player1_turn = false;
                        fieldT.setText( "              O turn" );
                        checkIsXWin();
                    }
                } else {
                    System.out.println(times);
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground( new Color( 0, 0, 128 ) );
                        buttons[i].setText( "O" );
                        player1_turn = true;
                        fieldT.setText( "              X turn" );
                        checkIsOWin();
                    }
                }

            }
        }

    }

    private class STaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                buttons[i].setText("");
                buttons[i].setBackground( Color.WHITE );
            }
            startGame();
        }
    }

    private class exitAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.hide();
            GameStructure gameAgain = new GameStructure();
        }
    }
}

